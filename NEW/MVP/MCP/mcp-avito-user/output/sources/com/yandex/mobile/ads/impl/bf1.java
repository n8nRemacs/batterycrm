package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.af1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42745f0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class bf1 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private static final List<String> f383947d = C42745f0.U("ad_system", "social_ad_info", "yandex_ad_info");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final sm1 f383948a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final z31 f383949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final qm1<ia1> f383950c;

    public bf1() {
        sm1 sm1Var = new sm1();
        this.f383948a = sm1Var;
        this.f383949b = new z31(sm1Var);
        this.f383950c = a();
    }

    @Y61.k
    public final af1 a(@Y61.k XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f383948a.getClass();
        sm1.a(xmlPullParser, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        af1.a aVar = new af1.a();
        while (true) {
            this.f383948a.getClass();
            if (!sm1.a(xmlPullParser)) {
                aVar.a(arrayList2);
                aVar.b(arrayList);
                return aVar.a();
            }
            this.f383948a.getClass();
            if (sm1.b(xmlPullParser)) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (f383947d.contains(attributeValue)) {
                        mu muVarA = this.f383949b.a(xmlPullParser);
                        if (muVarA != null) {
                            arrayList2.add(muVarA);
                        }
                    } else if ("yandex_tracking_events".equals(attributeValue)) {
                        arrayList.addAll(this.f383950c.a(xmlPullParser));
                    } else {
                        this.f383948a.getClass();
                        sm1.d(xmlPullParser);
                    }
                } else {
                    this.f383948a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }

    private static qm1 a() {
        return new qm1(new ka1(), "Extension", "Tracking");
    }
}
