package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class xu {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hu0 f391815a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hh1 f391816b;

    public xu(@j.N hu0 hu0Var, @j.N hh1 hh1Var) {
        this.f391815a = hu0Var;
        this.f391816b = hh1Var;
    }

    public final void a(@j.N com.google.android.exoplayer2.source.ads.a aVar, int i12) {
        long jR2 = com.google.android.exoplayer2.util.U.R(aVar.a(i12).f346189b);
        if (jR2 == Long.MIN_VALUE) {
            jR2 = this.f391816b.a();
        }
        this.f391815a.a(new yu(jR2));
    }

    public final void a() {
        this.f391815a.a((yu) null);
    }
}
