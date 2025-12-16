package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class ce1 implements rm1<xd1> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f384247a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final g80 f384248b = new g80();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final be1 f384249c = new be1();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final la1 f384250d = new la1();

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.P
    public final xd1 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f384247a.getClass();
        xmlPullParser.require(2, null, "Verification");
        this.f384247a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        HashMap map = new HashMap();
        JavaScriptResource javaScriptResourceA = null;
        String strA = null;
        while (true) {
            this.f384247a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f384247a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    javaScriptResourceA = this.f384248b.a(xmlPullParser);
                } else if ("VerificationParameters".equals(name)) {
                    strA = this.f384249c.a(xmlPullParser);
                } else if ("TrackingEvents".equals(name)) {
                    map = this.f384250d.a(xmlPullParser);
                } else {
                    this.f384247a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            return null;
        }
        return new xd1(attributeValue, javaScriptResourceA, strA, map);
    }
}
