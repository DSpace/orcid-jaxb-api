//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 07:22:19 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.error_v3.Error;


/**
 * <p>Java class for bulk element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="bulk"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.orcid.org/ns/work}work" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.orcid.org/ns/error}error" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "workOrError"
})
@XmlRootElement(name = "bulk", namespace = "http://www.orcid.org/ns/bulk")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
public class WorkBulk implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "work", namespace = "http://www.orcid.org/ns/work", type = Work.class),
        @XmlElement(name = "error", namespace = "http://www.orcid.org/ns/error", type = Error.class)
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    protected List<Serializable> workOrError;

    /**
     * Default no-arg constructor
     * 
     */
    public WorkBulk() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WorkBulk(final List<Serializable> workOrError) {
        this.workOrError = workOrError;
    }

    /**
     * Gets the value of the workOrError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workOrError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkOrError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Work }
     * {@link Error }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public List<Serializable> getWorkOrError() {
        if (workOrError == null) {
            workOrError = new ArrayList<Serializable>();
        }
        return this.workOrError;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public void setWorkOrError(List<Serializable> value) {
        this.workOrError = null;
        if (value!= null) {
            List<Serializable> draftl = this.getWorkOrError();
            draftl.addAll(value);
        }
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-03T07:22:19+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Serializable> theWorkOrError;
            theWorkOrError = (((this.workOrError!= null)&&(!this.workOrError.isEmpty()))?this.getWorkOrError():null);
            strategy.appendField(locator, this, "workOrError", buffer, theWorkOrError);
        }
        return buffer;
    }

}