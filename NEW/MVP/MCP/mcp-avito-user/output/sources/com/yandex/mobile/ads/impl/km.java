package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class km<T> implements rm1<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f387185a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final rm1<T> f387186b;

    public km(@j.N zu zuVar) {
        this.f387186b = zuVar;
    }

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.P
    public final T a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f387185a.getClass();
        T tA2 = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.f387185a.getClass();
            if (xmlPullParser.next() == 3) {
                return tA2;
            }
            this.f387185a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                tA2 = this.f387186b.a(xmlPullParser);
            }
        }
    }
}
