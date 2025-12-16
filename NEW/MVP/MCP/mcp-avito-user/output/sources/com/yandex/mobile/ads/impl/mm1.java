package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ne1;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
final class mm1 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xe1 f388038b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f388037a = new sm1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final km1 f388039c = new km1();

    public mm1(@j.N Context context) {
        this.f388038b = new xe1(context);
    }

    @j.N
    public final ne1 a(@j.N XmlPullParser xmlPullParser, @j.N ne1.a aVar) {
        this.f388037a.getClass();
        xmlPullParser.require(2, null, "Wrapper");
        this.f388039c.getClass();
        aVar.a(new jm1(Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "allowMultipleAds")), Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "followAdditionalWrappers"))));
        while (true) {
            this.f388037a.getClass();
            if (xmlPullParser.next() == 3) {
                return aVar.a();
            }
            this.f388037a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("VASTAdTagURI".equals(xmlPullParser.getName())) {
                    this.f388037a.getClass();
                    aVar.f(sm1.c(xmlPullParser));
                } else {
                    this.f388038b.a(xmlPullParser, aVar);
                }
            }
        }
    }
}
