package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class j91 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h4 f386788a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ot0 f386789b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final u7 f386790c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final hh1 f386791d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final us0 f386792e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final yb1 f386793f = new yb1();

    public j91(@j.N h4 h4Var, @j.N nt0 nt0Var, @j.N u7 u7Var, @j.N us0 us0Var) {
        this.f386788a = h4Var;
        this.f386790c = u7Var;
        this.f386789b = nt0Var.d();
        this.f386791d = nt0Var.a();
        this.f386792e = us0Var;
    }

    public final void a(@j.N com.google.android.exoplayer2.s0 s0Var) {
        if (s0Var.p()) {
            return;
        }
        s0Var.h();
        this.f386789b.a(s0Var);
        long j12 = s0Var.f(0, this.f386789b.a(), false).f345873e;
        this.f386791d.a(com.google.android.exoplayer2.util.U.R(j12));
        if (j12 != -9223372036854775807L) {
            com.google.android.exoplayer2.source.ads.a aVarA = this.f386788a.a();
            this.f386793f.getClass();
            this.f386788a.a(yb1.a(aVarA, j12));
        }
        if (!this.f386790c.b()) {
            this.f386790c.a();
        }
        this.f386792e.a();
    }
}
