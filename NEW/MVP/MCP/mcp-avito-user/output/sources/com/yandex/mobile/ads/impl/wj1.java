package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class wj1<T> implements gg1, ig1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ff1<T> f391424a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final aj1 f391425b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final qg1 f391426c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ri1 f391427d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final qf1<T> f391428e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Long f391429f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f391430g;

    public wj1(@j.N ff1<T> ff1Var, @j.N yi1 yi1Var, @j.N qg1 qg1Var, @j.N ri1 ri1Var, @j.N qf1<T> qf1Var) {
        this.f391424a = ff1Var;
        this.f391425b = new aj1(yi1Var);
        this.f391426c = qg1Var;
        this.f391427d = ri1Var;
        this.f391428e = qf1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ig1
    public final void a() {
        this.f391429f = null;
    }

    @Override // com.yandex.mobile.ads.impl.ig1
    public final void b() {
        this.f391429f = null;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        boolean zA2 = this.f391425b.a();
        if (this.f391430g) {
            return;
        }
        if (!zA2 || this.f391426c.a() != pg1.f388824d) {
            this.f391429f = null;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l12 = this.f391429f;
        if (l12 == null) {
            this.f391429f = Long.valueOf(jElapsedRealtime);
            this.f391428e.k(this.f391424a);
        } else if (jElapsedRealtime - l12.longValue() >= 2000) {
            this.f391430g = true;
            this.f391428e.j(this.f391424a);
            this.f391427d.n();
        }
    }
}
