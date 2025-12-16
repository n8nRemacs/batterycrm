package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class ka1 implements rm1<ia1> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f387093a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.video.parser.offset.a f387094b = new com.yandex.mobile.ads.video.parser.offset.a(new HashSet(Arrays.asList(c91.values())));

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.P
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ia1 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f387093a.getClass();
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        this.f387093a.getClass();
        String strC = sm1.c(xmlPullParser);
        boolean zIsEmpty = TextUtils.isEmpty(attributeValue);
        boolean zIsEmpty2 = TextUtils.isEmpty(strC);
        if (zIsEmpty || zIsEmpty2) {
            return null;
        }
        return new ia1(attributeValue, strC, attributeValue2 != null ? this.f387094b.a(attributeValue2) : null);
    }
}
