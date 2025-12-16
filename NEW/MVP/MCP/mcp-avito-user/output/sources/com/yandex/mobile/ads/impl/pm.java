package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.im;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class pm implements rm1<im> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f388885a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final g90 f388886b = new g90();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final mm f388887c;

    public pm(@j.N Context context) {
        this.f388887c = new mm(context);
    }

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.P
    public final im a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f388885a.getClass();
        xmlPullParser.require(2, null, "Creative");
        this.f388885a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        im.a aVar = new im.a();
        aVar.b(attributeValue);
        boolean z12 = false;
        while (true) {
            this.f388885a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f388885a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Linear".equals(name)) {
                    this.f388886b.a(xmlPullParser, aVar);
                    z12 = true;
                } else if ("CreativeExtensions".equals(name)) {
                    aVar.a(this.f388887c.a(xmlPullParser));
                } else {
                    this.f388885a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
        if (z12) {
            return aVar.a();
        }
        return null;
    }
}
