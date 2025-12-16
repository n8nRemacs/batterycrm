package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    private final to1 f388707a;

    private p2(to1 to1Var) {
        this.f388707a = to1Var;
    }

    public static p2 a(to1 to1Var) {
        if (to1Var.i().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (to1Var.j()) {
            throw new IllegalStateException("AdSession is finished");
        }
        p2 p2Var = new p2(to1Var);
        to1Var.i().a(p2Var);
        return p2Var;
    }

    public final void a() {
        if (!this.f388707a.j()) {
            if (this.f388707a.k()) {
                if (!this.f388707a.f()) {
                    try {
                        this.f388707a.b();
                    } catch (Exception unused) {
                    }
                }
                if (this.f388707a.f()) {
                    this.f388707a.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public final void a(@j.N ld1 ld1Var) {
        xp1.a(this.f388707a);
        if (this.f388707a.k()) {
            this.f388707a.a(ld1Var.a());
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
