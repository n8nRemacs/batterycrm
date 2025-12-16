package com.avito.android.developments_agency_search.screen.big_filters.di;

import Qw.InterfaceC14939a;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersArguments;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment;
import com.avito.android.developments_agency_search.screen.big_filters.di.a;
import com.avito.android.developments_agency_search.screen.big_filters.mvi.r;
import com.avito.android.developments_agency_search.screen.big_filters.mvi.t;
import com.avito.android.developments_agency_search.screen.big_filters.p;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.search.filter.C34585n;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.adapter.chips.q;
import com.avito.android.search.filter.w1;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import sw.InterfaceC48423a;
import ur.InterfaceC49101b;
import uw.InterfaceC49120b;
import vw.C49387a;

/* compiled from: DaggerBigFiltersComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class m {

    /* compiled from: DaggerBigFiltersComponent.java */
    public static final class b implements com.avito.android.developments_agency_search.screen.big_filters.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f136601A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.search.filter.adapter.double_input.u> f136602B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f136603C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.search.filter.adapter.checkbox.d> f136604D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f136605E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.search.filter.adapter.select.d> f136606F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f136607G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.search.filter.adapter.suggest_location.d> f136608H;

        /* renamed from: I, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f136609I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.search.filter.adapter.location_group.d> f136610J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f136611K;

        /* renamed from: L, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f136612L;

        /* renamed from: M, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f136613M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f136614N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f136615O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f136616P;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136617a;

        /* renamed from: b, reason: collision with root package name */
        public final u<SearchParamsConverter> f136618b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.shared.a> f136619c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC48423a> f136620d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC14939a> f136621e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.big_filters.f> f136622f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f136623g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.big_filters.mvi.m f136624h;

        /* renamed from: i, reason: collision with root package name */
        public final u<w1> f136625i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f136626j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.analytics.a> f136627k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC49120b> f136628l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.big_filters.mvi.k f136629m;

        /* renamed from: n, reason: collision with root package name */
        public final u<hJ.e> f136630n;

        /* renamed from: o, reason: collision with root package name */
        public final u<hJ.g> f136631o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.big_filters.converter.e> f136632p;

        /* renamed from: q, reason: collision with root package name */
        public final t f136633q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f136634r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f136635s;

        /* renamed from: t, reason: collision with root package name */
        public final p f136636t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC34581l> f136637u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f136638v;

        /* renamed from: w, reason: collision with root package name */
        public final u<q> f136639w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC49101b> f136640x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f136641y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.search.filter.adapter.chips.g> f136642z;

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136643a;

            public a(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136643a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f136643a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.big_filters.di.m$b$b, reason: collision with other inner class name */
        public static final class C4122b implements u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136644a;

            public C4122b(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136644a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f136644a.G();
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class c implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136645a;

            public c(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136645a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f136645a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136646a;

            public d(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136646a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f136646a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f136647a;

            public e(cv.b bVar) {
                this.f136647a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f136647a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class f implements u<InterfaceC48423a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136648a;

            public f(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136648a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48423a interfaceC48423aJ1 = this.f136648a.J1();
                dagger.internal.t.c(interfaceC48423aJ1);
                return interfaceC48423aJ1;
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class g implements u<InterfaceC14939a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136649a;

            public g(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136649a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14939a interfaceC14939aZ1 = this.f136649a.Z1();
                dagger.internal.t.c(interfaceC14939aZ1);
                return interfaceC14939aZ1;
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class h implements u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136650a;

            public h(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136650a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f136650a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerBigFiltersComponent.java */
        public static final class i implements u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.big_filters.di.b f136651a;

            public i(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar) {
                this.f136651a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.g gVarP0 = this.f136651a.p0();
                dagger.internal.t.c(gVarP0);
                return gVarP0;
            }
        }

        public b(com.avito.android.developments_agency_search.screen.big_filters.di.b bVar, cv.b bVar2, BigFiltersArguments bigFiltersArguments, C28478k c28478k, Resources resources, a aVar) {
            this.f136617a = bVar;
            u<SearchParamsConverter> uVarD = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f136618b = uVarD;
            u<com.avito.android.developments_agency_search.screen.shared.a> uVarD2 = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.shared.c(uVarD, com.avito.android.developments_agency_search.screen.shared.f.a()));
            this.f136619c = uVarD2;
            this.f136622f = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.big_filters.h(uVarD2, new f(bVar), new g(bVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(bigFiltersArguments);
            this.f136623g = lVarA;
            this.f136624h = new com.avito.android.developments_agency_search.screen.big_filters.mvi.m(lVarA, this.f136622f);
            this.f136625i = dagger.internal.g.d(com.avito.android.developments_agency_search.screen.big_filters.converter.b.a());
            this.f136626j = new a(bVar);
            u<com.avito.android.developments_agency_search.analytics.a> uVarD3 = dagger.internal.g.d(com.avito.android.developments_agency_search.analytics.c.a());
            this.f136627k = uVarD3;
            u<InterfaceC49120b> uVarD4 = dagger.internal.g.d(new uw.d(this.f136623g, uVarD3, this.f136626j));
            this.f136628l = uVarD4;
            this.f136629m = new com.avito.android.developments_agency_search.screen.big_filters.mvi.k(uVarD4, this.f136622f, this.f136625i);
            this.f136630n = new h(bVar);
            this.f136631o = new i(bVar);
            u<com.avito.android.developments_agency_search.screen.big_filters.converter.e> uVarD5 = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.big_filters.di.e(dagger.internal.l.a(resources), this.f136630n, this.f136631o));
            this.f136632p = uVarD5;
            this.f136633q = new t(uVarD5);
            this.f136634r = new d(bVar);
            this.f136635s = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f136634r);
            this.f136636t = new p(new com.avito.android.developments_agency_search.screen.big_filters.mvi.p(this.f136624h, this.f136629m, r.a(), this.f136633q, this.f136635s));
            u<InterfaceC34581l> uVarD6 = dagger.internal.g.d(C34585n.a());
            this.f136637u = uVarD6;
            e eVar = new e(bVar2);
            this.f136638v = eVar;
            u<q> uVarD7 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.chips.u(eVar, uVarD6));
            this.f136639w = uVarD7;
            C4122b c4122b = new C4122b(bVar);
            this.f136640x = c4122b;
            this.f136641y = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.big_filters.di.h(uVarD7, c4122b));
            u<com.avito.android.search.filter.adapter.chips.g> uVarD8 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.chips.l(this.f136638v, this.f136637u));
            this.f136642z = uVarD8;
            this.f136601A = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.big_filters.di.g(uVarD8, this.f136640x));
            u<com.avito.android.search.filter.adapter.double_input.u> uVarD9 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.double_input.q(this.f136637u));
            this.f136602B = uVarD9;
            this.f136603C = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.big_filters.di.i(uVarD9));
            u<com.avito.android.search.filter.adapter.checkbox.d> uVarD10 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.checkbox.h(this.f136637u));
            this.f136604D = uVarD10;
            this.f136605E = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.big_filters.di.f(uVarD10));
            u<com.avito.android.search.filter.adapter.select.d> uVarD11 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.select.j(this.f136637u));
            this.f136606F = uVarD11;
            this.f136607G = dagger.internal.g.d(new k(uVarD11));
            u<com.avito.android.search.filter.adapter.suggest_location.d> uVarD12 = dagger.internal.g.d(new com.avito.android.search.filter.adapter.suggest_location.i(this.f136637u));
            this.f136608H = uVarD12;
            this.f136609I = dagger.internal.g.d(new l(uVarD12));
            u<com.avito.android.search.filter.adapter.location_group.d> uVarD13 = dagger.internal.g.d(com.avito.android.search.filter.adapter.location_group.g.a());
            this.f136610J = uVarD13;
            this.f136612L = dagger.internal.g.d(new j(uVarD13, new c(bVar)));
            this.f136613M = B.a(com.avito.android.konveyor_adapter_module.d.a());
            A.b bVarA = A.a(7, 1);
            u<TV0.b<?, ?>> uVar = this.f136641y;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f136601A);
            list.add(this.f136603C);
            list.add(this.f136605E);
            list.add(this.f136607G);
            list.add(this.f136609I);
            list.add(this.f136612L);
            bVarA.f393938b.add(this.f136613M);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f136614N = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f136615O = uVarH;
            this.f136616P = dagger.internal.g.d(new com.avito.android.developments_agency_search.screen.big_filters.di.d(uVarH, this.f136614N));
        }

        @Override // com.avito.android.developments_agency_search.screen.big_filters.di.a
        public final void a(BigFiltersFragment bigFiltersFragment) {
            bigFiltersFragment.f136551h0 = this.f136636t;
            bigFiltersFragment.f136553j0 = this.f136635s.get();
            bigFiltersFragment.f136554k0 = this.f136616P.get();
            bigFiltersFragment.f136555l0 = this.f136615O.get();
            bigFiltersFragment.f136556m0 = this.f136637u.get();
            bigFiltersFragment.f136557n0 = this.f136610J.get();
            bigFiltersFragment.f136558o0 = new C49387a(this.f136617a.g());
        }
    }

    /* compiled from: DaggerBigFiltersComponent.java */
    public static final class c implements a.InterfaceC4121a {
        public c() {
        }

        @Override // com.avito.android.developments_agency_search.screen.big_filters.di.a.InterfaceC4121a
        public final com.avito.android.developments_agency_search.screen.big_filters.di.a a(BigFiltersArguments bigFiltersArguments, com.avito.android.developments_agency_search.screen.big_filters.di.b bVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Resources resources) {
            bigFiltersArguments.getClass();
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, bigFiltersArguments, c28478k, resources, null);
        }
    }

    public static a.InterfaceC4121a a() {
        return new c();
    }
}
