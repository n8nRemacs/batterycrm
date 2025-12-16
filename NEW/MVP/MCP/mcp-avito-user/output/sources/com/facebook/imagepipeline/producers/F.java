package com.facebook.imagepipeline.producers;

import aX0.C19832c;
import aX0.C19833d;
import aX0.InterfaceC19834e;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: InternalRequestListener.java */
@Nullsafe
/* loaded from: classes15.dex */
public class F extends E implements InterfaceC19834e {

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public final C19833d f340539c;

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public final C19832c f340540d;

    public F(@I41.h C19833d c19833d, @I41.h C19832c c19832c) {
        super(c19833d, c19832c);
        this.f340539c = c19833d;
        this.f340540d = c19832c;
    }

    @Override // aX0.InterfaceC19834e
    public final void e(k0 k0Var) {
        C19833d c19833d = this.f340539c;
        if (c19833d != null) {
            c19833d.d(k0Var.getId());
        }
        C19832c c19832c = this.f340540d;
        if (c19832c != null) {
            c19832c.e(k0Var);
        }
    }

    @Override // aX0.InterfaceC19834e
    public final void g(k0 k0Var, Throwable th2) {
        C19833d c19833d = this.f340539c;
        if (c19833d != null) {
            c19833d.k(k0Var.j(), k0Var.getId(), th2, k0Var.m());
        }
        C19832c c19832c = this.f340540d;
        if (c19832c != null) {
            c19832c.g(k0Var, th2);
        }
    }

    @Override // aX0.InterfaceC19834e
    public final void i(k0 k0Var) {
        C19833d c19833d = this.f340539c;
        if (c19833d != null) {
            c19833d.e(k0Var.j(), k0Var.getId(), k0Var.m());
        }
        C19832c c19832c = this.f340540d;
        if (c19832c != null) {
            c19832c.i(k0Var);
        }
    }

    @Override // aX0.InterfaceC19834e
    public final void k(t0 t0Var) {
        C19833d c19833d = this.f340539c;
        if (c19833d != null) {
            c19833d.i(t0Var.f340654a, t0Var.f340658e, t0Var.f340655b, t0Var.m());
        }
        C19832c c19832c = this.f340540d;
        if (c19832c != null) {
            c19832c.k(t0Var);
        }
    }
}
