package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class vd1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f390848a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final dd1 f390849b;

    public vd1(@j.N Context context) {
        this.f390849b = new dd1(context);
    }

    @j.P
    public final zc1 a(@j.N String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        this.f390848a.getClass();
        xmlPullParserNewPullParser.require(2, null, "VAST");
        return this.f390849b.a(xmlPullParserNewPullParser);
    }
}
