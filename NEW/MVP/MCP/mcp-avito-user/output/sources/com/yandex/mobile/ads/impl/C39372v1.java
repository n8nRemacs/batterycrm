package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.v1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39372v1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f390651a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final r6 f390652b;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qu f390654d;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final kg f390653c = new kg();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final zx0 f390655e = new zx0();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final d91 f390656f = new d91();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final la1 f390657g = new la1();

    public C39372v1(@j.N sm1 sm1Var, @j.N qu quVar) {
        this.f390651a = sm1Var;
        this.f390654d = quVar;
        this.f390652b = new r6(sm1Var);
    }

    @j.P
    public final C39366t1 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f390651a.getClass();
        xmlPullParser.require(2, null, "AdBreak");
        String attributeValue = xmlPullParser.getAttributeValue(null, "breakId");
        this.f390655e.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "repeatAfter");
        if (!TextUtils.isEmpty(attributeValue2)) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
                simpleDateFormat.parse(attributeValue2).getTime();
                simpleDateFormat.parse("00:00:00").getTime();
            } catch (Exception unused) {
            }
        }
        this.f390656f.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "timeOffset");
        b91 b91VarB = !TextUtils.isEmpty(attributeValue3) ? fk1.b(attributeValue3) : null;
        this.f390653c.getClass();
        List arrayList = new ArrayList();
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "breakType");
            if (!TextUtils.isEmpty(attributeValue4)) {
                arrayList = Arrays.asList(attributeValue4.split(","));
            }
        } catch (Exception unused2) {
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        q6 q6VarA = null;
        while (true) {
            this.f390651a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f390651a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("AdSource".equals(name)) {
                    q6VarA = this.f390652b.a(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    arrayList2.addAll(this.f390654d.a(xmlPullParser));
                } else if ("TrackingEvents".equals(name)) {
                    map.putAll(this.f390657g.a(xmlPullParser));
                } else {
                    this.f390651a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
        if (q6VarA == null || b91VarB == null || arrayList.isEmpty()) {
            return null;
        }
        return fk1.a(q6VarA, attributeValue, b91VarB, arrayList, map);
    }
}
