package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class la1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f387410a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ka1 f387411b = new ka1();

    @j.N
    public final HashMap a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f387410a.getClass();
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap map = new HashMap();
        while (true) {
            this.f387410a.getClass();
            if (xmlPullParser.next() == 3) {
                return map;
            }
            this.f387410a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    ia1 ia1VarA = this.f387411b.a(xmlPullParser);
                    if (ia1VarA != null) {
                        String strA = ia1VarA.a();
                        String strC = ia1VarA.c();
                        if (!map.containsKey(strA)) {
                            map.put(strA, new ArrayList());
                        }
                        ((List) map.get(strA)).add(strC);
                    }
                } else {
                    this.f387410a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
