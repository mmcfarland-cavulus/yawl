//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.22 at 10:45:47 AM EST 
//


package org.yawlfoundation.sb.camerainfo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cameraInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cameraInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sheetNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="projectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="studios_location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="techInfo" type="{http://www.yawlfoundation.org/sb/cameraInfo}techInfoType"/>
 *         &lt;element name="slateInfo" type="{http://www.yawlfoundation.org/sb/cameraInfo}slateInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="camInfoSum_1" type="{http://www.yawlfoundation.org/sb/cameraInfo}camInfoSumType_1"/>
 *         &lt;element name="camInfoSum_2" type="{http://www.yawlfoundation.org/sb/cameraInfo}camInfoSumType_2"/>
 *         &lt;element name="camInfoSum_3" type="{http://www.yawlfoundation.org/sb/cameraInfo}camInfoSumType_3"/>
 *         &lt;element name="instructionsToLab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureOfCameraAssistant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cameraInfoType", propOrder = {
    "sheetNumber",
    "projectNumber",
    "studiosLocation",
    "techInfo",
    "slateInfo",
    "camInfoSum1",
    "camInfoSum2",
    "camInfoSum3",
    "instructionsToLab",
    "signatureOfCameraAssistant"
})
public class CameraInfoType {

    @XmlElement(required = true)
    protected BigInteger sheetNumber;
    @XmlElement(required = true)
    protected String projectNumber;
    @XmlElement(name = "studios_location", required = true)
    protected String studiosLocation;
    @XmlElement(required = true)
    protected TechInfoType techInfo;
    @XmlElement(required = true)
    protected List<SlateInfoType> slateInfo;
    @XmlElement(name = "camInfoSum_1", required = true)
    protected CamInfoSumType1 camInfoSum1;
    @XmlElement(name = "camInfoSum_2", required = true)
    protected CamInfoSumType2 camInfoSum2;
    @XmlElement(name = "camInfoSum_3", required = true)
    protected CamInfoSumType3 camInfoSum3;
    @XmlElement(required = true)
    protected String instructionsToLab;
    @XmlElement(required = true)
    protected String signatureOfCameraAssistant;

    /**
     * Gets the value of the sheetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSheetNumber() {
        return sheetNumber;
    }

    /**
     * Sets the value of the sheetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSheetNumber(BigInteger value) {
        this.sheetNumber = value;
    }

    /**
     * Gets the value of the projectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectNumber() {
        return projectNumber;
    }

    /**
     * Sets the value of the projectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectNumber(String value) {
        this.projectNumber = value;
    }

    /**
     * Gets the value of the studiosLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudiosLocation() {
        return studiosLocation;
    }

    /**
     * Sets the value of the studiosLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudiosLocation(String value) {
        this.studiosLocation = value;
    }

    /**
     * Gets the value of the techInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TechInfoType }
     *     
     */
    public TechInfoType getTechInfo() {
        return techInfo;
    }

    /**
     * Sets the value of the techInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechInfoType }
     *     
     */
    public void setTechInfo(TechInfoType value) {
        this.techInfo = value;
    }

    /**
     * Gets the value of the slateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlateInfoType }
     * 
     * 
     */
    public List<SlateInfoType> getSlateInfo() {
        if (slateInfo == null) {
            slateInfo = new ArrayList<SlateInfoType>();
        }
        return this.slateInfo;
    }

    /**
     * Gets the value of the camInfoSum1 property.
     * 
     * @return
     *     possible object is
     *     {@link CamInfoSumType1 }
     *     
     */
    public CamInfoSumType1 getCamInfoSum1() {
        return camInfoSum1;
    }

    /**
     * Sets the value of the camInfoSum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CamInfoSumType1 }
     *     
     */
    public void setCamInfoSum1(CamInfoSumType1 value) {
        this.camInfoSum1 = value;
    }

    /**
     * Gets the value of the camInfoSum2 property.
     * 
     * @return
     *     possible object is
     *     {@link CamInfoSumType2 }
     *     
     */
    public CamInfoSumType2 getCamInfoSum2() {
        return camInfoSum2;
    }

    /**
     * Sets the value of the camInfoSum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CamInfoSumType2 }
     *     
     */
    public void setCamInfoSum2(CamInfoSumType2 value) {
        this.camInfoSum2 = value;
    }

    /**
     * Gets the value of the camInfoSum3 property.
     * 
     * @return
     *     possible object is
     *     {@link CamInfoSumType3 }
     *     
     */
    public CamInfoSumType3 getCamInfoSum3() {
        return camInfoSum3;
    }

    /**
     * Sets the value of the camInfoSum3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CamInfoSumType3 }
     *     
     */
    public void setCamInfoSum3(CamInfoSumType3 value) {
        this.camInfoSum3 = value;
    }

    /**
     * Gets the value of the instructionsToLab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionsToLab() {
        return instructionsToLab;
    }

    /**
     * Sets the value of the instructionsToLab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionsToLab(String value) {
        this.instructionsToLab = value;
    }

    /**
     * Gets the value of the signatureOfCameraAssistant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureOfCameraAssistant() {
        return signatureOfCameraAssistant;
    }

    /**
     * Sets the value of the signatureOfCameraAssistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureOfCameraAssistant(String value) {
        this.signatureOfCameraAssistant = value;
    }

}
