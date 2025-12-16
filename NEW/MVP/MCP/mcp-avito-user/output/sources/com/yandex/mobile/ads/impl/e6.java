package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class e6 implements h6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final i6 f384764a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final g6 f384765b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final re1 f384766c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private h6 f384767d;

    public e6(@j.N g6 g6Var) {
        this.f384765b = g6Var;
        g6Var.a(this);
        re1 re1Var = new re1();
        this.f384766c = re1Var;
        g6Var.a(re1Var);
        this.f384764a = new i6();
    }

    public final void a(@j.P h6 h6Var) {
        this.f384767d = h6Var;
    }

    @Override // com.yandex.mobile.ads.impl.h6
    public final void b() {
        this.f384764a.a(2);
        h6 h6Var = this.f384767d;
        if (h6Var != null) {
            h6Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.h6
    public final void c() {
        this.f384764a.a(4);
        h6 h6Var = this.f384767d;
        if (h6Var != null) {
            h6Var.c();
        }
    }

    public final void d() {
        int iA2 = n6.a(this.f384764a.a());
        if (iA2 == 0 || iA2 == 1 || iA2 == 2) {
            this.f384765b.c();
        }
    }

    public final void e() {
        int iA2 = n6.a(this.f384764a.a());
        if (iA2 == 0 || iA2 == 1 || iA2 == 2) {
            this.f384765b.f();
        }
    }

    public final void f() {
        h6 h6Var;
        int iA2 = n6.a(this.f384764a.a());
        if (iA2 == 0) {
            this.f384765b.prepare();
            return;
        }
        if (iA2 != 1) {
            if (iA2 == 4 && (h6Var = this.f384767d) != null) {
                h6Var.a();
                return;
            }
            return;
        }
        h6 h6Var2 = this.f384767d;
        if (h6Var2 != null) {
            h6Var2.b();
        }
    }

    public final void g() {
        h6 h6Var;
        int iA2 = n6.a(this.f384764a.a());
        if (iA2 == 0) {
            this.f384765b.prepare();
            return;
        }
        if (iA2 == 2) {
            this.f384765b.resume();
            return;
        }
        if (iA2 != 3) {
            if (iA2 == 4 && (h6Var = this.f384767d) != null) {
                h6Var.a();
                return;
            }
            return;
        }
        h6 h6Var2 = this.f384767d;
        if (h6Var2 != null) {
            h6Var2.c();
        }
    }

    public final void h() {
        h6 h6Var;
        int iA2 = n6.a(this.f384764a.a());
        if (iA2 == 0) {
            this.f384765b.prepare();
            return;
        }
        if (iA2 == 1) {
            this.f384764a.a(3);
            this.f384765b.start();
            return;
        }
        if (iA2 == 2) {
            this.f384765b.resume();
            return;
        }
        if (iA2 != 3) {
            if (iA2 == 4 && (h6Var = this.f384767d) != null) {
                h6Var.a();
                return;
            }
            return;
        }
        h6 h6Var2 = this.f384767d;
        if (h6Var2 != null) {
            h6Var2.c();
        }
    }

    public final void a(@j.P qe1 qe1Var) {
        this.f384766c.a(qe1Var);
    }

    @Override // com.yandex.mobile.ads.impl.h6
    public final void a() {
        this.f384764a.a(5);
        h6 h6Var = this.f384767d;
        if (h6Var != null) {
            h6Var.a();
        }
    }
}
