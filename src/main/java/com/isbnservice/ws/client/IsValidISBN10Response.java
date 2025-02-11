
package com.isbnservice.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsValidISBN10Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isValidISBN10Result"
})
@XmlRootElement(name = "IsValidISBN10Response")
public class IsValidISBN10Response {

    @XmlElement(name = "IsValidISBN10Result")
    protected boolean isValidISBN10Result;

    /**
     * Gets the value of the isValidISBN10Result property.
     * 
     */
    public boolean isIsValidISBN10Result() {
        return isValidISBN10Result;
    }

    /**
     * Sets the value of the isValidISBN10Result property.
     * 
     */
    public void setIsValidISBN10Result(boolean value) {
        this.isValidISBN10Result = value;
    }

}
