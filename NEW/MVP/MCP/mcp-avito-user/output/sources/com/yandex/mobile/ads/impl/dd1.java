package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class dd1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f384582a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nf1 f384583b;

    public dd1(@j.N Context context) {
        this.f384583b = new nf1(context);
    }

    @j.P
    public final zc1 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        this.f384582a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f384582a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f384582a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Ad".equals(xmlPullParser.getName())) {
                    ne1 ne1VarA = this.f384583b.a(xmlPullParser);
                    if (ne1VarA != null) {
                        arrayList.add(ne1VarA);
                    }
                } else {
                    this.f384582a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            return null;
        }
        return new zc1(attributeValue, arrayList);
    }
}
