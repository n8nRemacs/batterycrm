package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class v01<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39362s0 f390646a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final m91 f390647b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final an0 f390648c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39365t0 f390649d;

    public static class a implements InterfaceC39365t0 {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final an0 f390650a;

        public a(@j.N an0 an0Var) {
            this.f390650a = an0Var;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
        public final void a() {
            this.f390650a.c();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
        public final void b() {
            this.f390650a.b();
        }
    }

    public v01(@j.N C39362s0 c39362s0, @j.N n91 n91Var, @j.N om0 om0Var, @j.N f91 f91Var) {
        this.f390646a = c39362s0;
        this.f390647b = n91Var;
        an0 an0Var = new an0(n91Var, om0Var, f91Var);
        this.f390648c = an0Var;
        this.f390649d = new a(an0Var);
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f390646a.a(this.f390649d);
        this.f390648c.a(this.f390647b.b(v12));
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        this.f390646a.b(this.f390649d);
        this.f390648c.a();
    }
}
