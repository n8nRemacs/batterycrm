package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class dh1 implements rm1<ch1> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f384605a = new sm1();

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ch1 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f384605a.getClass();
        String str = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f384605a.getClass();
            if (xmlPullParser.next() == 3) {
                return new ch1(str, arrayList);
            }
            this.f384605a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("ClickThrough".equals(name)) {
                    this.f384605a.getClass();
                    String strC = sm1.c(xmlPullParser);
                    if (!TextUtils.isEmpty(strC)) {
                        str = strC;
                    }
                } else if ("ClickTracking".equals(name)) {
                    this.f384605a.getClass();
                    String strC2 = sm1.c(xmlPullParser);
                    if (!TextUtils.isEmpty(strC2)) {
                        arrayList.add(strC2);
                    }
                } else {
                    this.f384605a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
