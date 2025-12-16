package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class vj1 implements rm1<uj1> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f390901a = new sm1();

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uj1 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f390901a.getClass();
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f390901a.getClass();
            if (xmlPullParser.next() == 3) {
                return new uj1(arrayList);
            }
            this.f390901a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Viewable".equals(xmlPullParser.getName())) {
                    this.f390901a.getClass();
                    arrayList.add(sm1.c(xmlPullParser));
                } else {
                    this.f390901a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
