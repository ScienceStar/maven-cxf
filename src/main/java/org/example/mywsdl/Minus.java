
package org.example.mywsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for minus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="minus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minus", propOrder = {
    "c",
    "d"
})
public class Minus {

    protected int c;
    protected int d;

    /**
     * Gets the value of the c property.
     * 
     */
    public int getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     */
    public void setC(int value) {
        this.c = value;
    }

    /**
     * Gets the value of the d property.
     * 
     */
    public int getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(int value) {
        this.d = value;
    }

}
