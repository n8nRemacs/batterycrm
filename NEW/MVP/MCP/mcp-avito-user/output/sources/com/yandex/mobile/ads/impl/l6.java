package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    private final ur0 f387382a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f387383b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f387384c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f387385d;

    /* renamed from: e, reason: collision with root package name */
    private final String f387386e;

    /* renamed from: f, reason: collision with root package name */
    private final String f387387f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final String f387388g;

    /* renamed from: h, reason: collision with root package name */
    private final m6 f387389h;

    private l6(ur0 ur0Var, String str, ArrayList arrayList) {
        m6 m6Var = m6.f387865c;
        ArrayList arrayList2 = new ArrayList();
        this.f387384c = arrayList2;
        this.f387385d = new HashMap();
        this.f387382a = ur0Var;
        this.f387383b = null;
        this.f387386e = str;
        this.f387389h = m6Var;
        arrayList2.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            de1 de1Var = (de1) it.next();
            this.f387385d.put(UUID.randomUUID().toString(), de1Var);
        }
        this.f387388g = null;
        this.f387387f = null;
    }

    public static l6 a(ur0 ur0Var, String str, ArrayList arrayList) {
        xp1.a(str, "OM SDK JS script content is null");
        return new l6(ur0Var, str, arrayList);
    }

    @j.P
    public final String b() {
        return this.f387388g;
    }

    public final String c() {
        return this.f387387f;
    }

    public final Map<String, de1> d() {
        return Collections.unmodifiableMap(this.f387385d);
    }

    public final String e() {
        return this.f387386e;
    }

    public final ur0 f() {
        return this.f387382a;
    }

    public final List<de1> g() {
        return Collections.unmodifiableList(this.f387384c);
    }

    public final WebView h() {
        return this.f387383b;
    }

    public final m6 a() {
        return this.f387389h;
    }
}
