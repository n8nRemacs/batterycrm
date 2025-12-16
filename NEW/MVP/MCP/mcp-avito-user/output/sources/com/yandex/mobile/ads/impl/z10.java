package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.y10;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class z10 implements rm1<y10> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f392148a = new sm1();

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.N
    public final y10 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f392148a.getClass();
        xmlPullParser.require(2, null, "Icon");
        y10.a aVar = new y10.a();
        this.f392148a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        this.f392148a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        this.f392148a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        this.f392148a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f392148a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f392148a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f392148a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "offset");
        this.f392148a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            this.f392148a.getClass();
            if (xmlPullParser.next() == 3) {
                return aVar.f(attributeValue).c(attributeValue2).j(attributeValue3).d(attributeValue4).i(attributeValue5).a(attributeValue6).e(attributeValue7).b(attributeValue8).a();
            }
            this.f392148a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                Iterator it = Arrays.asList(y10.b.values()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.f392148a.getClass();
                        sm1.d(xmlPullParser);
                        break;
                    }
                    if (((y10.b) it.next()).f391895a.equals(name)) {
                        this.f392148a.getClass();
                        aVar.g(name).h(sm1.c(xmlPullParser));
                        break;
                    }
                }
            }
        }
    }
}
