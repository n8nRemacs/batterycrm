package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class as {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f383631a = new sm1();

    public final int a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f383631a.getClass();
        Long lValueOf = null;
        xmlPullParser.require(2, null, "Duration");
        this.f383631a.getClass();
        String strC = sm1.c(xmlPullParser);
        if (strC != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                lValueOf = Long.valueOf(simpleDateFormat.parse(strC).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
            }
        }
        if (lValueOf != null) {
            return lValueOf.intValue();
        }
        return 0;
    }
}
