package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f389295a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final z31 f389296b;

    public qu(@j.N sm1 sm1Var) {
        this.f389295a = sm1Var;
        this.f389296b = new z31(sm1Var);
    }

    @j.N
    public final ArrayList a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f389295a.getClass();
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f389295a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f389295a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    mu muVarA = this.f389296b.a(xmlPullParser);
                    if (muVarA != null) {
                        arrayList.add(muVarA);
                    }
                } else {
                    this.f389295a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
