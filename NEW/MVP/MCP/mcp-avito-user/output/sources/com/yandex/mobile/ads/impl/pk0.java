package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class pk0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final gm0 f388873a = new gm0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.i f388874b;

    public pk0(@j.N ko1 ko1Var) {
        this.f388874b = new com.yandex.mobile.ads.nativeads.i(ko1Var);
    }

    @j.P
    public final com.yandex.mobile.ads.nativeads.h a(@j.N Context context, @j.N uj0 uj0Var, @j.N w20 w20Var, @j.N com.yandex.mobile.ads.nativeads.j jVar, @j.N ok0 ok0Var, @j.P nj0 nj0Var) {
        if (nj0Var == null) {
            return null;
        }
        this.f388873a.getClass();
        fm0 fm0VarA = gm0.a();
        mo0 mo0VarA = ok0Var.d().a(nj0Var);
        sw swVar = new sw();
        return fm0VarA.a(context, nj0Var, new com.yandex.mobile.ads.nativeads.r(context, nj0Var, w20Var, mo0VarA), w20Var, this.f388874b.a(context, uj0Var, jVar.a(uj0Var, nj0Var), mo0VarA, ok0Var, swVar, nj0Var));
    }
}
