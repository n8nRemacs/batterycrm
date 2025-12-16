package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class t90 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hu0 f390129a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hh1 f390130b;

    public t90(@j.N hu0 hu0Var, @j.N hh1 hh1Var) {
        this.f390129a = hu0Var;
        this.f390130b = hh1Var;
    }

    public final int a(@j.N com.google.android.exoplayer2.source.ads.a aVar) {
        lt0 lt0VarB = this.f390129a.b();
        if (lt0VarB == null) {
            return -1;
        }
        long jH2 = com.google.android.exoplayer2.util.U.H(this.f390130b.a());
        long jH3 = com.google.android.exoplayer2.util.U.H(lt0VarB.a());
        int iC2 = aVar.c(jH3, jH2);
        return iC2 == -1 ? aVar.b(jH3, jH2) : iC2;
    }
}
