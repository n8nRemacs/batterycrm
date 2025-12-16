package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class r6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f389391a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final w6 f389392b;

    public r6(@j.N sm1 sm1Var) {
        this.f389391a = sm1Var;
        this.f389392b = new w6(sm1Var);
    }

    @j.P
    public final q6 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f389391a.getClass();
        q6 q6VarA = null;
        xmlPullParser.require(2, null, "AdSource");
        this.f389391a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "allowMultipleAds");
        if (attributeValue != null) {
            Boolean.parseBoolean(attributeValue);
        }
        this.f389391a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "followRedirects");
        if (attributeValue2 != null) {
            Boolean.parseBoolean(attributeValue2);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        while (true) {
            this.f389391a.getClass();
            if (xmlPullParser.next() == 3) {
                return q6VarA;
            }
            this.f389391a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("AdTagURI".equals(xmlPullParser.getName())) {
                    v6 v6VarA = this.f389392b.a(xmlPullParser);
                    if (v6VarA != null) {
                        q6VarA = fk1.a(v6VarA, attributeValue3);
                    }
                } else {
                    this.f389391a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
