package com.avito.android.search.filter.location_filter.di;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.B2;
import com.avito.android.C0;
import com.avito.android.C34160q2;
import com.avito.android.I1;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.GeoFiltersScreen;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.geo_common.interactor.B;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.location.H;
import com.avito.android.location.find.DetectLocationInteractor;
import com.avito.android.location.find.InterfaceC31503a;
import com.avito.android.permissions.G;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.C1;
import com.avito.android.search.filter.C34551c0;
import com.avito.android.search.filter.C34552c1;
import com.avito.android.search.filter.C34554d;
import com.avito.android.search.filter.C34571g;
import com.avito.android.search.filter.C34585n;
import com.avito.android.search.filter.E1;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.FiltersMode;
import com.avito.android.search.filter.InterfaceC34536a1;
import com.avito.android.search.filter.InterfaceC34547b;
import com.avito.android.search.filter.InterfaceC34565e;
import com.avito.android.search.filter.InterfaceC34566e0;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.location_filter.LocationFiltersDialogFragment;
import com.avito.android.search.filter.location_filter.di.j;
import com.avito.android.search.filter.r1;
import com.avito.android.search.filter.u1;
import com.avito.android.search.filter.w1;
import com.avito.android.search.filter.y1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.L6;
import com.avito.android.util.P2;
import com.avito.android.util.P3;
import cv.InterfaceC39417a;
import gq0.InterfaceC40721a;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.util.List;
import java.util.Locale;
import kotlin.Q;
import lW.C43693c;
import lW.InterfaceC43691a;
import nW.InterfaceC44343a;
import oW.InterfaceC44697a;
import pW.C47011b;
import pW.C47012c;
import pW.C47013d;
import pW.C47014e;
import pW.C47015f;
import qW.C47352a;
import ur.InterfaceC49101b;

/* compiled from: DaggerLocationFiltersComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerLocationFiltersComponent.java */
    public static final class b implements j.a {
        public b() {
        }

        @Override // com.avito.android.search.filter.location_filter.di.j.a
        public final j a(com.avito.android.search.filter.di.n nVar, InterfaceC39417a interfaceC39417a, InterfaceC44697a interfaceC44697a, Bundle bundle, Kundle kundle, Resources resources, ActivityC22955m activityC22955m, LocationFiltersDialogFragment locationFiltersDialogFragment, LocationFiltersDialogFragment locationFiltersDialogFragment2, r rVar, SearchParams searchParams, Area area, LocationFiltersDialogFragment locationFiltersDialogFragment3, FiltersMode filtersMode, GeoFiltersScreen geoFiltersScreen, C c12, String str) {
            interfaceC39417a.getClass();
            filtersMode.getClass();
            geoFiltersScreen.getClass();
            return new c(nVar, interfaceC44697a, interfaceC39417a, bundle, kundle, resources, activityC22955m, locationFiltersDialogFragment, locationFiltersDialogFragment2, rVar, searchParams, area, locationFiltersDialogFragment3, filtersMode, geoFiltersScreen, c12, str, null, null, null, null, null);
        }
    }

    /* compiled from: DaggerLocationFiltersComponent.java */
    public static final class c implements com.avito.android.search.filter.location_filter.di.j {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f263470A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.e> f263471A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f263472B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f263473B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<G> f263474C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f263475C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.z> f263476D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<Locale> f263477D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.q> f263478E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<C34160q2> f263479E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33034d> f263480F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<hJ.e> f263481F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.categories.a> f263482G;

        /* renamed from: G0, reason: collision with root package name */
        public final dagger.internal.u<hJ.g> f263483G0;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<B> f263484H;

        /* renamed from: H0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.converter.j> f263485H0;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30715a> f263486I;

        /* renamed from: I0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC40721a> f263487I0;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo_common.interactor.g> f263488J;

        /* renamed from: J0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f263489J0;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<V0> f263490K;

        /* renamed from: K0, reason: collision with root package name */
        public final dagger.internal.l f263491K0;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.l f263492L;

        /* renamed from: L0, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f263493L0;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34536a1> f263494M;

        /* renamed from: M0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.tracker.a> f263495M0;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34547b> f263496N;

        /* renamed from: N0, reason: collision with root package name */
        public final dagger.internal.l f263497N0;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<C1> f263498O;

        /* renamed from: O0, reason: collision with root package name */
        public final dagger.internal.u<H> f263499O0;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.l f263500P;

        /* renamed from: P0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC44343a> f263501P0;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.l f263502Q;

        /* renamed from: Q0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.r> f263503Q0;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.l f263504R;

        /* renamed from: R0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.select.x> f263505R0;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.l f263506S;

        /* renamed from: S0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.di.w> f263507S0;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<SearchParamsConverter> f263508T;

        /* renamed from: T0, reason: collision with root package name */
        public final dagger.internal.u<B2> f263509T0;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<w1> f263510U;

        /* renamed from: U0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.location_filter.f> f263511U0;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.remote.error.f> f263512V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f263513W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<I1> f263514X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<C0> f263515Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.l f263516Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f263517a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo.j> f263518a0;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.search.filter.di.n f263519b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31503a> f263520b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34581l> f263521c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.d> f263522c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.inline_multiselect.d> f263523d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.l f263524d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.inline_multiselect.a> f263525e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.l f263526e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.select.d> f263527f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<L6> f263528f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.select.a> f263529g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<C47352a> f263530g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.multiselect.d> f263531h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<DetectLocationInteractor> f263532h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.multiselect.a> f263533i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.i> f263534i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.inline_select.e> f263535j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.l> f263536j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49101b> f263537k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f263538k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.inline_select.b> f263539l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.f> f263540l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.switcher.d> f263541m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC43691a> f263542m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.switcher.a> f263543n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.l f263544n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.segment.d> f263545o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.l f263546o0;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.search.filter.adapter.segment.c f263547p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34565e> f263548p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f263549q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.l f263550q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.chips.q> f263551r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.analytics.c> f263552r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.chips.n> f263553s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<r1> f263554s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.chips.g> f263555t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f263556t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.chips.d> f263557u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<PreloadingPromiseTestGroup> f263558u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.suggest_location.d> f263559v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.preloading.j<com.avito.android.search.filter.preloading.c, Q<List<Category>, P2<SearchParameters>>>> f263560v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.suggest_location.a> f263561w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.interactor.d> f263562w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.local_priority.d> f263563x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<FiltersInteractor> f263564x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.local_priority.a> f263565y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<androidx.recyclerview.widget.C> f263566y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f263567z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.filter.adapter.b> f263568z0;

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class A implements dagger.internal.u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263569a;

            public A(com.avito.android.search.filter.di.n nVar) {
                this.f263569a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263569a.o();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        /* renamed from: com.avito.android.search.filter.location_filter.di.a$c$a, reason: collision with other inner class name */
        public static final class C7870a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263570a;

            public C7870a(com.avito.android.search.filter.di.n nVar) {
                this.f263570a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f263570a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263571a;

            public b(com.avito.android.search.filter.di.n nVar) {
                this.f263571a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263571a.G();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        /* renamed from: com.avito.android.search.filter.location_filter.di.a$c$c, reason: collision with other inner class name */
        public static final class C7871c implements dagger.internal.u<InterfaceC44343a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f263572a;

            public C7871c(InterfaceC44697a interfaceC44697a) {
                this.f263572a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44343a interfaceC44343aD6 = this.f263572a.d6();
                dagger.internal.t.c(interfaceC44343aD6);
                return interfaceC44343aD6;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class d implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263573a;

            public d(com.avito.android.search.filter.di.n nVar) {
                this.f263573a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f263573a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.categories.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263574a;

            public e(com.avito.android.search.filter.di.n nVar) {
                this.f263574a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.categories.a aVarNg = this.f263574a.ng();
                dagger.internal.t.c(aVarNg);
                return aVarNg;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f263575a;

            public f(cv.b bVar) {
                this.f263575a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f263575a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class g implements dagger.internal.u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263576a;

            public g(com.avito.android.search.filter.di.n nVar) {
                this.f263576a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263576a.T0();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class h implements dagger.internal.u<com.avito.android.geo.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263577a;

            public h(com.avito.android.search.filter.di.n nVar) {
                this.f263577a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo.j jVarC0 = this.f263577a.c0();
                dagger.internal.t.c(jVarC0);
                return jVarC0;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class i implements dagger.internal.u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263578a;

            public i(com.avito.android.search.filter.di.n nVar) {
                this.f263578a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f263578a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class j implements dagger.internal.u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263579a;

            public j(com.avito.android.search.filter.di.n nVar) {
                this.f263579a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.g gVarP0 = this.f263579a.p0();
                dagger.internal.t.c(gVarP0);
                return gVarP0;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class k implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263580a;

            public k(com.avito.android.search.filter.di.n nVar) {
                this.f263580a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263580a.locale();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class l implements dagger.internal.u<InterfaceC30715a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f263581a;

            public l(InterfaceC44697a interfaceC44697a) {
                this.f263581a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30715a interfaceC30715aK3 = this.f263581a.k3();
                dagger.internal.t.c(interfaceC30715aK3);
                return interfaceC30715aK3;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class m implements dagger.internal.u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f263582a;

            public m(InterfaceC44697a interfaceC44697a) {
                this.f263582a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f263582a.u0();
                dagger.internal.t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class n implements dagger.internal.u<I1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263583a;

            public n(com.avito.android.search.filter.di.n nVar) {
                this.f263583a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263583a.H();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class o implements dagger.internal.u<com.avito.android.permissions.z> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f263584a;

            public o(InterfaceC44697a interfaceC44697a) {
                this.f263584a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.permissions.z zVarA = this.f263584a.A();
                dagger.internal.t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class p implements dagger.internal.u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f263585a;

            public p(InterfaceC44697a interfaceC44697a) {
                this.f263585a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263585a.N();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class q implements dagger.internal.u<com.avito.android.search.filter.di.w> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263586a;

            public q(com.avito.android.search.filter.di.n nVar) {
                this.f263586a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.search.filter.di.w wVarJe = this.f263586a.Je();
                dagger.internal.t.c(wVarJe);
                return wVarJe;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class r implements dagger.internal.u<PreloadingPromiseTestGroup> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263587a;

            public r(com.avito.android.search.filter.di.n nVar) {
                this.f263587a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263587a.M6();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class s implements dagger.internal.u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f263588a;

            public s(InterfaceC44697a interfaceC44697a) {
                this.f263588a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263588a.i3();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class t implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263589a;

            public t(com.avito.android.search.filter.di.n nVar) {
                this.f263589a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f263589a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class u implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263590a;

            public u(com.avito.android.search.filter.di.n nVar) {
                this.f263590a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f263590a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class v implements dagger.internal.u<V0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263591a;

            public v(com.avito.android.search.filter.di.n nVar) {
                this.f263591a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V0 v0Z = this.f263591a.Z();
                dagger.internal.t.c(v0Z);
                return v0Z;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class w implements dagger.internal.u<C34160q2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263592a;

            public w(com.avito.android.search.filter.di.n nVar) {
                this.f263592a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263592a.G3();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class x implements dagger.internal.u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263593a;

            public x(com.avito.android.search.filter.di.n nVar) {
                this.f263593a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f263593a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class y implements dagger.internal.u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.filter.di.n f263594a;

            public y(com.avito.android.search.filter.di.n nVar) {
                this.f263594a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263594a.D();
            }
        }

        /* compiled from: DaggerLocationFiltersComponent.java */
        public static final class z implements dagger.internal.u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f263595a;

            public z(InterfaceC44697a interfaceC44697a) {
                this.f263595a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bQ3 = this.f263595a.q3();
                dagger.internal.t.c(bQ3);
                return bQ3;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.search.filter.di.n nVar, InterfaceC44697a interfaceC44697a, cv.b bVar, Bundle bundle, Kundle kundle, Resources resources, Activity activity, Fragment fragment, com.avito.android.ui.a aVar, com.avito.android.analytics.screens.r rVar, SearchParams searchParams, Area area, InterfaceC22983P interfaceC22983P, FiltersMode filtersMode, Screen screen, io.reactivex.rxjava3.core.z zVar, String str, InterfaceC34566e0.b bVar2, FilterAnalyticsData filterAnalyticsData, PresentationType presentationType, String str2, C7869a c7869a) {
            this.f263517a = bVar;
            this.f263519b = nVar;
            this.f263521c = dagger.internal.g.d(C34585n.a());
            dagger.internal.u<com.avito.android.search.filter.adapter.inline_multiselect.d> uVarD = dagger.internal.g.d(new com.avito.android.search.filter.adapter.inline_multiselect.j(dagger.internal.l.b(bVar2), this.f263521c));
            this.f263523d = uVarD;
            this.f263525e = dagger.internal.g.d(new com.avito.android.search.filter.adapter.inline_multiselect.c(uVarD));
            dagger.internal.u<com.avito.android.search.filter.adapter.select.d> uVarD2 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.select.j(this.f263521c));
            this.f263527f = uVarD2;
            this.f263529g = dagger.internal.g.d(new com.avito.android.search.filter.adapter.select.c(uVarD2));
            dagger.internal.u<com.avito.android.search.filter.adapter.multiselect.d> uVarD3 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.multiselect.j(this.f263521c));
            this.f263531h = uVarD3;
            this.f263533i = dagger.internal.g.d(new com.avito.android.search.filter.adapter.multiselect.c(uVarD3));
            dagger.internal.u<com.avito.android.search.filter.adapter.inline_select.e> uVarD4 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.inline_select.h(this.f263521c));
            this.f263535j = uVarD4;
            b bVar3 = new b(nVar);
            this.f263537k = bVar3;
            this.f263539l = dagger.internal.g.d(new com.avito.android.search.filter.adapter.inline_select.d(uVarD4, bVar3));
            dagger.internal.u<com.avito.android.search.filter.adapter.switcher.d> uVarD5 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.switcher.g(this.f263521c));
            this.f263541m = uVarD5;
            this.f263543n = dagger.internal.g.d(new com.avito.android.search.filter.adapter.switcher.c(uVarD5));
            dagger.internal.u<com.avito.android.search.filter.adapter.segment.d> uVarD6 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.segment.g(this.f263521c));
            this.f263545o = uVarD6;
            this.f263547p = new com.avito.android.search.filter.adapter.segment.c(uVarD6);
            f fVar = new f(bVar);
            this.f263549q = fVar;
            dagger.internal.u<com.avito.android.search.filter.adapter.chips.q> uVarD7 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.chips.u(fVar, this.f263521c));
            this.f263551r = uVarD7;
            this.f263553s = dagger.internal.g.d(new com.avito.android.search.filter.adapter.chips.p(uVarD7, this.f263537k));
            dagger.internal.u<com.avito.android.search.filter.adapter.chips.g> uVarD8 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.chips.l(this.f263549q, this.f263521c));
            this.f263555t = uVarD8;
            this.f263557u = dagger.internal.g.d(new com.avito.android.search.filter.adapter.chips.f(uVarD8, this.f263537k));
            dagger.internal.u<com.avito.android.search.filter.adapter.suggest_location.d> uVarD9 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.suggest_location.i(this.f263521c));
            this.f263559v = uVarD9;
            this.f263561w = dagger.internal.g.d(new com.avito.android.search.filter.adapter.suggest_location.c(uVarD9));
            dagger.internal.u<com.avito.android.search.filter.adapter.local_priority.d> uVarD10 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.local_priority.g(this.f263521c));
            this.f263563x = uVarD10;
            dagger.internal.u<com.avito.android.search.filter.adapter.local_priority.a> uVarD11 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.local_priority.c(uVarD10));
            this.f263565y = uVarD11;
            dagger.internal.u<com.avito.konveyor.a> uVarD12 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.f(this.f263525e, this.f263529g, this.f263533i, this.f263539l, this.f263543n, this.f263547p, this.f263553s, this.f263557u, this.f263561w, uVarD11));
            this.f263567z = uVarD12;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD13 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.d(uVarD12));
            this.f263470A = uVarD13;
            this.f263472B = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.g(uVarD13, this.f263567z));
            dagger.internal.u<com.avito.android.permissions.q> uVarD14 = dagger.internal.g.d(new com.avito.android.permissions.s(new p(interfaceC44697a), new o(interfaceC44697a)));
            this.f263478E = uVarD14;
            this.f263480F = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.m(uVarD14));
            this.f263482G = new e(nVar);
            this.f263484H = new z(interfaceC44697a);
            this.f263486I = new l(interfaceC44697a);
            this.f263488J = new m(interfaceC44697a);
            this.f263490K = new v(nVar);
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f263492L = lVarA;
            dagger.internal.u<InterfaceC34536a1> uVarD15 = dagger.internal.g.d(new C34552c1(lVarA));
            this.f263494M = uVarD15;
            this.f263496N = dagger.internal.g.d(new C34554d(uVarD15));
            this.f263498O = dagger.internal.g.d(E1.a());
            this.f263500P = dagger.internal.l.b(searchParams);
            this.f263502Q = dagger.internal.l.b(area);
            this.f263504R = dagger.internal.l.b(str2);
            this.f263506S = dagger.internal.l.b(presentationType);
            this.f263508T = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f263510U = dagger.internal.g.d(y1.a());
            this.f263512V = new A(nVar);
            this.f263513W = new t(nVar);
            this.f263514X = new n(nVar);
            this.f263515Y = new g(nVar);
            this.f263516Z = dagger.internal.l.b(kundle);
            h hVar = new h(nVar);
            this.f263518a0 = hVar;
            C47011b.f428554b.getClass();
            dagger.internal.u<InterfaceC31503a> uVarD16 = dagger.internal.g.d(new C47011b(hVar));
            this.f263520b0 = uVarD16;
            C47012c.f428556b.getClass();
            this.f263522c0 = dagger.internal.g.d(new C47012c(uVarD16));
            this.f263524d0 = dagger.internal.l.a(activity);
            this.f263526e0 = dagger.internal.l.a(aVar);
            dagger.internal.u<L6> uVarD17 = dagger.internal.g.d(C47015f.f428566a);
            this.f263528f0 = uVarD17;
            dagger.internal.l lVar = this.f263524d0;
            dagger.internal.l lVar2 = this.f263526e0;
            C47013d.f428558d.getClass();
            dagger.internal.u<C47352a> uVarD18 = dagger.internal.g.d(new C47013d(lVar, lVar2, uVarD17));
            this.f263530g0 = uVarD18;
            dagger.internal.u<InterfaceC35745a5> uVar = this.f263513W;
            dagger.internal.u<com.avito.android.geo.j> uVar2 = this.f263518a0;
            C47014e.f428562d.getClass();
            dagger.internal.u<DetectLocationInteractor> uVarD19 = dagger.internal.g.d(new C47014e(uVarD18, uVar, uVar2));
            this.f263532h0 = uVarD19;
            com.avito.android.location.find.k.f181757b.getClass();
            dagger.internal.u<com.avito.android.location.find.i> uVarD20 = dagger.internal.g.d(new com.avito.android.location.find.k(uVarD19));
            this.f263534i0 = uVarD20;
            dagger.internal.u<com.avito.android.location.find.d> uVar3 = this.f263522c0;
            com.avito.android.location.find.n.f181761c.getClass();
            this.f263536j0 = dagger.internal.g.d(new com.avito.android.location.find.n(uVarD20, uVar3));
            C7870a c7870a = new C7870a(nVar);
            this.f263538k0 = c7870a;
            x xVar = new x(nVar);
            this.f263540l0 = xVar;
            this.f263542m0 = dagger.internal.B.a(C43693c.a(c7870a, xVar));
            this.f263544n0 = dagger.internal.l.a(filtersMode);
            this.f263546o0 = dagger.internal.l.b(str);
            this.f263548p0 = dagger.internal.g.d(C34571g.a());
            this.f263550q0 = dagger.internal.l.b(filterAnalyticsData);
            this.f263552r0 = dagger.internal.g.d(new com.avito.android.search.filter.analytics.e(this.f263538k0, this.f263500P, com.avito.android.analytics.provider.f.a(), this.f263550q0, this.f263513W));
            dagger.internal.u<r1> uVarD21 = dagger.internal.g.d(u1.a());
            this.f263554s0 = uVarD21;
            this.f263560v0 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.n(new com.avito.android.search.filter.preloading.i(this.f263482G, this.f263508T, this.f263490K, this.f263506S, this.f263544n0, this.f263552r0, this.f263512V, uVarD21), new d(nVar), new r(nVar), this.f263516Z, this.f263546o0, this.f263502Q, com.avito.android.search.filter.preloading.b.a(), this.f263500P));
            dagger.internal.u<com.avito.android.search.filter.interactor.d> uVarD22 = dagger.internal.g.d(com.avito.android.search.filter.interactor.f.a());
            this.f263562w0 = uVarD22;
            this.f263564x0 = dagger.internal.g.d(new C34551c0(this.f263482G, this.f263484H, this.f263486I, this.f263488J, this.f263490K, this.f263496N, this.f263498O, this.f263500P, this.f263502Q, this.f263504R, this.f263506S, this.f263508T, this.f263510U, this.f263512V, this.f263513W, this.f263514X, this.f263515Y, this.f263516Z, this.f263480F, this.f263536j0, this.f263542m0, this.f263544n0, this.f263546o0, this.f263548p0, this.f263552r0, this.f263560v0, uVarD22));
            this.f263566y0 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.i(this.f263472B));
            this.f263568z0 = dagger.internal.g.d(com.avito.android.search.filter.adapter.d.a());
            dagger.internal.u<com.avito.android.search.filter.adapter.e> uVarD23 = dagger.internal.g.d(com.avito.android.search.filter.adapter.g.a());
            this.f263471A0 = uVarD23;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD24 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.e(uVarD23, this.f263568z0));
            this.f263473B0 = uVarD24;
            this.f263475C0 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.h(uVarD24, this.f263566y0, this.f263470A));
            this.f263485H0 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.di.l(P3.f318722a, this.f263540l0, new k(nVar), new w(nVar), this.f263492L, new i(nVar), new j(nVar), this.f263515Y));
            this.f263487I0 = dagger.internal.B.a(new com.avito.android.select.new_metro.di.f(this.f263538k0));
            this.f263489J0 = new u(nVar);
            this.f263491K0 = dagger.internal.l.a(rVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarD25 = dagger.internal.g.d(new com.avito.android.search.filter.di.v(this.f263491K0, dagger.internal.l.a(screen), this.f263489J0));
            this.f263493L0 = uVarD25;
            this.f263495M0 = dagger.internal.g.d(new com.avito.android.search.filter.tracker.c(uVarD25));
            this.f263497N0 = dagger.internal.l.b(bundle);
            s sVar = new s(interfaceC44697a);
            C7871c c7871c = new C7871c(interfaceC44697a);
            this.f263503Q0 = dagger.internal.B.a(com.avito.android.location.A.a(sVar, this.f263514X, this.f263484H, c7871c));
            dagger.internal.u<com.avito.android.select.x> uVarA = dagger.internal.B.a(com.avito.android.select.z.a());
            this.f263505R0 = uVarA;
            this.f263511U0 = dagger.internal.g.d(new com.avito.android.search.filter.location_filter.s(this.f263564x0, this.f263500P, this.f263521c, this.f263475C0, this.f263485H0, this.f263513W, this.f263552r0, this.f263487I0, this.f263495M0, this.f263497N0, this.f263503Q0, uVarA, new q(nVar), new y(nVar)));
        }

        @Override // com.avito.android.search.filter.location_filter.di.j
        public final void a(LocationFiltersDialogFragment locationFiltersDialogFragment) {
            locationFiltersDialogFragment.f263440i0 = this.f263472B.get();
            locationFiltersDialogFragment.f263441j0 = this.f263480F.get();
            com.avito.android.deeplink_handler.view.d dVarC = this.f263517a.c();
            dagger.internal.t.c(dVarC);
            locationFiltersDialogFragment.f263442k0 = dVarC;
            locationFiltersDialogFragment.f263443l0 = this.f263511U0.get();
            com.avito.android.search.filter.di.n nVar = this.f263519b;
            locationFiltersDialogFragment.f263444m0 = nVar.h();
            locationFiltersDialogFragment.f263445n0 = nVar.r1();
            locationFiltersDialogFragment.f263446o0 = nVar.C1();
            locationFiltersDialogFragment.f263447p0 = nVar.S4();
            locationFiltersDialogFragment.f263448q0 = nVar.Bl();
            locationFiltersDialogFragment.f263449r0 = nVar.eh();
            InterfaceC28373a interfaceC28373aA = nVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            locationFiltersDialogFragment.f263450s0 = interfaceC28373aA;
            locationFiltersDialogFragment.f263451t0 = this.f263495M0.get();
            locationFiltersDialogFragment.f263452u0 = nVar.G();
        }
    }

    public static j.a a() {
        return new b();
    }
}
