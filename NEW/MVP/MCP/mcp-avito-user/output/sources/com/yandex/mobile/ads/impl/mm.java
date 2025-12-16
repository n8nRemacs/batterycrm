package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.lm;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class mm {

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final f90 f388030d;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final qm1<ia1> f388029c = b();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final km<FalseClick> f388028b = a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f388027a = new sm1();

    public mm(@j.N Context context) {
        this.f388030d = new f90(new zb(context));
    }

    @j.N
    private static qm1 b() {
        return new qm1(new ka1(), "CreativeExtension", "Tracking");
    }

    @j.N
    public final lm a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f388027a.getClass();
        xmlPullParser.require(2, null, "CreativeExtensions");
        lm.a aVar = new lm.a();
        while (true) {
            this.f388027a.getClass();
            if (xmlPullParser.next() == 3) {
                return new lm(aVar);
            }
            this.f388027a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("CreativeExtension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if ("false_click".equals(attributeValue)) {
                        aVar.a(this.f388028b.a(xmlPullParser));
                    } else if ("yandex_tracking_events".equals(attributeValue)) {
                        aVar.a(this.f388029c.a(xmlPullParser));
                    } else if ("yandex_linear_creative_info".equals(attributeValue)) {
                        aVar.a(this.f388030d.a(xmlPullParser));
                    } else {
                        this.f388027a.getClass();
                        sm1.d(xmlPullParser);
                    }
                } else {
                    this.f388027a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }

    @j.N
    private static km a() {
        return new km(new zu());
    }
}
