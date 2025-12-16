package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class wt {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashSet f391488a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private com.google.android.exoplayer2.d0 f391489b;

    public final void a(@j.N bv0 bv0Var) {
        this.f391488a.add(bv0Var);
    }

    public final boolean b() {
        return this.f391489b != null;
    }

    public final void a(@j.P com.google.android.exoplayer2.d0 d0Var) {
        this.f391489b = d0Var;
        Iterator it = this.f391488a.iterator();
        while (it.hasNext()) {
            ((pt0) it.next()).a(d0Var);
        }
    }

    @j.P
    public final com.google.android.exoplayer2.d0 a() {
        return this.f391489b;
    }
}
