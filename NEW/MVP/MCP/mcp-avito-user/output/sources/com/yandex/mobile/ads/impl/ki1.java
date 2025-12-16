package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ki1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ot0 f387169a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final fh1 f387170b;

    public ki1(@j.N ot0 ot0Var, @j.N fh1 fh1Var) {
        this.f387169a = ot0Var;
        this.f387170b = fh1Var;
    }

    public final void a(@j.N com.google.android.exoplayer2.d0 d0Var) {
        if (this.f387169a.c() || d0Var.isPlayingAd()) {
            return;
        }
        this.f387170b.c();
        boolean zB2 = this.f387170b.b();
        com.google.android.exoplayer2.s0 s0VarB = this.f387169a.b();
        if (zB2 || s0VarB.p()) {
            return;
        }
        s0VarB.f(0, this.f387169a.a(), false);
    }
}
