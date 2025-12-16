package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class b5 implements jv0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f383783a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ot0 f383784b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final wt f383785c;

    public b5(@j.N u6 u6Var, @j.N nt0 nt0Var) {
        this.f383783a = u6Var;
        this.f383784b = nt0Var.d();
        this.f383785c = nt0Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.jv0
    @j.N
    public final dt0 a() {
        com.google.android.exoplayer2.d0 d0VarA;
        st0 st0VarB = this.f383783a.b();
        if (st0VarB == null) {
            return dt0.f384669c;
        }
        boolean zC2 = this.f383784b.c();
        f50 f50VarA = this.f383783a.a(st0VarB.b());
        dt0 dt0Var = dt0.f384669c;
        return (f50.f385172a.equals(f50VarA) || !zC2 || (d0VarA = this.f383785c.a()) == null) ? dt0Var : new dt0(d0VarA.getCurrentPosition(), d0VarA.getDuration());
    }
}
