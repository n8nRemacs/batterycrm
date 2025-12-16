package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.di.C33813d;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.analytics.x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33537x implements dagger.internal.h<C33536w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232295a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232296b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f232297c;

    /* renamed from: d, reason: collision with root package name */
    public final C33813d f232298d;

    /* renamed from: e, reason: collision with root package name */
    public final C33524j f232299e;

    /* renamed from: f, reason: collision with root package name */
    public final C33534u f232300f;

    /* renamed from: g, reason: collision with root package name */
    public final r f232301g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f232302h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f232303i;

    /* renamed from: j, reason: collision with root package name */
    public final g0 f232304j;

    /* renamed from: k, reason: collision with root package name */
    public final A f232305k;

    /* renamed from: l, reason: collision with root package name */
    public final D f232306l;

    /* renamed from: m, reason: collision with root package name */
    public final S f232307m;

    public C33537x(Provider provider, Provider provider2, Provider provider3, C33813d c33813d, C33524j c33524j, C33534u c33534u, r rVar, d0 d0Var, a0 a0Var, g0 g0Var, A a12, D d12, S s5) {
        this.f232295a = provider;
        this.f232296b = provider2;
        this.f232297c = provider3;
        this.f232298d = c33813d;
        this.f232299e = c33524j;
        this.f232300f = c33534u;
        this.f232301g = rVar;
        this.f232302h = d0Var;
        this.f232303i = a0Var;
        this.f232304j = g0Var;
        this.f232305k = a12;
        this.f232306l = d12;
        this.f232307m = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f232295a.get();
        C50213a c50213a = this.f232296b.get();
        com.avito.android.analytics.provider.a aVar = this.f232297c.get();
        this.f232298d.getClass();
        return new C33536w(interfaceC28373a, c50213a, aVar, C33813d.b(), (InterfaceC33522h) this.f232299e.get(), (InterfaceC33532s) this.f232300f.get(), (InterfaceC33530p) this.f232301g.get(), (b0) this.f232302h.get(), (Y) this.f232303i.get(), (e0) this.f232304j.get(), (InterfaceC33538y) this.f232305k.get(), (B) this.f232306l.get(), (P) this.f232307m.get());
    }
}
