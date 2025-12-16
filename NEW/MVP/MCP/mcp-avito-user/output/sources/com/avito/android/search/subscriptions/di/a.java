package com.avito.android.search.subscriptions.di;

import Go0.InterfaceC13902a;
import android.content.Context;
import android.content.res.Resources;
import com.avito.android.C34160q2;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.search.subscriptions.SearchSubscriptionFragment;
import com.avito.android.search.subscriptions.di.c;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import cv.InterfaceC39417a;
import java.util.Locale;

/* compiled from: DaggerSearchSubscriptionComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSearchSubscriptionComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.search.subscriptions.di.c.a
        public final com.avito.android.search.subscriptions.di.c a(d dVar, InterfaceC39417a interfaceC39417a, com.avito.android.analytics.screens.r rVar, Context context, Resources resources, FavoritesSpace favoritesSpace) {
            interfaceC39417a.getClass();
            favoritesSpace.getClass();
            return new c(dVar, interfaceC39417a, rVar, context, resources, favoritesSpace, null);
        }
    }

    /* compiled from: DaggerSearchSubscriptionComponent.java */
    public static final class c implements com.avito.android.search.subscriptions.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<EE0.d> f263892A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f263893B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<SK0.b> f263894C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<C34160q2> f263895D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<Rp0.b> f263896E;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f263897a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.search.subscriptions.di.d f263898b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f263899c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC13902a> f263900d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.db.n> f263901e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<TV.c> f263902f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f263903g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<SearchParamsConverter> f263904h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.remote.error.f> f263905i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.libs.saved_searches.domain.i> f263906j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<VV.a> f263907k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.subscriptions.l> f263908l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<TV.f> f263909m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<G> f263910n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.f f263911o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<Locale> f263912p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.j> f263913q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<Long>> f263914r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.search.subscriptions.adapter.e> f263915s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f263916t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f263917u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f263918v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<H> f263919w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28499v> f263920x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28501x> f263921y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.screens.o> f263922z;

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        /* renamed from: com.avito.android.search.subscriptions.di.a$c$a, reason: collision with other inner class name */
        public static final class C7876a implements dagger.internal.u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263923a;

            public C7876a(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263923a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f263923a.w();
                dagger.internal.t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class b implements dagger.internal.u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263924a;

            public b(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263924a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f263924a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        /* renamed from: com.avito.android.search.subscriptions.di.a$c$c, reason: collision with other inner class name */
        public static final class C7877c implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f263925a;

            public C7877c(cv.b bVar) {
                this.f263925a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f263925a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263926a;

            public d(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263926a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f263926a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class e implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263927a;

            public e(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263927a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263927a.locale();
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC13902a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263928a;

            public f(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263928a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13902a interfaceC13902aH3 = this.f263928a.H3();
                dagger.internal.t.c(interfaceC13902aH3);
                return interfaceC13902aH3;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class g implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263929a;

            public g(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263929a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f263929a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class h implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263930a;

            public h(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263930a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f263930a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class i implements dagger.internal.u<C34160q2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263931a;

            public i(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263931a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263931a.G3();
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class j implements dagger.internal.u<TV.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263932a;

            public j(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263932a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                TV.c cVarG2 = this.f263932a.G2();
                dagger.internal.t.c(cVarG2);
                return cVarG2;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class k implements dagger.internal.u<com.avito.android.db.n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263933a;

            public k(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263933a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263933a.g2();
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class l implements dagger.internal.u<TV.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263934a;

            public l(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263934a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                TV.f fVarC2 = this.f263934a.c2();
                dagger.internal.t.c(fVarC2);
                return fVarC2;
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class m implements dagger.internal.u<VV.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263935a;

            public m(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263935a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263935a.Xl();
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class n implements dagger.internal.u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263936a;

            public n(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263936a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f263936a.o();
            }
        }

        /* compiled from: DaggerSearchSubscriptionComponent.java */
        public static final class o implements dagger.internal.u<com.avito.android.server_time.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.search.subscriptions.di.d f263937a;

            public o(com.avito.android.search.subscriptions.di.d dVar) {
                this.f263937a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.j jVarN1 = this.f263937a.N1();
                dagger.internal.t.c(jVarN1);
                return jVarN1;
            }
        }

        public c(com.avito.android.search.subscriptions.di.d dVar, cv.b bVar, com.avito.android.analytics.screens.r rVar, Context context, Resources resources, FavoritesSpace favoritesSpace, C7875a c7875a) {
            this.f263897a = bVar;
            this.f263898b = dVar;
            this.f263899c = new d(dVar);
            this.f263900d = new f(dVar);
            this.f263901e = new k(dVar);
            this.f263902f = new j(dVar);
            this.f263903g = new g(dVar);
            dagger.internal.u<SearchParamsConverter> uVarD = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f263904h = uVarD;
            this.f263906j = dagger.internal.g.d(new com.avito.android.libs.saved_searches.domain.u(this.f263900d, this.f263901e, this.f263902f, this.f263903g, new n(dVar), uVarD));
            this.f263908l = dagger.internal.g.d(new com.avito.android.search.subscriptions.n(dagger.internal.l.a(context), new m(dVar)));
            this.f263909m = new l(dVar);
            this.f263910n = new C7876a(dVar);
            this.f263911o = new dagger.internal.f();
            dagger.internal.u<InterfaceC35945t1<Long>> uVarD2 = dagger.internal.g.d(new com.avito.android.search.subscriptions.di.f(new e(dVar), new o(dVar)));
            this.f263914r = uVarD2;
            dagger.internal.u<com.avito.android.search.subscriptions.adapter.e> uVarD3 = dagger.internal.g.d(new com.avito.android.search.subscriptions.adapter.j(this.f263911o, uVarD2));
            this.f263915s = uVarD3;
            dagger.internal.u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new com.avito.android.search.subscriptions.di.g(new com.avito.android.search.subscriptions.adapter.b(uVarD3)));
            this.f263916t = uVarD4;
            this.f263917u = dagger.internal.g.d(new com.avito.android.search.subscriptions.di.h(uVarD4));
            this.f263918v = new h(dVar);
            dagger.internal.u<H> uVarD5 = dagger.internal.g.d(new u(dagger.internal.l.a(rVar), this.f263918v));
            this.f263919w = uVarD5;
            this.f263920x = dagger.internal.g.d(new r(uVarD5));
            this.f263921y = dagger.internal.g.d(new t(this.f263919w));
            dagger.internal.u<com.avito.android.analytics.screens.o> uVarD6 = dagger.internal.g.d(new s(this.f263919w));
            this.f263922z = uVarD6;
            this.f263892A = dagger.internal.g.d(new EE0.f(uVarD6, this.f263920x, this.f263921y));
            this.f263893B = new C7877c(bVar);
            this.f263896E = dagger.internal.g.d(new Rp0.c(new b(dVar), new i(dVar)));
            dagger.internal.f.a(this.f263911o, dagger.internal.g.d(new com.avito.android.search.subscriptions.j(this.f263899c, this.f263906j, this.f263908l, this.f263909m, this.f263910n, this.f263903g, this.f263917u, this.f263892A, this.f263893B, this.f263896E, dagger.internal.l.a(favoritesSpace))));
        }

        @Override // com.avito.android.search.subscriptions.di.c
        public final void a(SearchSubscriptionFragment searchSubscriptionFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f263897a.u4();
            dagger.internal.t.c(aVarU4);
            searchSubscriptionFragment.f263840n0 = aVarU4;
            searchSubscriptionFragment.f263841o0 = (com.avito.android.search.subscriptions.d) this.f263911o.get();
            searchSubscriptionFragment.f263842p0 = this.f263917u.get();
            searchSubscriptionFragment.f263843q0 = this.f263916t.get();
            InterfaceC28373a interfaceC28373aA = this.f263898b.a();
            dagger.internal.t.c(interfaceC28373aA);
            searchSubscriptionFragment.f263844r0 = interfaceC28373aA;
            searchSubscriptionFragment.f263845s0 = this.f263892A.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
