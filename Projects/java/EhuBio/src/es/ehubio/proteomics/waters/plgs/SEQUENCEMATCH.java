//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.16 at 04:53:00 PM CET 
//


package es.ehubio.proteomics.waters.plgs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}FRAGMENT_ION" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="COVERAGE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="END" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="FRAG_STRING" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="RMS_MASS_ERROR_PROD" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="RMS_RT_ERROR_PROD" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="START" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fragmention"
})
@XmlRootElement(name = "SEQUENCE_MATCH")
public class SEQUENCEMATCH {

    @XmlElement(name = "FRAGMENT_ION")
    protected FRAGMENTION fragmention;
    @XmlAttribute(name = "COVERAGE", required = true)
    protected BigDecimal coverage;
    @XmlAttribute(name = "END", required = true)
    protected BigInteger end;
    @XmlAttribute(name = "FRAG_STRING", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fragstring;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "RMS_MASS_ERROR_PROD", required = true)
    protected BigDecimal rmsmasserrorprod;
    @XmlAttribute(name = "RMS_RT_ERROR_PROD", required = true)
    protected BigDecimal rmsrterrorprod;
    @XmlAttribute(name = "START", required = true)
    protected BigInteger start;

    /**
     * Gets the value of the fragmention property.
     * 
     * @return
     *     possible object is
     *     {@link FRAGMENTION }
     *     
     */
    public FRAGMENTION getFRAGMENTION() {
        return fragmention;
    }

    /**
     * Sets the value of the fragmention property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRAGMENTION }
     *     
     */
    public void setFRAGMENTION(FRAGMENTION value) {
        this.fragmention = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOVERAGE() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOVERAGE(BigDecimal value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEND(BigInteger value) {
        this.end = value;
    }

    /**
     * Gets the value of the fragstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRAGSTRING() {
        return fragstring;
    }

    /**
     * Sets the value of the fragstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRAGSTRING(String value) {
        this.fragstring = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the rmsmasserrorprod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRMSMASSERRORPROD() {
        return rmsmasserrorprod;
    }

    /**
     * Sets the value of the rmsmasserrorprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRMSMASSERRORPROD(BigDecimal value) {
        this.rmsmasserrorprod = value;
    }

    /**
     * Gets the value of the rmsrterrorprod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRMSRTERRORPROD() {
        return rmsrterrorprod;
    }

    /**
     * Sets the value of the rmsrterrorprod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRMSRTERRORPROD(BigDecimal value) {
        this.rmsrterrorprod = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTART(BigInteger value) {
        this.start = value;
    }

}
