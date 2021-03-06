
package com.arx.sapiws.spml._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.spml._2._0.DeleteRequestType;


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
 *         &lt;element ref="{urn:oasis:names:tc:SPML:2:0}deleteRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deleteRequest"
})
@XmlRootElement(name = "delete")
public class Delete {

    @XmlElement(namespace = "urn:oasis:names:tc:SPML:2:0")
    protected DeleteRequestType deleteRequest;

    /**
     * Gets the value of the deleteRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRequestType }
     *     
     */
    public DeleteRequestType getDeleteRequest() {
        return deleteRequest;
    }

    /**
     * Sets the value of the deleteRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRequestType }
     *     
     */
    public void setDeleteRequest(DeleteRequestType value) {
        this.deleteRequest = value;
    }

}
