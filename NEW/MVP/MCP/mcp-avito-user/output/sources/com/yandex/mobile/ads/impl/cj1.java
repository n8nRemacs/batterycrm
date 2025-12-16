package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class cj1<V extends View, T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bj1<V, T> f384320a;

    public cj1(@j.N bj1<V, T> bj1Var) {
        this.f384320a = bj1Var;
    }

    public final void a() {
        View viewB = this.f384320a.b();
        if (viewB != null) {
            this.f384320a.a(viewB);
        }
    }

    public final void b(@j.N T t12) {
        View viewB = this.f384320a.b();
        if (viewB != null) {
            this.f384320a.b(viewB, t12);
            viewB.setVisibility(0);
        }
    }

    public final void a(@j.N eb ebVar, @j.N ej1 ej1Var, @j.P T t12) {
        if (this.f384320a.b() != null) {
            this.f384320a.a(ebVar, ej1Var, t12);
        }
    }

    public final void b() {
        this.f384320a.a();
    }

    public final boolean a(@j.N T t12) {
        View viewB = this.f384320a.b();
        return viewB != null && this.f384320a.a(viewB, t12);
    }
}
