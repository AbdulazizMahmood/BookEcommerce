
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
 *         &lt;element name="IsValidISBN13Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isValidISBN13Result"
})
@XmlRootElement(name = "IsValidISBN13Response")
public class IsValidISBN13Response {

    @XmlElement(name = "IsValidISBN13Result")
    protected boolean isValidISBN13Result;

    /**
     * Gets the value of the isValidISBN13Result property.
     * 
     */
    public boolean isIsValidISBN13Result() {
        return isValidISBN13Result;
    }

    /**
     * Sets the value of the isValidISBN13Result property.
     * 
     */
    public void setIsValidISBN13Result(boolean value) {
        this.isValidISBN13Result = value;
    }

}
