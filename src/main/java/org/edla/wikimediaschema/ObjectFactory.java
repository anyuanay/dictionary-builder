//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.17 at 05:29:25 PM CET 
//


package org.edla.wikimediaschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.edla.wikimediaschema package. 
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

    private final static QName _Mediawiki_QNAME = new QName("http://www.mediawiki.org/xml/export-0.6/", "mediawiki");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.edla.wikimediaschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MediaWikiType }
     * 
     */
    public MediaWikiType createMediaWikiType() {
        return new MediaWikiType();
    }

    /**
     * Create an instance of {@link NamespacesType }
     * 
     */
    public NamespacesType createNamespacesType() {
        return new NamespacesType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link ContributorType }
     * 
     */
    public ContributorType createContributorType() {
        return new ContributorType();
    }

    /**
     * Create an instance of {@link RevisionType }
     * 
     */
    public RevisionType createRevisionType() {
        return new RevisionType();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link PageType }
     * 
     */
    public PageType createPageType() {
        return new PageType();
    }

    /**
     * Create an instance of {@link UploadType }
     * 
     */
    public UploadType createUploadType() {
        return new UploadType();
    }

    /**
     * Create an instance of {@link NamespaceType }
     * 
     */
    public NamespaceType createNamespaceType() {
        return new NamespaceType();
    }

    /**
     * Create an instance of {@link SiteInfoType }
     * 
     */
    public SiteInfoType createSiteInfoType() {
        return new SiteInfoType();
    }

    /**
     * Create an instance of {@link DiscussionThreadingInfo }
     * 
     */
    public DiscussionThreadingInfo createDiscussionThreadingInfo() {
        return new DiscussionThreadingInfo();
    }

    /**
     * Create an instance of {@link LogItemType }
     * 
     */
    public LogItemType createLogItemType() {
        return new LogItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaWikiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mediawiki.org/xml/export-0.6/", name = "mediawiki")
    public JAXBElement<MediaWikiType> createMediawiki(MediaWikiType value) {
        return new JAXBElement<MediaWikiType>(_Mediawiki_QNAME, MediaWikiType.class, null, value);
    }

}
