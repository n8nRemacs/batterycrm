package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ne1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
final class xe1 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final qm1<im> f391709b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f391708a = new sm1();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final vj1 f391711d = new vj1();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final bf1 f391712e = new bf1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final qm1<xd1> f391710c = new qm1<>(new ce1(), "AdVerifications", "Verification");

    public xe1(@j.N Context context) {
        this.f391709b = new qm1<>(new pm(context), "Creatives", "Creative");
    }

    public final void a(@j.N XmlPullParser xmlPullParser, @j.N ne1.a aVar) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if ("Impression".equals(name)) {
            this.f391708a.getClass();
            aVar.a("impression", sm1.c(xmlPullParser));
            return;
        }
        if ("ViewableImpression".equals(name)) {
            aVar.a(this.f391711d.a(xmlPullParser));
            return;
        }
        if ("Error".equals(name)) {
            this.f391708a.getClass();
            aVar.a("error", sm1.c(xmlPullParser));
            return;
        }
        if ("Survey".equals(name)) {
            this.f391708a.getClass();
            aVar.e(sm1.c(xmlPullParser));
            return;
        }
        if ("Description".equals(name)) {
            this.f391708a.getClass();
            aVar.c(sm1.c(xmlPullParser));
            return;
        }
        if ("AdTitle".equals(name)) {
            this.f391708a.getClass();
            aVar.b(sm1.c(xmlPullParser));
            return;
        }
        if ("AdSystem".equals(name)) {
            this.f391708a.getClass();
            aVar.a(sm1.c(xmlPullParser));
            return;
        }
        if ("Creatives".equals(name)) {
            aVar.b(this.f391709b.a(xmlPullParser));
            return;
        }
        if ("AdVerifications".equals(name)) {
            aVar.a(this.f391710c.a(xmlPullParser));
        } else if ("Extensions".equals(name)) {
            aVar.a(this.f391712e.a(xmlPullParser));
        } else {
            this.f391708a.getClass();
            sm1.d(xmlPullParser);
        }
    }
}
