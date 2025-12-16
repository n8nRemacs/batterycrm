package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class qm1<T> implements rm1<List<T>> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f389246a = new sm1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f389247b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final String f389248c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final rm1<T> f389249d;

    public qm1(@j.N rm1<T> rm1Var, @j.N String str, @j.N String str2) {
        this.f389249d = rm1Var;
        this.f389247b = str;
        this.f389248c = str2;
    }

    @Override // com.yandex.mobile.ads.impl.rm1
    @j.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(@j.N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        sm1 sm1Var = this.f389246a;
        String str = this.f389247b;
        sm1Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.f389246a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f389246a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (this.f389248c.equals(xmlPullParser.getName())) {
                    T tA2 = this.f389249d.a(xmlPullParser);
                    if (tA2 != null) {
                        arrayList.add(tA2);
                    }
                } else {
                    this.f389246a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
