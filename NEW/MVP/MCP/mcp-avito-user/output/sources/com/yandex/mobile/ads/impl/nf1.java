package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ne1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class nf1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388267a;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final u30 f388269c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final mm1 f388270d;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final sm1 f388268b = new sm1();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final f31 f388271e = new f31();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final o71 f388272f = new o71();

    public nf1(@j.N Context context) {
        this.f388267a = context.getApplicationContext();
        this.f388269c = new u30(new xe1(context));
        this.f388270d = new mm1(context);
    }

    @j.P
    public final ne1 a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, NumberFormatException {
        String strA = this.f388272f.a(xmlPullParser);
        Integer numA = this.f388271e.a(xmlPullParser);
        this.f388268b.getClass();
        ne1 ne1VarA = null;
        xmlPullParser.require(2, null, "Ad");
        while (true) {
            this.f388268b.getClass();
            if (xmlPullParser.next() == 3) {
                return ne1VarA;
            }
            this.f388268b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("InLine".equals(name)) {
                    ne1.a aVar = new ne1.a(this.f388267a, false);
                    aVar.d(strA);
                    aVar.a(numA);
                    ne1VarA = this.f388269c.a(xmlPullParser, aVar);
                } else if ("Wrapper".equals(name)) {
                    ne1.a aVar2 = new ne1.a(this.f388267a, true);
                    aVar2.d(strA);
                    aVar2.a(numA);
                    ne1VarA = this.f388270d.a(xmlPullParser, aVar2);
                } else {
                    this.f388268b.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
