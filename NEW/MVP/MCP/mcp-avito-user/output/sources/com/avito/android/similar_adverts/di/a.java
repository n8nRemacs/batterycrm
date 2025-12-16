package com.avito.android.similar_adverts.di;

import Lw0.InterfaceC14445b;
import Pw0.InterfaceC14847b;
import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.view.InterfaceC22983P;
import androidx.view.S0;
import com.avito.android.C36135w2;
import com.avito.android.account.E;
import com.avito.android.analytics.C28528v;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.e0;
import com.avito.android.di.g0;
import com.avito.android.di.module.C30008c8;
import com.avito.android.di.module.C30019d8;
import com.avito.android.di.module.C30052g8;
import com.avito.android.di.module.C30107l8;
import com.avito.android.di.module.C30140o8;
import com.avito.android.di.module.C30205u8;
import com.avito.android.di.module.L;
import com.avito.android.di.module.M9;
import com.avito.android.di.module.N9;
import com.avito.android.di.module.S4;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.favorite.x;
import com.avito.android.favorite_sellers.S;
import com.avito.android.favorite_sellers.U;
import com.avito.android.rec.ScreenSource;
import com.avito.android.section.SectionItemConverter;
import com.avito.android.serp.adapter.G;
import com.avito.android.serp.adapter.InterfaceC34748n0;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.P;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.f1;
import com.avito.android.serp.adapter.h1;
import com.avito.android.serp.adapter.n1;
import com.avito.android.similar_adverts.SimilarAdvertsDialog;
import com.avito.android.similar_adverts.di.e;
import com.avito.android.similar_adverts.di.h;
import com.avito.android.similar_adverts.di.m;
import com.avito.android.similar_adverts.di.n;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import fa.InterfaceC40383a;
import gj.InterfaceC40691b;
import java.util.Locale;
import qC.C47278d;

/* compiled from: DaggerSimilarAdvertsComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSimilarAdvertsComponent.java */
    public static final class b implements h.a {
        public b() {
        }

        @Override // com.avito.android.similar_adverts.di.h.a
        public final h a(Resources resources, SimilarAdvertsDialog similarAdvertsDialog, String str, ScreenSource.FAVORITES favorites, boolean z12, r rVar, S0 s02, i iVar, InterfaceC39417a interfaceC39417a) {
            favorites.getClass();
            interfaceC39417a.getClass();
            return new c(iVar, interfaceC39417a, resources, similarAdvertsDialog, str, favorites, Boolean.valueOf(z12), rVar, s02, null);
        }
    }

    /* compiled from: DaggerSimilarAdvertsComponent.java */
    public static final class c implements com.avito.android.similar_adverts.di.h {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.constructor_advert.ui.serp.constructor.f> f283825A;

        /* renamed from: B, reason: collision with root package name */
        public final u<C> f283826B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.section.c> f283827C;

        /* renamed from: D, reason: collision with root package name */
        public final u<S> f283828D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.serp.adapter.images_and_links_item.d> f283829E;

        /* renamed from: F, reason: collision with root package name */
        public final u<T> f283830F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.advert.viewed.persistance.j> f283831G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.advert.viewed.a> f283832H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.advert.viewed.d> f283833I;

        /* renamed from: J, reason: collision with root package name */
        public final u<n1> f283834J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.serp.adapter.recomendations.j> f283835K;

        /* renamed from: L, reason: collision with root package name */
        public final u<SectionItemConverter> f283836L;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.similar_adverts.q f283837M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC34863v> f283838N;

        /* renamed from: O, reason: collision with root package name */
        public final u<InterfaceC34748n0> f283839O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.server_time.a> f283840P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<Locale> f283841Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.connection_quality.connectivity.a> f283842R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.android.similar_adverts.adapter.a> f283843S;

        /* renamed from: T, reason: collision with root package name */
        public final u<com.avito.android.section.title.a> f283844T;

        /* renamed from: U, reason: collision with root package name */
        public final u<com.avito.android.section.action.b> f283845U;

        /* renamed from: V, reason: collision with root package name */
        public final u<Vp0.b> f283846V;

        /* renamed from: W, reason: collision with root package name */
        public final com.avito.android.similar_adverts.adapter.g f283847W;

        /* renamed from: X, reason: collision with root package name */
        public final u<com.avito.android.serp.adapter.skeleton.g> f283848X;

        /* renamed from: Y, reason: collision with root package name */
        public final com.avito.android.similar_adverts.adapter.e f283849Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<com.avito.android.similar_adverts.adapter.skeleton_title.d> f283850Z;

        /* renamed from: a, reason: collision with root package name */
        public final u<x> f283851a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f283852a0;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.favorite.r> f283853b;

        /* renamed from: b0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f283854b0;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC30570d> f283855c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f283856c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f283857d;

        /* renamed from: d0, reason: collision with root package name */
        public final com.avito.android.similar_adverts.di.o f283858d0;

        /* renamed from: e, reason: collision with root package name */
        public final u<E> f283859e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<h1> f283860e0;

        /* renamed from: f, reason: collision with root package name */
        public final u<SK0.b> f283861f;

        /* renamed from: f0, reason: collision with root package name */
        public final u<Y0> f283862f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f283863g;

        /* renamed from: g0, reason: collision with root package name */
        public final u<GridLayoutManager.c> f283864g0;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.favorite.m f283865h;

        /* renamed from: h0, reason: collision with root package name */
        public final u<com.avito.android.similar_adverts.i> f283866h0;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.favorite.n> f283867i;

        /* renamed from: i0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f283868i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f283869j;

        /* renamed from: j0, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.c> f283870j0;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f283871k;

        /* renamed from: k0, reason: collision with root package name */
        public final u<InterfaceC14847b> f283872k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.advert_collection_toast.c> f283873l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f283874m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f283875n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC40383a> f283876o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.similar_adverts.d> f283877p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f283878q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f283879r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC14445b> f283880s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.similar_adverts.mvi.h f283881t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f283882u;

        /* renamed from: v, reason: collision with root package name */
        public final u<G> f283883v;

        /* renamed from: w, reason: collision with root package name */
        public final u<G> f283884w;

        /* renamed from: x, reason: collision with root package name */
        public final u<C36135w2> f283885x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC34904z0> f283886y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC40691b> f283887z;

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        /* renamed from: com.avito.android.similar_adverts.di.a$c$a, reason: collision with other inner class name */
        public static final class C8468a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283888a;

            public C8468a(com.avito.android.similar_adverts.di.i iVar) {
                this.f283888a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f283888a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class b implements u<InterfaceC40383a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283889a;

            public b(com.avito.android.similar_adverts.di.i iVar) {
                this.f283889a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40383a interfaceC40383aD2 = this.f283889a.d2();
                t.c(interfaceC40383aD2);
                return interfaceC40383aD2;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        /* renamed from: com.avito.android.similar_adverts.di.a$c$c, reason: collision with other inner class name */
        public static final class C8469c implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283890a;

            public C8469c(com.avito.android.similar_adverts.di.i iVar) {
                this.f283890a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f283890a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class d implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283891a;

            public d(com.avito.android.similar_adverts.di.i iVar) {
                this.f283891a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f283891a.p();
                t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class e implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283892a;

            public e(com.avito.android.similar_adverts.di.i iVar) {
                this.f283892a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f283892a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class f implements u<com.avito.android.connection_quality.connectivity.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283893a;

            public f(com.avito.android.similar_adverts.di.i iVar) {
                this.f283893a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.connection_quality.connectivity.a aVarU = this.f283893a.U();
                t.c(aVarU);
                return aVarU;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class g implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f283894a;

            public g(cv.b bVar) {
                this.f283894a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f283894a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class h implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283895a;

            public h(com.avito.android.similar_adverts.di.i iVar) {
                this.f283895a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f283895a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class i implements u<InterfaceC30570d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283896a;

            public i(com.avito.android.similar_adverts.di.i iVar) {
                this.f283896a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30570d interfaceC30570dJ0 = this.f283896a.J0();
                t.c(interfaceC30570dJ0);
                return interfaceC30570dJ0;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class j implements u<com.avito.android.favorite.r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283897a;

            public j(com.avito.android.similar_adverts.di.i iVar) {
                this.f283897a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.favorite.r rVarL0 = this.f283897a.L0();
                t.c(rVarL0);
                return rVarL0;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class k implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283898a;

            public k(com.avito.android.similar_adverts.di.i iVar) {
                this.f283898a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f283898a.m0();
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class l implements u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283899a;

            public l(com.avito.android.similar_adverts.di.i iVar) {
                this.f283899a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f283899a.T();
                t.c(aVarT);
                return aVarT;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class m implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283900a;

            public m(com.avito.android.similar_adverts.di.i iVar) {
                this.f283900a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f283900a.locale();
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class n implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283901a;

            public n(com.avito.android.similar_adverts.di.i iVar) {
                this.f283901a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f283901a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class o implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283902a;

            public o(com.avito.android.similar_adverts.di.i iVar) {
                this.f283902a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f283902a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class p implements u<C36135w2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283903a;

            public p(com.avito.android.similar_adverts.di.i iVar) {
                this.f283903a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f283903a.e0();
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class q implements u<com.avito.android.advert.viewed.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283904a;

            public q(com.avito.android.similar_adverts.di.i iVar) {
                this.f283904a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert.viewed.a aVarD0 = this.f283904a.D0();
                t.c(aVarD0);
                return aVarD0;
            }
        }

        /* compiled from: DaggerSimilarAdvertsComponent.java */
        public static final class r implements u<com.avito.android.advert.viewed.persistance.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.similar_adverts.di.i f283905a;

            public r(com.avito.android.similar_adverts.di.i iVar) {
                this.f283905a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert.viewed.persistance.j jVarQ0 = this.f283905a.q0();
                t.c(jVarQ0);
                return jVarQ0;
            }
        }

        public c(com.avito.android.similar_adverts.di.i iVar, cv.b bVar, Resources resources, InterfaceC22983P interfaceC22983P, String str, ScreenSource screenSource, Boolean bool, com.avito.android.analytics.screens.r rVar, S0 s02, C8467a c8467a) {
            k kVar = new k(iVar);
            j jVar = new j(iVar);
            i iVar2 = new i(iVar);
            C8469c c8469c = new C8469c(iVar);
            this.f283857d = c8469c;
            C8468a c8468a = new C8468a(iVar);
            this.f283859e = c8468a;
            C28528v c28528v = new C28528v(c8469c, c8468a);
            d dVar = new d(iVar);
            this.f283861f = dVar;
            C47278d c47278d = new C47278d(dVar);
            n nVar = new n(iVar);
            this.f283863g = nVar;
            com.avito.android.favorite.m mVar = new com.avito.android.favorite.m(kVar, jVar, iVar2, c28528v, c47278d, nVar);
            this.f283865h = mVar;
            this.f283867i = B.a(new S4(mVar, nVar, n.a.f283923a));
            g gVar = new g(bVar);
            this.f283869j = gVar;
            X7.c cVar = new X7.c(this.f283857d);
            h hVar = new h(iVar);
            this.f283871k = hVar;
            this.f283873l = B.a(new com.avito.android.advert_collection_toast.e(this.f283859e, gVar, cVar, m.a.f283922a, hVar));
            this.f283874m = dagger.internal.l.a(str);
            dagger.internal.l lVarA = dagger.internal.l.a(screenSource);
            this.f283875n = lVarA;
            this.f283877p = dagger.internal.g.d(new com.avito.android.similar_adverts.g(lVarA, new b(iVar), this.f283863g));
            this.f283878q = new o(iVar);
            u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new com.avito.android.similar_adverts.di.k(dagger.internal.l.a(rVar), this.f283878q));
            this.f283879r = uVarD;
            u<InterfaceC14445b> uVarD2 = dagger.internal.g.d(new Lw0.d(uVarD));
            this.f283880s = uVarD2;
            this.f283881t = new com.avito.android.similar_adverts.mvi.h(this.f283874m, uVarD2, this.f283877p);
            dagger.internal.l lVarA2 = dagger.internal.l.a(resources);
            this.f283882u = lVarA2;
            this.f283883v = B.a(new C30205u8(lVarA2));
            u<G> uVarA = B.a(new C30052g8(this.f283882u));
            this.f283884w = uVarA;
            p pVar = new p(iVar);
            this.f283885x = pVar;
            this.f283886y = B.a(new C30019d8(this.f283883v, uVarA, this.f283882u, pVar, P.a()));
            u<InterfaceC40691b> uVarD3 = dagger.internal.g.d(C30008c8.a());
            this.f283887z = uVarD3;
            u<com.avito.android.constructor_advert.ui.serp.constructor.f> uVarA2 = B.a(new C30107l8(uVarD3, this.f283885x));
            this.f283825A = uVarA2;
            this.f283827C = B.a(new com.avito.android.section.e(uVarA2, new e(iVar), this.f283886y));
            this.f283828D = B.a(U.a());
            this.f283829E = B.a(com.avito.android.serp.adapter.images_and_links_item.f.a());
            this.f283830F = B.a(new C30140o8(this.f283865h));
            u<com.avito.android.advert.viewed.d> uVarA3 = B.a(e0.a(new r(iVar), new q(iVar), this.f283871k));
            this.f283833I = uVarA3;
            this.f283834J = B.a(g0.a(uVarA3));
            u<com.avito.android.serp.adapter.recomendations.j> uVarD4 = dagger.internal.g.d(com.avito.android.serp.adapter.recomendations.l.a());
            this.f283835K = uVarD4;
            this.f283836L = B.a(new com.avito.android.section.n(this.f283827C, this.f283828D, this.f283829E, this.f283830F, this.f283834J, this.f283871k, this.f283863g, uVarD4));
            com.avito.android.similar_adverts.q qVar = new com.avito.android.similar_adverts.q(this.f283867i, this.f283873l, this.f283869j, this.f283874m, this.f283875n, this.f283857d, new com.avito.android.similar_adverts.mvi.k(this.f283881t, new com.avito.android.similar_adverts.mvi.c(this.f283874m, dagger.internal.l.a(bool), this.f283877p, this.f283836L, this.f283880s), com.avito.android.similar_adverts.mvi.m.a()));
            this.f283837M = qVar;
            u<InterfaceC34863v> uVarD5 = dagger.internal.g.d(qVar);
            this.f283838N = uVarD5;
            u<InterfaceC34748n0> uVarA4 = B.a(new L(uVarD5, this.f283857d, this.f283885x));
            this.f283839O = uVarA4;
            this.f283843S = dagger.internal.g.d(new com.avito.android.similar_adverts.adapter.c(uVarA4, new l(iVar), new m(iVar), new f(iVar)));
            this.f283844T = B.a(com.avito.android.section.title.c.a());
            u<com.avito.android.section.action.b> uVarA5 = B.a(com.avito.android.section.action.e.a());
            this.f283845U = uVarA5;
            u<Vp0.b> uVarA6 = B.a(new Vp0.d(uVarA5, this.f283844T));
            this.f283846V = uVarA6;
            this.f283847W = new com.avito.android.similar_adverts.adapter.g(uVarA6);
            u<com.avito.android.serp.adapter.skeleton.g> uVarD6 = dagger.internal.g.d(com.avito.android.serp.adapter.skeleton.i.a());
            this.f283848X = uVarD6;
            this.f283849Y = new com.avito.android.similar_adverts.adapter.e(uVarD6);
            u<com.avito.android.similar_adverts.adapter.skeleton_title.d> uVarD7 = dagger.internal.g.d(com.avito.android.similar_adverts.adapter.skeleton_title.f.a());
            this.f283850Z = uVarD7;
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new com.avito.android.similar_adverts.di.f(this.f283843S, this.f283847W, this.f283849Y, new com.avito.android.similar_adverts.adapter.skeleton_title.b(uVarD7)));
            this.f283852a0 = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new com.avito.android.similar_adverts.di.c(uVarD8));
            this.f283854b0 = uVarD9;
            this.f283856c0 = dagger.internal.g.d(new com.avito.android.similar_adverts.di.g(uVarD9, this.f283852a0));
            com.avito.android.similar_adverts.di.o oVar = new com.avito.android.similar_adverts.di.o(this.f283882u);
            this.f283858d0 = oVar;
            u<h1> uVarA7 = B.a(new N9(oVar));
            this.f283860e0 = uVarA7;
            u<Y0> uVarA8 = B.a(new M9(uVarA7, this.f283858d0));
            this.f283862f0 = uVarA8;
            this.f283864g0 = B.a(new f1(uVarA8));
            this.f283866h0 = dagger.internal.g.d(new com.avito.android.similar_adverts.k(this.f283882u));
            u<com.avito.android.recycler.data_aware.e> uVarD10 = dagger.internal.g.d(e.a.f283911a);
            this.f283868i0 = uVarD10;
            this.f283870j0 = dagger.internal.g.d(new com.avito.android.similar_adverts.di.d(uVarD10, this.f283856c0, this.f283854b0));
            this.f283872k0 = dagger.internal.g.d(new Pw0.d(this.f283861f, this.f283885x));
        }

        @Override // com.avito.android.similar_adverts.di.h
        public final void a(SimilarAdvertsDialog similarAdvertsDialog) {
            similarAdvertsDialog.f283777h0 = this.f283837M;
            similarAdvertsDialog.f283779j0 = this.f283856c0.get();
            similarAdvertsDialog.f283780k0 = this.f283864g0.get();
            similarAdvertsDialog.f283781l0 = this.f283867i.get();
            similarAdvertsDialog.f283782m0 = this.f283866h0.get();
            similarAdvertsDialog.f283783n0 = this.f283870j0.get();
            similarAdvertsDialog.f283784o0 = this.f283862f0.get();
            similarAdvertsDialog.f283785p0 = this.f283873l.get();
            similarAdvertsDialog.f283786q0 = this.f283880s.get();
            similarAdvertsDialog.f283787r0 = this.f283836L.get();
            similarAdvertsDialog.f283788s0 = this.f283845U.get();
            similarAdvertsDialog.f283789t0 = this.f283872k0.get();
        }
    }

    public static h.a a() {
        return new b();
    }
}
