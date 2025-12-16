package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* compiled from: Html.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/m;", "Lorg/xml/sax/ContentHandler;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22663m implements ContentHandler {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ContentHandler f42499a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Editable f42500b;

    /* renamed from: c, reason: collision with root package name */
    public int f42501c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public r f42502d;

    public C22663m(@Y61.k ContentHandler contentHandler, @Y61.k Editable editable) {
        this.f42499a = contentHandler;
        this.f42500b = editable;
    }

    public final void a() {
        r rVar = this.f42502d;
        if (rVar != null) {
            Editable editable = this.f42500b;
            editable.setSpan(rVar, rVar.f42623c, editable.length(), 33);
        }
        this.f42502d = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i12, int i13) throws SAXException {
        this.f42499a.characters(cArr, i12, i13);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.f42499a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.f42501c--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.f42500b;
                Object[] spans = editable.getSpans(0, editable.length(), C22664n.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    if (editable.getSpanFlags((C22664n) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C22664n c22664n = (C22664n) arrayList.get(i12);
                    int spanStart = editable.getSpanStart(c22664n);
                    int length = editable.length();
                    editable.removeSpan(c22664n);
                    if (spanStart != length) {
                        editable.setSpan(c22664n, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.f42499a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.f42499a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i12, int i13) throws SAXException {
        this.f42499a.ignorableWhitespace(cArr, i12, i13);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f42499a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f42499a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.f42499a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.f42499a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            Editable editable = this.f42500b;
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        a();
                        this.f42501c++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    a();
                    this.f42502d = new r(C22670q.f42615a, this.f42501c, editable.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i12 = 0; i12 < length; i12++) {
                        String localName = attributes.getLocalName(i12);
                        if (localName == null) {
                            localName = "";
                        }
                        String value = attributes.getValue(i12);
                        String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            int length2 = editable.length();
                            editable.setSpan(new C22664n(), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.f42499a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f42499a.startPrefixMapping(str, str2);
    }
}
