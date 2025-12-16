package sX0;

import com.fasterxml.jackson.databind.deser.std.p;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* compiled from: DOMDeserializer.java */
/* renamed from: sX0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC48121c<T> extends p<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final DocumentBuilderFactory f437698f;
    private static final long serialVersionUID = 1;

    /* compiled from: DOMDeserializer.java */
    /* renamed from: sX0.c$a */
    public static class a extends AbstractC48121c<Document> {
        private static final long serialVersionUID = 1;

        public a() {
            super(Document.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p
        public final Object q0(com.fasterxml.jackson.databind.f fVar, String str) {
            return AbstractC48121c.w0(str);
        }
    }

    /* compiled from: DOMDeserializer.java */
    /* renamed from: sX0.c$b */
    public static class b extends AbstractC48121c<Node> {
        private static final long serialVersionUID = 1;

        public b() {
            super(Node.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p
        public final Object q0(com.fasterxml.jackson.databind.f fVar, String str) {
            return AbstractC48121c.w0(str);
        }
    }

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused2) {
        }
        try {
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused3) {
        }
        f437698f = documentBuilderFactoryNewInstance;
    }

    public AbstractC48121c() {
        throw null;
    }

    public static Document w0(String str) {
        try {
            return f437698f.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e12) {
            throw new IllegalArgumentException("Failed to parse JSON String as XML: " + e12.getMessage(), e12);
        }
    }
}
