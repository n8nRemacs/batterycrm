package com.avito.android.di.module;

import Bc.C13134b;
import Bc.InterfaceC13133a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.image.a;
import com.avito.android.analytics.screens.tracker.InterfaceC28490l;
import javax.inject.Provider;

/* compiled from: ScreenGraphiteAnalyticsModule_ProvidesScreenTrackerFactoryDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.v7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30215v7 implements dagger.internal.h<com.avito.android.analytics.screens.tracker.I> {

    /* renamed from: a, reason: collision with root package name */
    public final C30139o7 f144665a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f144666b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.analytics.screens.I f144667c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.H> f144668d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.analytics.screens.image.b f144669e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144670f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.K1 f144671g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.coverage.d> f144672h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC28490l> f144673i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.remote.analytics.n> f144674j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.remote.analytics.image.e> f144675k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.analytics.screens.E f144676l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<io.reactivex.rxjava3.core.z<com.avito.android.fps.a>> f144677m;

    /* renamed from: n, reason: collision with root package name */
    public final C13134b f144678n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.V> f144679o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.M> f144680p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.degrade.a> f144681q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.degrade.fps.f> f144682r;

    public C30215v7(C30139o7 c30139o7, dagger.internal.f fVar, com.avito.android.analytics.screens.I i12, Provider provider, com.avito.android.analytics.screens.image.b bVar, Provider provider2, com.avito.android.K1 k12, Provider provider3, Provider provider4, Provider provider5, Provider provider6, com.avito.android.analytics.screens.E e12, Provider provider7, C13134b c13134b, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f144665a = c30139o7;
        this.f144666b = fVar;
        this.f144667c = i12;
        this.f144668d = provider;
        this.f144669e = bVar;
        this.f144670f = provider2;
        this.f144671g = k12;
        this.f144672h = provider3;
        this.f144673i = provider4;
        this.f144674j = provider5;
        this.f144675k = provider6;
        this.f144676l = e12;
        this.f144677m = provider7;
        this.f144678n = c13134b;
        this.f144679o = provider8;
        this.f144680p = provider9;
        this.f144681q = provider10;
        this.f144682r = provider11;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144666b.get();
        com.avito.android.analytics.screens.G g12 = (com.avito.android.analytics.screens.G) this.f144667c.get();
        com.avito.android.analytics.H h12 = this.f144668d.get();
        this.f144669e.getClass();
        a.C2679a c2679a = new a.C2679a();
        com.avito.android.util.C c12 = this.f144670f.get();
        com.avito.android.I1 i12 = (com.avito.android.I1) this.f144671g.get();
        com.avito.android.analytics.coverage.d dVar = this.f144672h.get();
        InterfaceC28490l interfaceC28490l = this.f144673i.get();
        com.avito.android.remote.analytics.n nVar = this.f144674j.get();
        com.avito.android.remote.analytics.image.e eVar = this.f144675k.get();
        this.f144676l.getClass();
        com.avito.android.analytics.screens.D d12 = new com.avito.android.analytics.screens.D();
        io.reactivex.rxjava3.core.z<com.avito.android.fps.a> zVar = this.f144677m.get();
        InterfaceC13133a interfaceC13133a = (InterfaceC13133a) this.f144678n.get();
        com.avito.android.analytics.screens.tracker.V v12 = this.f144679o.get();
        com.avito.android.analytics.screens.tracker.M m12 = this.f144680p.get();
        com.avito.android.analytics.screens.tracker.degrade.a aVar = this.f144681q.get();
        com.avito.android.analytics.screens.tracker.degrade.fps.f fVar = this.f144682r.get();
        this.f144665a.getClass();
        return new com.avito.android.analytics.screens.tracker.J(interfaceC28373a, g12, h12, c2679a, i12, c12, dVar, interfaceC28490l, nVar, eVar, d12, zVar, interfaceC13133a, v12, m12, aVar, fVar);
    }
}
