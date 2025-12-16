package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class be1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f383937a = new sm1();

    @j.P
    public final String a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f383937a.getClass();
        xmlPullParser.require(2, null, "VerificationParameters");
        this.f383937a.getClass();
        String strC = sm1.c(xmlPullParser);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return strC;
    }
}
