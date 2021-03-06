//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.02 at 05:06:50 PM WAT 
//


package org.sample_xsd.sample.process;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sample_xsd.sample.process package. 
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

    private final static QName _SampleProcess_QNAME = new QName("http://sample-xsd.org/sample/process", "sampleProcess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sample_xsd.sample.process
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Execution }
     * 
     */
    public Execution createExecution() {
        return new Execution();
    }

    /**
     * Create an instance of {@link Hook }
     * 
     */
    public Hook createHook() {
        return new Hook();
    }

    /**
     * Create an instance of {@link SampleProcess }
     * 
     */
    public SampleProcess createSampleProcess() {
        return new SampleProcess();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sample-xsd.org/sample/process", name = "sampleProcess")
    public JAXBElement<SampleProcess> createSampleProcess(SampleProcess value) {
        return new JAXBElement<SampleProcess>(_SampleProcess_QNAME, SampleProcess.class, null, value);
    }

}
