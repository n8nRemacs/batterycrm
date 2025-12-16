package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class q30 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final r30 f389076a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f389077b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f389078c;

    public q30(@j.N r30 r30Var) {
        this.f389076a = r30Var;
    }

    public final void a() {
        this.f389077b = false;
        this.f389078c = false;
    }

    public final void b() {
        if (this.f389077b) {
            return;
        }
        this.f389077b = true;
        this.f389076a.a(ky0.b.f387321v);
    }

    public final void c() {
        if (this.f389078c) {
            return;
        }
        this.f389078c = true;
        HashMap map = new HashMap();
        map.put("failure_tracked", Boolean.FALSE);
        this.f389076a.a(ky0.b.f387322w, map);
    }
}
