package sX0;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.M;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/* compiled from: DOMSerializer.java */
/* renamed from: sX0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48122d extends M<Node> {

    /* renamed from: d, reason: collision with root package name */
    public final TransformerFactory f437699d;

    public C48122d() throws TransformerConfigurationException, TransformerFactoryConfigurationError {
        super(Node.class);
        try {
            TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
            this.f437699d = transformerFactoryNewInstance;
            transformerFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e12) {
            throw new IllegalStateException("Could not instantiate `TransformerFactory`: " + e12.getMessage(), e12);
        }
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) throws TransformerException, JsonMappingException, IllegalArgumentException {
        Node node = (Node) obj;
        try {
            Transformer transformerNewTransformer = this.f437699d.newTransformer();
            transformerNewTransformer.setOutputProperty("omit-xml-declaration", "yes");
            transformerNewTransformer.setOutputProperty("indent", "no");
            StreamResult streamResult = new StreamResult(new StringWriter());
            transformerNewTransformer.transform(new DOMSource(node), streamResult);
            jsonGenerator.i0(streamResult.getWriter().toString());
        } catch (TransformerConfigurationException e12) {
            throw new IllegalStateException("Could not create XML Transformer for writing DOM `Node` value: " + e12.getMessage(), e12);
        } catch (TransformerException e13) {
            Object[] objArr = {e13.getMessage()};
            a12.getClass();
            throw new JsonMappingException(a12.y(), String.format("DOM `Node` value serialization failed: %s", objArr), e13);
        }
    }
}
