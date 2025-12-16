package com.avito.android.stories.di.component;

import Cx0.C13371c;
import android.content.res.Resources;
import android.webkit.CookieManager;
import com.avito.android.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.stories.D;
import com.avito.android.stories.E;
import com.avito.android.stories.F;
import com.avito.android.stories.StoriesArguments;
import com.avito.android.stories.StoriesFragment;
import com.avito.android.stories.di.component.b;
import com.avito.android.stories.mvi.m;
import com.avito.android.stories.mvi.o;
import com.avito.android.stories.mvi.q;
import com.avito.android.stories.r;
import com.avito.android.stories.s;
import com.avito.android.util.C;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import rm0.InterfaceC47681a;

/* compiled from: DaggerStoriesComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerStoriesComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.stories.di.component.b.a
        public final com.avito.android.stories.di.component.b a(Resources resources, com.avito.android.stories.di.component.c cVar, StoriesArguments storiesArguments, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, resources, storiesArguments, c28478k, null);
        }
    }

    /* compiled from: DaggerStoriesComponent.java */
    public static final class c implements com.avito.android.stories.di.component.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.stories.di.component.c f285096a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources f285097b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f285098c;

        /* renamed from: d, reason: collision with root package name */
        public final C13371c f285099d;

        /* renamed from: e, reason: collision with root package name */
        public final u<x> f285100e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f285101f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f285102g;

        /* renamed from: h, reason: collision with root package name */
        public final u<CookieManager> f285103h = dagger.internal.g.d(com.avito.android.stories.di.module.b.a());

        /* renamed from: i, reason: collision with root package name */
        public final u<M> f285104i;

        /* renamed from: j, reason: collision with root package name */
        public final u<P0> f285105j;

        /* renamed from: k, reason: collision with root package name */
        public final u<B0> f285106k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC47681a> f285107l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f285108m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C> f285109n;

        /* renamed from: o, reason: collision with root package name */
        public final u<H0> f285110o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f285111p;

        /* renamed from: q, reason: collision with root package name */
        public final u<I> f285112q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.stories.I f285113r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.stories.mvi.h f285114s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f285115t;

        /* renamed from: u, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f285116u;

        /* renamed from: v, reason: collision with root package name */
        public final m f285117v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f285118w;

        /* compiled from: DaggerStoriesComponent.java */
        /* renamed from: com.avito.android.stories.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C8531a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285119a;

            public C8531a(com.avito.android.stories.di.component.c cVar) {
                this.f285119a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f285119a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class b implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285120a;

            public b(com.avito.android.stories.di.component.c cVar) {
                this.f285120a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f285120a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        /* renamed from: com.avito.android.stories.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C8532c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285121a;

            public C8532c(com.avito.android.stories.di.component.c cVar) {
                this.f285121a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f285121a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f285122a;

            public d(cv.b bVar) {
                this.f285122a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f285122a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class e implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285123a;

            public e(com.avito.android.stories.di.component.c cVar) {
                this.f285123a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285123a.U2();
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class f implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285124a;

            public f(com.avito.android.stories.di.component.c cVar) {
                this.f285124a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285124a.X2();
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class g implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285125a;

            public g(com.avito.android.stories.di.component.c cVar) {
                this.f285125a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f285125a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class h implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285126a;

            public h(com.avito.android.stories.di.component.c cVar) {
                this.f285126a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285126a.n0();
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285127a;

            public i(com.avito.android.stories.di.component.c cVar) {
                this.f285127a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f285127a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class j implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285128a;

            public j(com.avito.android.stories.di.component.c cVar) {
                this.f285128a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f285128a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class k implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285129a;

            public k(com.avito.android.stories.di.component.c cVar) {
                this.f285129a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285129a.s5();
            }
        }

        /* compiled from: DaggerStoriesComponent.java */
        public static final class l implements u<P0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.stories.di.component.c f285130a;

            public l(com.avito.android.stories.di.component.c cVar) {
                this.f285130a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285130a.d1();
            }
        }

        public c(com.avito.android.stories.di.component.c cVar, cv.b bVar, Resources resources, StoriesArguments storiesArguments, C28478k c28478k, C8530a c8530a) {
            this.f285096a = cVar;
            this.f285097b = resources;
            this.f285099d = new C13371c(new C8531a(cVar));
            this.f285100e = new C8532c(cVar);
            this.f285101f = new d(bVar);
            this.f285102g = dagger.internal.l.a(storiesArguments);
            u<com.avito.android.cookie_provider.e> uVarD = dagger.internal.g.d(new com.avito.android.stories.di.module.c(new f(cVar), new l(cVar), new k(cVar), new h(cVar), new com.avito.android.cookie_provider.d(new j(cVar)), new b(cVar), new g(cVar)));
            this.f285111p = uVarD;
            this.f285113r = new com.avito.android.stories.I(this.f285102g, uVarD, this.f285103h, new e(cVar));
            this.f285114s = new com.avito.android.stories.mvi.h(this.f285099d, this.f285100e, this.f285101f, this.f285113r, new s(dagger.internal.l.a(resources)));
            this.f285115t = new i(cVar);
            this.f285116u = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f285115t);
            this.f285117v = new m(this.f285102g);
            this.f285118w = dagger.internal.l.a(new F(new E(new com.avito.android.stories.mvi.k(this.f285114s, o.a(), q.a(), this.f285116u, this.f285117v))));
        }

        @Override // com.avito.android.stories.di.component.b
        public final void a(StoriesFragment storiesFragment) {
            storiesFragment.f284996u0 = (D.a) this.f285118w.f393949a;
            storiesFragment.f284999x0 = this.f285116u.get();
            storiesFragment.f285000y0 = this.f285096a.h();
            new r(this.f285097b);
        }
    }

    public static b.a a() {
        return new b();
    }
}
