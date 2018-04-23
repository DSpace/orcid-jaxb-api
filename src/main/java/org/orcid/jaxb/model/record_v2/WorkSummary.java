//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.24 at 11:17:38 AM CDT 
//


package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v2.CreatedDate;
import org.orcid.jaxb.model.common_v2.ElementSummary;
import org.orcid.jaxb.model.common_v2.ExternalIds;
import org.orcid.jaxb.model.common_v2.FuzzyDate;
import org.orcid.jaxb.model.common_v2.LastModifiedDate;
import org.orcid.jaxb.model.common_v2.SourceType;
import org.orcid.jaxb.model.common_v2.Visibility;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orcid.org/ns/common}element-summary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.orcid.org/ns/work}work-title"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}external-ids" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.orcid.org/ns/work}work-type"/&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}publication-date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "externalIds",
    "type",
    "publicationDate"
})
@XmlRootElement(name = "work-summary", namespace = "http://www.orcid.org/ns/work")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
public class WorkSummary
    extends ElementSummary
    implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.orcid.org/ns/work", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected WorkTitle title;
    @XmlElement(name = "external-ids", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected ExternalIds externalIds;
    @XmlElement(namespace = "http://www.orcid.org/ns/work", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected WorkType type;
    @XmlElement(name = "publication-date", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected FuzzyDate publicationDate;

    /**
     * Default no-arg constructor
     * 
     */
    public WorkSummary() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WorkSummary(final CreatedDate createdDate, final LastModifiedDate lastModifiedDate, final SourceType source, final BigInteger putCode, final Visibility visibility, final String displayIndex, final String path, final WorkTitle title, final ExternalIds externalIds, final WorkType type, final FuzzyDate publicationDate) {
        super(createdDate, lastModifiedDate, source, putCode, visibility, displayIndex, path);
        this.title = title;
        this.externalIds = externalIds;
        this.type = type;
        this.publicationDate = publicationDate;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTitle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public WorkTitle getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTitle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setTitle(WorkTitle value) {
        this.title = value;
    }

    /**
     * Gets the value of the externalIds property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    /**
     * Sets the value of the externalIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setExternalIds(ExternalIds value) {
        this.externalIds = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WorkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public WorkType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setType(WorkType value) {
        this.type = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public FuzzyDate getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setPublicationDate(FuzzyDate value) {
        this.publicationDate = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            WorkTitle theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            ExternalIds theExternalIds;
            theExternalIds = this.getExternalIds();
            strategy.appendField(locator, this, "externalIds", buffer, theExternalIds);
        }
        {
            WorkType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            FuzzyDate thePublicationDate;
            thePublicationDate = this.getPublicationDate();
            strategy.appendField(locator, this, "publicationDate", buffer, thePublicationDate);
        }
        return buffer;
    }

}