package com.avito.android.search_suggest.di;

import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.remote.model.SuggestParamsConverter;
import com.avito.android.remote.model.SuggestParamsConverterImpl_Factory;
import com.avito.android.search_suggest.SearchSuggestArguments;
import com.avito.android.search_suggest.SearchSuggestFragment;
import com.avito.android.search_suggest.di.c;
import com.avito.android.search_suggest.mvi.k;
import com.avito.android.search_suggest.mvi.m;
import com.avito.android.search_suggest.mvi.o;
import com.avito.android.search_suggest.x;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSearchSuggestComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSearchSuggestComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.search_suggest.di.c.a
        public final com.avito.android.search_suggest.di.c a(InterfaceC39417a interfaceC39417a, d dVar, SearchSuggestArguments searchSuggestArguments, C28478k c28478k, l lVar, boolean z12) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, searchSuggestArguments, c28478k, lVar, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerSearchSuggestComponent.java */
    public static final class c implements com.avito.android.search_suggest.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.list.list_snippet.f> f264179A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f264180B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.list.list_snippet.a> f264181C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.list.grid_snippet.e> f264182D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.list.grid_snippet.item.d> f264183E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.list.grid_snippet.a> f264184F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f264185G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f264186H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f264187I;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f264188a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.search_suggest.di.d f264189b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f264190c;

        /* renamed from: d, reason: collision with root package name */
        public final u<V0> f264191d;

        /* renamed from: e, reason: collision with root package name */
        public final u<SearchParamsConverter> f264192e;

        /* renamed from: f, reason: collision with root package name */
        public final u<SuggestParamsConverter> f264193f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.search_suggest.mvi.g f264194g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f264195h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.search_suggest.mvi.e f264196i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f264197j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f264198k;

        /* renamed from: l, reason: collision with root package name */
        public final x f264199l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f264200m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.list.banner.h> f264201n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.list.banner.g> f264202o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f264203p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.list.new_text_suggest.e> f264204q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.list.new_text_suggest.b> f264205r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.list.gap.h> f264206s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.list.gap.g> f264207t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.list.text_suggest.b> f264208u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.list.text_suggest.a> f264209v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.list.title.b> f264210w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.list.title.a> f264211x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.list.toggle.e> f264212y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.list.toggle.a> f264213z;

        /* compiled from: DaggerSearchSuggestComponent.java */
        /* renamed from: com.avito.android.search_suggest.di.a$c$a, reason: collision with other inner class name */
        public static final class C7883a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search_suggest.di.d f264214a;

            public C7883a(com.avito.android.search_suggest.di.d dVar) {
                this.f264214a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f264214a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSearchSuggestComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search_suggest.di.d f264215a;

            public b(com.avito.android.search_suggest.di.d dVar) {
                this.f264215a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f264215a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSearchSuggestComponent.java */
        /* renamed from: com.avito.android.search_suggest.di.a$c$c, reason: collision with other inner class name */
        public static final class C7884c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search_suggest.di.d f264216a;

            public C7884c(com.avito.android.search_suggest.di.d dVar) {
                this.f264216a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f264216a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSearchSuggestComponent.java */
        public static final class d implements u<V0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search_suggest.di.d f264217a;

            public d(com.avito.android.search_suggest.di.d dVar) {
                this.f264217a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V0 v0Z = this.f264217a.Z();
                t.c(v0Z);
                return v0Z;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.search_suggest.di.d dVar, cv.b bVar, SearchSuggestArguments searchSuggestArguments, C28478k c28478k, l lVar, Boolean bool, C7882a c7882a) {
            this.f264188a = bVar;
            this.f264189b = dVar;
            this.f264190c = dagger.internal.l.a(searchSuggestArguments);
            this.f264191d = new d(dVar);
            u<SearchParamsConverter> uVarD = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f264192e = uVarD;
            u<SuggestParamsConverter> uVarD2 = dagger.internal.g.d(SuggestParamsConverterImpl_Factory.create(uVarD));
            this.f264193f = uVarD2;
            u<V0> uVar = this.f264191d;
            u<SearchParamsConverter> uVar2 = this.f264192e;
            dagger.internal.l lVar2 = this.f264190c;
            com.avito.android.search_suggest.l lVar3 = new com.avito.android.search_suggest.l(lVar2, uVarD2, uVar, uVar2);
            this.f264194g = new com.avito.android.search_suggest.mvi.g(lVar2, lVar3);
            this.f264196i = new com.avito.android.search_suggest.mvi.e(lVar2, lVar3, new C7883a(dVar));
            this.f264197j = new C7884c(dVar);
            this.f264198k = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f264197j);
            this.f264199l = new x(new k(this.f264194g, this.f264196i, m.a(), o.a(), this.f264198k, this.f264190c));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f264200m = lVarA;
            u<com.avito.android.list.banner.h> uVarD3 = dagger.internal.g.d(new com.avito.android.search_suggest.adapter.banner.c(lVarA));
            this.f264201n = uVarD3;
            this.f264202o = dagger.internal.g.d(new com.avito.android.list.banner.b(uVarD3));
            dagger.internal.l lVarA2 = dagger.internal.l.a(bool);
            this.f264203p = lVarA2;
            u<com.avito.android.list.new_text_suggest.e> uVarD4 = dagger.internal.g.d(new com.avito.android.search_suggest.adapter.new_text_suggest.c(this.f264200m, lVarA2));
            this.f264204q = uVarD4;
            this.f264205r = dagger.internal.g.d(new com.avito.android.list.new_text_suggest.d(uVarD4));
            u<com.avito.android.list.gap.h> uVarD5 = dagger.internal.g.d(com.avito.android.list.gap.d.a());
            this.f264206s = uVarD5;
            this.f264207t = dagger.internal.g.d(new com.avito.android.list.gap.b(uVarD5));
            u<com.avito.android.list.text_suggest.b> uVarD6 = dagger.internal.g.d(new com.avito.android.search_suggest.adapter.text_suggest.d(this.f264200m, this.f264203p));
            this.f264208u = uVarD6;
            this.f264209v = dagger.internal.g.d(new com.avito.android.list.text_suggest.d(uVarD6));
            u<com.avito.android.list.title.b> uVarD7 = dagger.internal.g.d(com.avito.android.list.title.f.a());
            this.f264210w = uVarD7;
            this.f264211x = dagger.internal.g.d(new com.avito.android.list.title.d(uVarD7));
            u<com.avito.android.list.toggle.e> uVarD8 = dagger.internal.g.d(new com.avito.android.search_suggest.adapter.toggle.c(this.f264200m));
            this.f264212y = uVarD8;
            this.f264213z = dagger.internal.g.d(new com.avito.android.list.toggle.c(uVarD8));
            u<com.avito.android.list.list_snippet.f> uVarD9 = dagger.internal.g.d(new com.avito.android.search_suggest.adapter.list_snippet.c(this.f264200m));
            this.f264179A = uVarD9;
            b bVar2 = new b(dVar);
            this.f264180B = bVar2;
            this.f264181C = dagger.internal.g.d(new com.avito.android.list.list_snippet.c(uVarD9, bVar2));
            this.f264182D = dagger.internal.g.d(com.avito.android.list.grid_snippet.g.a());
            u<com.avito.android.list.grid_snippet.item.d> uVarD10 = dagger.internal.g.d(new com.avito.android.search_suggest.adapter.grid_snippet.c(this.f264200m));
            this.f264183E = uVarD10;
            u<com.avito.android.list.grid_snippet.a> uVarD11 = dagger.internal.g.d(new com.avito.android.list.grid_snippet.c(this.f264182D, new com.avito.android.list.grid_snippet.item.b(uVarD10, this.f264180B)));
            this.f264184F = uVarD11;
            u<com.avito.konveyor.a> uVarD12 = dagger.internal.g.d(new i(uVarD11, this.f264202o, this.f264205r, this.f264207t, this.f264209v, this.f264211x, this.f264213z, this.f264181C));
            this.f264185G = uVarD12;
            u<com.avito.konveyor.adapter.a> uVarD13 = dagger.internal.g.d(new h(uVarD12));
            this.f264186H = uVarD13;
            this.f264187I = dagger.internal.g.d(new j(uVarD13, this.f264185G));
        }

        @Override // com.avito.android.search_suggest.di.c
        public final void a(SearchSuggestFragment searchSuggestFragment) {
            searchSuggestFragment.f264115t0 = this.f264199l;
            searchSuggestFragment.f264116u0 = this.f264198k.get();
            searchSuggestFragment.f264117v0 = this.f264187I.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f264188a.u4();
            t.c(aVarU4);
            searchSuggestFragment.f264118w0 = aVarU4;
            com.avito.android.ui.status_bar.e eVarB0 = this.f264189b.b0();
            t.c(eVarB0);
            searchSuggestFragment.f264119x0 = eVarB0;
        }
    }

    public static c.a a() {
        return new b();
    }
}
