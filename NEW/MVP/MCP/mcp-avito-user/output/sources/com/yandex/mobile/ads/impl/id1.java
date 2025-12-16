package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class id1<T> implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final zi1 f386470a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ff1<T> f386471b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ri1 f386472c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qf1<T> f386473d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f386474e;

    public id1(@j.N ff1<T> ff1Var, @j.N yi1 yi1Var, @j.N ri1 ri1Var, @j.N qf1<T> qf1Var) {
        this.f386471b = ff1Var;
        this.f386472c = ri1Var;
        this.f386473d = qf1Var;
        this.f386470a = new zi1(yi1Var);
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        boolean zA2 = this.f386470a.a();
        if (this.f386474e || !zA2) {
            return;
        }
        this.f386474e = true;
        this.f386472c.h();
        this.f386473d.c(this.f386471b);
    }
}
