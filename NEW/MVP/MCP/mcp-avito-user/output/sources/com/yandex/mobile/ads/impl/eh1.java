package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class eh1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hu0 f384933a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hh1 f384934b;

    public eh1(@j.N hu0 hu0Var, @j.N hh1 hh1Var) {
        this.f384934b = hh1Var;
        this.f384933a = hu0Var;
    }

    public final boolean a() {
        long jA2 = this.f384934b.a();
        lt0 lt0VarB = this.f384933a.b();
        return jA2 != -9223372036854775807L && (lt0VarB != null ? lt0VarB.a() : -1L) + 1000 >= jA2;
    }
}
