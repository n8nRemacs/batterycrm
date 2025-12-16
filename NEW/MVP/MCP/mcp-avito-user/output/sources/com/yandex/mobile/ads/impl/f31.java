package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class f31 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f385163a = new sm1();

    @j.P
    public final Integer a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        Integer numValueOf;
        this.f385163a.getClass();
        xmlPullParser.require(2, null, "Ad");
        try {
            numValueOf = Integer.valueOf(xmlPullParser.getAttributeValue(null, "sequence"));
        } catch (NumberFormatException unused) {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }
}
