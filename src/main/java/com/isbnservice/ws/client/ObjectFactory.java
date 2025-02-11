
package com.isbnservice.ws.client;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isbnservice.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isbnservice.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsValidISBN13 }
     * 
     */
    public IsValidISBN13 createIsValidISBN13() {
        return new IsValidISBN13();
    }

    /**
     * Create an instance of {@link IsValidISBN13Response }
     * 
     */
    public IsValidISBN13Response createIsValidISBN13Response() {
        return new IsValidISBN13Response();
    }

    /**
     * Create an instance of {@link IsValidISBN10 }
     * 
     */
    public IsValidISBN10 createIsValidISBN10() {
        return new IsValidISBN10();
    }

    /**
     * Create an instance of {@link IsValidISBN10Response }
     * 
     */
    public IsValidISBN10Response createIsValidISBN10Response() {
        return new IsValidISBN10Response();
    }

}
