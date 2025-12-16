package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class lt0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.google.android.exoplayer2.d0 f387709a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ot0 f387710b;

    public lt0(@j.N com.google.android.exoplayer2.d0 d0Var, @j.N ot0 ot0Var) {
        this.f387709a = d0Var;
        this.f387710b = ot0Var;
    }

    public final long a() {
        com.google.android.exoplayer2.s0 s0VarB = this.f387710b.b();
        return this.f387709a.getContentPosition() - (s0VarB.p() ? 0L : com.google.android.exoplayer2.util.U.R(s0VarB.f(0, this.f387710b.a(), false).f345874f));
    }
}
