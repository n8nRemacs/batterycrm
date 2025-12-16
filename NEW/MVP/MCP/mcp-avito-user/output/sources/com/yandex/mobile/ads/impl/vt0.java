package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class vt0 implements iv0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ci1 f391008a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ax0 f391009b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final zw0 f391010c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final xt0 f391011d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f391012e;

    public vt0(@j.N ci1 ci1Var, @j.N ax0 ax0Var, @j.N zw0 zw0Var, @j.N xt0 xt0Var) {
        this.f391008a = ci1Var;
        this.f391009b = ax0Var;
        this.f391010c = zw0Var;
        this.f391011d = xt0Var;
    }

    public final void a() {
        if (this.f391012e) {
            return;
        }
        this.f391012e = true;
        this.f391008a.a(this);
        this.f391008a.a();
    }

    public final void b() {
        if (this.f391012e) {
            this.f391008a.a((iv0) null);
            this.f391008a.b();
            this.f391012e = false;
        }
    }

    public final void a(long j12) {
        p60 p60VarA = this.f391010c.a(j12);
        if (p60VarA != null) {
            ((pg0) this.f391011d).a(p60VarA);
            return;
        }
        p60 p60VarA2 = this.f391009b.a(j12);
        if (p60VarA2 != null) {
            ((pg0) this.f391011d).b(p60VarA2);
        }
    }
}
