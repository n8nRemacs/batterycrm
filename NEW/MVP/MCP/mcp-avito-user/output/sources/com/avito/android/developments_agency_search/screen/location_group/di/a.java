package com.avito.android.developments_agency_search.screen.location_group.di;

import Hw.C14041c;
import Hw.InterfaceC14039a;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupDialogFragment;
import com.avito.android.developments_agency_search.screen.location_group.di.b;
import com.avito.android.developments_agency_search.screen.location_group.l;
import com.avito.android.developments_agency_search.screen.location_group.mvi.k;
import com.avito.android.developments_agency_search.screen.location_group.mvi.m;
import com.avito.android.developments_agency_search.screen.location_group.mvi.p;
import com.avito.android.developments_agency_search.screen.location_group.mvi.r;
import com.avito.android.developments_agency_search.screen.location_group.mvi.t;
import com.avito.android.developments_agency_search.screen.location_group.n;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.search.filter.C34585n;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.adapter.multiselect.j;
import com.avito.android.search.filter.adapter.suggest_location.i;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import sw.InterfaceC48423a;

/* compiled from: DaggerLocationGroupDialogComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerLocationGroupDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.developments_agency_search.screen.location_group.di.b.a
        public final com.avito.android.developments_agency_search.screen.location_group.di.b a(LocationGroupArguments locationGroupArguments, com.avito.android.developments_agency_search.screen.location_group.di.c cVar, C28478k c28478k, Resources resources) {
            locationGroupArguments.getClass();
            return new c(cVar, locationGroupArguments, c28478k, resources, null);
        }
    }

    /* compiled from: DaggerLocationGroupDialogComponent.java */
    public static final class c implements com.avito.android.developments_agency_search.screen.location_group.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<SearchParamsConverter> f138081a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC48423a> f138082b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.geo_common.interactor.g> f138083c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f138084d;

        /* renamed from: e, reason: collision with root package name */
        public final u<l> f138085e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f138086f;

        /* renamed from: g, reason: collision with root package name */
        public final m f138087g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f138088h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.analytics.a> f138089i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC14039a> f138090j;

        /* renamed from: k, reason: collision with root package name */
        public final k f138091k;

        /* renamed from: l, reason: collision with root package name */
        public final u<hJ.e> f138092l;

        /* renamed from: m, reason: collision with root package name */
        public final u<hJ.g> f138093m;

        /* renamed from: n, reason: collision with root package name */
        public final t f138094n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f138095o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f138096p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.location_group.k f138097q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f138098r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC34581l> f138099s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.search.filter.adapter.multiselect.c f138100t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.search.filter.adapter.select.c f138101u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.search.filter.adapter.suggest_location.c f138102v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f138103w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f138104x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.location_group.a> f138105y;

        /* compiled from: DaggerLocationGroupDialogComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.location_group.di.a$c$a, reason: collision with other inner class name */
        public static final class C4166a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.location_group.di.c f138106a;

            public C4166a(com.avito.android.developments_agency_search.screen.location_group.di.c cVar) {
                this.f138106a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f138106a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLocationGroupDialogComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.location_group.di.c f138107a;

            public b(com.avito.android.developments_agency_search.screen.location_group.di.c cVar) {
                this.f138107a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f138107a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerLocationGroupDialogComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.location_group.di.a$c$c, reason: collision with other inner class name */
        public static final class C4167c implements u<InterfaceC48423a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.location_group.di.c f138108a;

            public C4167c(com.avito.android.developments_agency_search.screen.location_group.di.c cVar) {
                this.f138108a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48423a interfaceC48423aJ1 = this.f138108a.J1();
                dagger.internal.t.c(interfaceC48423aJ1);
                return interfaceC48423aJ1;
            }
        }

        /* compiled from: DaggerLocationGroupDialogComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.location_group.di.c f138109a;

            public d(com.avito.android.developments_agency_search.screen.location_group.di.c cVar) {
                this.f138109a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f138109a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerLocationGroupDialogComponent.java */
        public static final class e implements u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.location_group.di.c f138110a;

            public e(com.avito.android.developments_agency_search.screen.location_group.di.c cVar) {
                this.f138110a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f138110a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerLocationGroupDialogComponent.java */
        public static final class f implements u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.location_group.di.c f138111a;

            public f(com.avito.android.developments_agency_search.screen.location_group.di.c cVar) {
                this.f138111a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.g gVarP0 = this.f138111a.p0();
                dagger.internal.t.c(gVarP0);
                return gVarP0;
            }
        }

        /* compiled from: DaggerLocationGroupDialogComponent.java */
        public static final class g implements u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.location_group.di.c f138112a;

            public g(com.avito.android.developments_agency_search.screen.location_group.di.c cVar) {
                this.f138112a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f138112a.u0();
                dagger.internal.t.c(gVarU0);
                return gVarU0;
            }
        }

        public c(com.avito.android.developments_agency_search.screen.location_group.di.c cVar, LocationGroupArguments locationGroupArguments, C28478k c28478k, Resources resources, C4165a c4165a) {
            u<SearchParamsConverter> uVarD = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f138081a = uVarD;
            this.f138085e = dagger.internal.g.d(new n(uVarD, new C4167c(cVar), new g(cVar), new d(cVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(locationGroupArguments);
            this.f138086f = lVarA;
            this.f138087g = new m(lVarA, this.f138085e);
            this.f138088h = new C4166a(cVar);
            u<com.avito.android.developments_agency_search.analytics.a> uVarD2 = dagger.internal.g.d(com.avito.android.developments_agency_search.analytics.c.a());
            this.f138089i = uVarD2;
            u<InterfaceC14039a> uVarD3 = dagger.internal.g.d(new C14041c(this.f138086f, uVarD2, this.f138088h));
            this.f138090j = uVarD3;
            this.f138091k = new k(uVarD3, this.f138085e);
            this.f138092l = new e(cVar);
            this.f138093m = new f(cVar);
            this.f138094n = new t(new com.avito.android.developments_agency_search.screen.location_group.di.f(dagger.internal.l.a(resources), this.f138092l, this.f138093m));
            this.f138095o = new b(cVar);
            this.f138096p = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f138095o);
            this.f138097q = new com.avito.android.developments_agency_search.screen.location_group.k(new p(this.f138087g, this.f138091k, r.a(), this.f138094n, this.f138096p));
            this.f138098r = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<InterfaceC34581l> uVarD4 = dagger.internal.g.d(C34585n.a());
            this.f138099s = uVarD4;
            this.f138100t = new com.avito.android.search.filter.adapter.multiselect.c(new j(uVarD4));
            this.f138101u = new com.avito.android.search.filter.adapter.select.c(new com.avito.android.search.filter.adapter.select.j(uVarD4));
            this.f138102v = new com.avito.android.search.filter.adapter.suggest_location.c(new i(uVarD4));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f138098r);
            com.avito.android.search.filter.adapter.multiselect.c cVar2 = this.f138100t;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar2);
            list.add(this.f138101u);
            list.add(this.f138102v);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f138103w = uVarK;
            this.f138104x = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f138105y = dagger.internal.g.d(com.avito.android.developments_agency_search.screen.location_group.c.a());
        }

        @Override // com.avito.android.developments_agency_search.screen.location_group.di.b
        public final void a(LocationGroupDialogFragment locationGroupDialogFragment) {
            locationGroupDialogFragment.f138050h0 = this.f138097q;
            locationGroupDialogFragment.f138052j0 = this.f138096p.get();
            com.avito.konveyor.adapter.a aVar = this.f138104x.get();
            com.avito.konveyor.a aVar2 = this.f138103w.get();
            com.avito.android.developments_agency_search.screen.location_group.di.d.f138113a.getClass();
            locationGroupDialogFragment.f138053k0 = new com.avito.konveyor.adapter.j(aVar, aVar2);
            locationGroupDialogFragment.f138054l0 = this.f138104x.get();
            locationGroupDialogFragment.f138055m0 = this.f138099s.get();
            locationGroupDialogFragment.f138056n0 = this.f138105y.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
