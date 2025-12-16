package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public class go<V extends View, T> implements fb<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final bj1<V, T> f385792a;

    public go(@j.N bj1<V, T> bj1Var) {
        this.f385792a = bj1Var;
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void a() {
        View viewB = this.f385792a.b();
        if (viewB != null) {
            this.f385792a.a(viewB);
        }
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final boolean b() {
        return this.f385792a.b() != null;
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void c(@j.N T t12) {
        View viewB = this.f385792a.b();
        if (viewB != null) {
            this.f385792a.b(viewB, t12);
            viewB.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final boolean d() {
        return rj1.a(this.f385792a.b(), 100);
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final boolean e() {
        View viewB = this.f385792a.b();
        if (viewB != null && !rj1.d(viewB)) {
            int height = viewB.getHeight();
            if (viewB.getWidth() >= 1 && height >= 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void a(@j.N eb<T> ebVar, @j.N ej1 ej1Var) {
        this.f385792a.a(ebVar, ej1Var, ebVar.d());
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final boolean a(@j.N T t12) {
        View viewB = this.f385792a.b();
        return viewB != null && this.f385792a.a(viewB, t12);
    }

    @Override // com.yandex.mobile.ads.impl.fb
    @j.P
    public final hj1 c() {
        View viewB = this.f385792a.b();
        if (viewB != null) {
            return new hj1(viewB);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.fb
    public final void destroy() {
    }
}
