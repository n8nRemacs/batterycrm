package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class g80 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f385614a = new sm1();

    @j.P
    public final JavaScriptResource a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f385614a.getClass();
        xmlPullParser.require(2, null, "JavaScriptResource");
        this.f385614a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f385614a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "browserOptional");
        Boolean boolValueOf = attributeValue2 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
        this.f385614a.getClass();
        String strC = sm1.c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || boolValueOf == null || TextUtils.isEmpty(strC)) {
            return null;
        }
        return new JavaScriptResource(attributeValue, strC, boolValueOf.booleanValue());
    }
}
