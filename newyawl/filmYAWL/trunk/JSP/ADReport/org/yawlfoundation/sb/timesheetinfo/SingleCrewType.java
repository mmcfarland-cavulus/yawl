//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.21 at 04:49:32 PM EST 
//


package org.yawlfoundation.sb.timesheetinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for singleCrewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleCrewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crew" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="call_scheduled" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="call_actualArrival" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="mealBreak" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="timeWrap" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="departLoc" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleCrewType", propOrder = {
    "crew",
    "callScheduled",
    "callActualArrival",
    "mealBreak",
    "timeWrap",
    "departLoc",
    "remarks"
})
public class SingleCrewType {

    @XmlElement(required = true)
    protected String crew;
    @XmlElement(name = "call_scheduled", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar callScheduled;
    @XmlElement(name = "call_actualArrival", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar callActualArrival;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mealBreak;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeWrap;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departLoc;
    @XmlElement(required = true)
    protected String remarks;

    /**
     * Gets the value of the crew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrew() {
        return crew;
    }

    /**
     * Sets the value of the crew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrew(String value) {
        this.crew = value;
    }

    /**
     * Gets the value of the callScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallScheduled() {
        return callScheduled;
    }

    /**
     * Sets the value of the callScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallScheduled(XMLGregorianCalendar value) {
        this.callScheduled = value;
    }

    /**
     * Gets the value of the callActualArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallActualArrival() {
        return callActualArrival;
    }

    /**
     * Sets the value of the callActualArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallActualArrival(XMLGregorianCalendar value) {
        this.callActualArrival = value;
    }

    /**
     * Gets the value of the mealBreak property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMealBreak() {
        return mealBreak;
    }

    /**
     * Sets the value of the mealBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMealBreak(XMLGregorianCalendar value) {
        this.mealBreak = value;
    }

    /**
     * Gets the value of the timeWrap property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeWrap() {
        return timeWrap;
    }

    /**
     * Sets the value of the timeWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeWrap(XMLGregorianCalendar value) {
        this.timeWrap = value;
    }

    /**
     * Gets the value of the departLoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartLoc() {
        return departLoc;
    }

    /**
     * Sets the value of the departLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartLoc(XMLGregorianCalendar value) {
        this.departLoc = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
