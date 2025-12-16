package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class z31 implements rm1<mu> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f392181a;

    public z31(@j.N sm1 sm1Var) {
        this.f392181a = sm1Var;
    }

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.P
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mu a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f392181a.getClass();
        xmlPullParser.require(2, null, "Extension");
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        this.f392181a.getClass();
        String strC = sm1.c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(strC)) {
            return null;
        }
        return pk.a(attributeValue, strC);
    }
}
