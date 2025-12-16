package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class w6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f391295a;

    public w6(@j.N sm1 sm1Var) {
        this.f391295a = sm1Var;
    }

    @j.P
    public final v6 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f391295a.getClass();
        xmlPullParser.require(2, null, "AdTagURI");
        xmlPullParser.getAttributeValue(null, "templateType");
        this.f391295a.getClass();
        String strC = sm1.c(xmlPullParser);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return fk1.a(strC);
    }
}
