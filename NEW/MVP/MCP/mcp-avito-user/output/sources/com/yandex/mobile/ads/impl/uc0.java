package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.yandex.mobile.ads.impl.rc0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class uc0 implements rm1<rc0> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f390512a = new sm1();

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.N
    public final rc0 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f390512a.getClass();
        xmlPullParser.require(2, null, "MediaFile");
        this.f390512a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, NotificationsSettings.Section.SECTION_DELIVERY);
        this.f390512a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        this.f390512a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        this.f390512a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        this.f390512a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "bitrate");
        this.f390512a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "id");
        this.f390512a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "codec");
        this.f390512a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "vmaf");
        this.f390512a.getClass();
        String strC = sm1.c(xmlPullParser);
        rc0.a aVarH = new rc0.a().d(attributeValue6).b(attributeValue).c(attributeValue3).h(attributeValue4);
        try {
            aVarH.f389485i = Integer.valueOf(attributeValue5).intValue();
        } catch (Exception unused) {
        }
        return aVarH.e(attributeValue2).f(strC).a(attributeValue7).g(attributeValue8).a();
    }
}
