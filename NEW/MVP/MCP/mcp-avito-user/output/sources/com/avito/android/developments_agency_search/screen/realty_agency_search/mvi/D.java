package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import Lw.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.util.P2;
import javax.inject.Provider;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import ri0.InterfaceC47661a;

/* compiled from: RealtyAgencySearchFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47661a> f138699a;

    /* renamed from: b, reason: collision with root package name */
    public final A f138700b;

    /* renamed from: c, reason: collision with root package name */
    public final C29886v f138701c;

    /* renamed from: d, reason: collision with root package name */
    public final M f138702d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f138703e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f138704f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f138705g;

    public D(Provider provider, A a12, C29886v c29886v, M m12, d0 d0Var, dagger.internal.u uVar, dagger.internal.l lVar) {
        this.f138699a = provider;
        this.f138700b = a12;
        this.f138701c = c29886v;
        this.f138702d = m12;
        this.f138703e = d0Var;
        this.f138704f = uVar;
        this.f138705g = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47661a interfaceC47661a = this.f138699a.get();
        C29887w c29887w = (C29887w) this.f138700b.get();
        C29866a c29866a = (C29866a) this.f138701c.get();
        L l12 = (L) this.f138702d.get();
        b0 b0Var = (b0) this.f138703e.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f138704f.get();
        RealtyAgencySearchArguments realtyAgencySearchArguments = (RealtyAgencySearchArguments) this.f138705g.f393949a;
        c.b bVar = Lw.c.f10237n;
        boolean zA2 = interfaceC47661a.a();
        bVar.getClass();
        c.d dVar = new c.d(false, false, false, false, false);
        Tab tab = realtyAgencySearchArguments.f138669g;
        if (tab == null) {
            tab = Tab.f138450c;
        }
        c.g gVar = new c.g(tab, !realtyAgencySearchArguments.f138670h, null, null);
        DevelopmentSort.f138655b.getClass();
        c.a aVar = new c.a(DevelopmentSort.f138656c, LotSort.f138661d, zA2);
        P2.c cVar = P2.c.f318721a;
        C42784z0 c42784z0 = C42784z0.f406748b;
        return new C("RealtyAgencySearch", new Lw.c(realtyAgencySearchArguments.f138668f, null, dVar, gVar, aVar, new c.C0649c(cVar, c42784z0), new c.e(cVar, c42784z0, B0.f406639b), false, new c.f(null, null, null, 1, null), new c.h(c42784z0, new c.h.a(false, false), c42784z0, null)), new B(c29887w, c29866a, screenPerformanceTracker, b0Var, l12));
    }
}
