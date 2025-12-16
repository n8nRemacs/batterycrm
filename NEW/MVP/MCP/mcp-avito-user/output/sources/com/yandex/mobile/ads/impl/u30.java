package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ne1;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
final class u30 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xe1 f390440a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final sm1 f390441b = new sm1();

    public u30(xe1 xe1Var) {
        this.f390440a = xe1Var;
    }

    @j.P
    public final ne1 a(@j.N XmlPullParser xmlPullParser, @j.N ne1.a aVar) {
        this.f390441b.getClass();
        xmlPullParser.require(2, null, "InLine");
        while (true) {
            this.f390441b.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f390441b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                this.f390440a.a(xmlPullParser, aVar);
            }
        }
        ne1 ne1VarA = aVar.a();
        if (ne1VarA.e().isEmpty()) {
            return null;
        }
        return ne1VarA;
    }
}
