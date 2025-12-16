package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
final class hk0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f386153a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.j f386154b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final wj0 f386155c;

    public hk0(@j.N n2 n2Var, @j.N ko1 ko1Var) {
        this.f386153a = n2Var;
        this.f386154b = new com.yandex.mobile.ads.nativeads.j(ko1Var);
        this.f386155c = new wj0(ko1Var);
    }

    public final void a(@j.N Context context, @j.N uj0 uj0Var, @j.N w20 w20Var, @j.N ok0 ok0Var, @j.N ek0 ek0Var) {
        vj0 vj0VarA = this.f386155c.a(this.f386153a.m());
        if (vj0VarA != null) {
            vj0VarA.a(context, uj0Var, w20Var, this.f386154b, ok0Var, ek0Var);
        } else {
            ek0Var.a(i5.f386309a);
        }
    }
}
