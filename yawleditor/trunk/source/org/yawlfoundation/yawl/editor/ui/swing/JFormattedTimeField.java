/*
 * Copyright (c) 2004-2013 The YAWL Foundation. All rights reserved.
 * The YAWL Foundation is a collaboration of individuals and
 * organisations who are committed to improving workflow technology.
 *
 * This file is part of YAWL. YAWL is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation.
 *
 * YAWL is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with YAWL. If not, see <http://www.gnu.org/licenses/>.
 */

package org.yawlfoundation.yawl.editor.ui.swing;

import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

public class JFormattedTimeField extends JFormattedSelectField {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected Date dateValue;
  protected BoundVerifier verifier;
  public static final SimpleDateFormat TIMESTAMP_FORMAT = new SimpleDateFormat("hhmmss");

  public JFormattedTimeField(String format, int columns) {
    super(getDateFormatter(format));
    initialise(format, new Date(), columns);
  }

  public JFormattedTimeField(String format, Date date, int columns) {
    super(getDateFormatter(format));
    initialise(format, date, columns);
  }
  
  private void initialise(String format, Date date, int columns) {
    assert isDateFormat(format) : "Format String parameter is not a date format";
    
    verifier = new BoundVerifier();
    setInputVerifier(verifier);
    setValue(date);
    setColumns(columns);
  }
  
  public Date getDate() {
    return (Date) getValue();
  }

  public void setDate(Date date) {
    setValue(date);
  }
  
  public String getTimestamp() {
     return TIMESTAMP_FORMAT.format((Date) getValue());
  }
  
  public void setDateViaTimestamp(String timestamp) {
    try {
      setValue(TIMESTAMP_FORMAT.parse(timestamp));
    } catch (Exception e) {}
  }
  
  private static boolean isDateFormat(String format) {
    return true;
  }

  private static DateFormatter getDateFormatter(String format) {
    SimpleDateFormat dateFormat = new SimpleDateFormat(format);
    dateFormat.set2DigitYearStart(new Date(0));

    StrictTimeFormatter timeFormatter = new StrictTimeFormatter(dateFormat);

    return timeFormatter;
  }
  
  
  public void setLowerBound(Date lowerBound) {
    verifier.setLowerBound(lowerBound);
  }

  public void setUpperBound(Date upperBound) {
    verifier.setUpperBound(upperBound);
  }

  public void setBounds(Date lowerBound, Date upperBound) {
    verifier.setBounds(lowerBound, upperBound);
  }

  
  class BoundVerifier extends InputVerifier {
    protected Date lowerBound;
    protected Date upperBound;

    public BoundVerifier() {
      super();
      setBounds(new Date(Long.MIN_VALUE), new Date(Long.MAX_VALUE));
    }

    public BoundVerifier(Date lowerBound, Date upperBound) {
      super();
      setBounds(lowerBound, upperBound);
    }

    public boolean verify(JComponent component) {
      Date value;

      assert component instanceof JFormattedTimeField;

      JFormattedTimeField field = (JFormattedTimeField) component;

      String valueAsText;
      
      try {
         valueAsText = field.getText();
         DateFormatter dateFormatter = (DateFormatter) field.getFormatter();
         SimpleDateFormat dateFormat = (SimpleDateFormat) dateFormatter.getFormat();
         value = dateFormat.parse(valueAsText);
       } catch (ParseException npe) {
           return false;
       }
       return verifyBounds(value);
    }

    protected boolean verifyBounds(Date date) {
      if (date.before(lowerBound)) {
        return false;
      }
      if (date.after(upperBound)) {
        return false;
      }
      return true;
    }

    public boolean shouldYieldFocus(JComponent component) {
      boolean isValid = verify(component);
      if (!isValid) {
        JFormattedTimeField field = (JFormattedTimeField) component;
        field.invalidEdit();
      }
      return isValid;
    }

    public void setLowerBound(Date lowerBound) {
      this.lowerBound = lowerBound;
    }

    public void setUpperBound(Date upperBound) {
      this.upperBound = upperBound;
    }

    public void setBounds(Date lowerBound, Date upperBound) {
      setLowerBound(lowerBound);
      setUpperBound(upperBound);
    }
  }
}


class StrictTimeFormatter extends DateFormatter {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private static final TimeFilter filter = new TimeFilter();

  public StrictTimeFormatter(SimpleDateFormat format) {
    super(format);
  }

  protected DocumentFilter getDocumentFilter() {
    return  filter;
  }
}


class TimeFilter extends DocumentFilter {

  public void replace(DocumentFilter.FilterBypass bypass,
                      int offset,
                      int length,
                      String text,
                      AttributeSet attributes) throws BadLocationException {
    if (isValidText(text))
      super.replace(bypass,offset,length,text,attributes);
  }

  protected boolean isValidText(String text) {
    return validateText("0123456789:AMP ", text);
  }

  protected boolean validateText(String validCharacters, String text) {
    // separated into another method so I can switch in a new one for differing
    // valid character sets.
    for (int i = 0; i < text.length(); i++) {
      if (validCharacters.indexOf(text.charAt(i)) == -1) {
        return false;
      }
    }
    return true;
  }
}
