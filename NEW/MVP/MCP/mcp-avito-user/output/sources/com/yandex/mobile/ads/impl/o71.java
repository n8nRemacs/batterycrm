package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class o71 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f388453a = "id";

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f388454b = "Ad";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final sm1 f388455c = new sm1();

    @Y61.l
    public final String a(@Y61.k XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        sm1 sm1Var = this.f388455c;
        String str = this.f388454b;
        sm1Var.getClass();
        sm1.a(xmlPullParser, str);
        String attributeValue = xmlPullParser.getAttributeValue(null, this.f388453a);
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return attributeValue;
    }
}
