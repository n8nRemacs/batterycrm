package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Xml;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class hk1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39372v1 f386156a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final qu f386157b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final sm1 f386158c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39320e2 f386159d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.video.parser.vmap.configurator.a f386160e;

    public hk1() {
        sm1 sm1Var = new sm1();
        this.f386158c = sm1Var;
        qu quVar = new qu(sm1Var);
        this.f386157b = quVar;
        this.f386156a = new C39372v1(sm1Var, quVar);
        this.f386159d = new C39320e2();
        this.f386160e = new com.yandex.mobile.ads.video.parser.vmap.configurator.a();
    }

    @j.N
    public final ek1 a(@j.N String str) throws XmlPullParserException, IOException, gk1 {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        this.f386158c.getClass();
        xmlPullParserNewPullParser.require(2, null, "VMAP");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "version");
        while (true) {
            this.f386158c.getClass();
            if (xmlPullParserNewPullParser.next() == 3) {
                break;
            }
            this.f386158c.getClass();
            if (xmlPullParserNewPullParser.getEventType() == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("AdBreak".equals(name)) {
                    C39366t1 c39366t1A = this.f386156a.a(xmlPullParserNewPullParser);
                    if (c39366t1A != null) {
                        arrayList.add(c39366t1A);
                    }
                } else if ("Extensions".equals(name)) {
                    arrayList2.addAll(this.f386157b.a(xmlPullParserNewPullParser));
                } else {
                    this.f386158c.getClass();
                    sm1.d(xmlPullParserNewPullParser);
                }
            }
        }
        if (TextUtils.isEmpty(attributeValue)) {
            throw new gk1();
        }
        this.f386160e.getClass();
        AdBreakParameters adBreakParametersA = com.yandex.mobile.ads.video.parser.vmap.configurator.a.a(arrayList2);
        this.f386159d.getClass();
        C39320e2.a(arrayList, adBreakParametersA);
        return fk1.a(arrayList);
    }
}
