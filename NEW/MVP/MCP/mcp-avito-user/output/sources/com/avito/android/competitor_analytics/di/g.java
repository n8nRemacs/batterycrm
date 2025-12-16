package com.avito.android.competitor_analytics.di;

import Yq.C18317c;
import Yq.InterfaceC18315a;
import br.InterfaceC25696a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.competitor_analytics.CompetitorAnalyticsActivity;
import com.avito.android.competitor_analytics.di.a;
import com.avito.android.competitor_analytics.domain.j;
import com.avito.android.competitor_analytics.mvi.i;
import com.avito.android.competitor_analytics.mvi.k;
import com.avito.android.competitor_analytics.mvi.m;
import com.avito.android.competitor_analytics.n;
import com.avito.android.di.module.C30060h5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCompetitorAnalyticsComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class g {

    /* compiled from: DaggerCompetitorAnalyticsComponent.java */
    public static final class b implements com.avito.android.competitor_analytics.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f124252a;

        /* renamed from: b, reason: collision with root package name */
        public final l f124253b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC25696a> f124254c;

        /* renamed from: d, reason: collision with root package name */
        public final u<AK0.l> f124255d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f124256e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.competitor_analytics.storage.a> f124257f;

        /* renamed from: g, reason: collision with root package name */
        public final u<KO.a> f124258g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.competitor_analytics.domain.c f124259h;

        /* renamed from: i, reason: collision with root package name */
        public final j f124260i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.competitor_analytics.domain.d> f124261j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.competitor_analytics.mvi.f f124262k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.competitor_analytics.mvi.d f124263l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28373a> f124264m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC18315a> f124265n;

        /* renamed from: o, reason: collision with root package name */
        public final k f124266o;

        /* renamed from: p, reason: collision with root package name */
        public final m f124267p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f124268q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f124269r;

        /* renamed from: s, reason: collision with root package name */
        public final n f124270s;

        /* compiled from: DaggerCompetitorAnalyticsComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.competitor_analytics.di.d f124271a;

            public a(com.avito.android.competitor_analytics.di.d dVar) {
                this.f124271a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f124271a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCompetitorAnalyticsComponent.java */
        /* renamed from: com.avito.android.competitor_analytics.di.g$b$b, reason: collision with other inner class name */
        public static final class C3709b implements u<InterfaceC25696a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.competitor_analytics.di.d f124272a;

            public C3709b(com.avito.android.competitor_analytics.di.d dVar) {
                this.f124272a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25696a interfaceC25696aC8 = this.f124272a.c8();
                t.c(interfaceC25696aC8);
                return interfaceC25696aC8;
            }
        }

        /* compiled from: DaggerCompetitorAnalyticsComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.competitor_analytics.di.d f124273a;

            public c(com.avito.android.competitor_analytics.di.d dVar) {
                this.f124273a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f124273a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCompetitorAnalyticsComponent.java */
        public static final class d implements u<KO.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.competitor_analytics.di.d f124274a;

            public d(com.avito.android.competitor_analytics.di.d dVar) {
                this.f124274a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f124274a.H7();
            }
        }

        /* compiled from: DaggerCompetitorAnalyticsComponent.java */
        public static final class e implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.competitor_analytics.di.d f124275a;

            public e(com.avito.android.competitor_analytics.di.d dVar) {
                this.f124275a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f124275a.r();
            }
        }

        /* compiled from: DaggerCompetitorAnalyticsComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.competitor_analytics.di.d f124276a;

            public f(com.avito.android.competitor_analytics.di.d dVar) {
                this.f124276a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f124276a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.competitor_analytics.di.d dVar, cv.b bVar, r rVar, Long l12, a aVar) {
            this.f124252a = bVar;
            this.f124253b = l.a(l12);
            this.f124254c = new C3709b(dVar);
            e eVar = new e(dVar);
            c cVar = new c(dVar);
            this.f124256e = cVar;
            u<com.avito.android.competitor_analytics.storage.a> uVarD = dagger.internal.g.d(new com.avito.android.competitor_analytics.storage.d(eVar, cVar));
            this.f124257f = uVarD;
            d dVar2 = new d(dVar);
            this.f124258g = dVar2;
            com.avito.android.competitor_analytics.domain.c cVar2 = new com.avito.android.competitor_analytics.domain.c(uVarD, dVar2);
            this.f124259h = cVar2;
            j jVar = new j(uVarD, dVar2);
            this.f124260i = jVar;
            u<com.avito.android.competitor_analytics.domain.d> uVarD2 = dagger.internal.g.d(new com.avito.android.competitor_analytics.domain.g(this.f124253b, this.f124254c, cVar2, jVar, this.f124256e, dVar2));
            this.f124261j = uVarD2;
            this.f124262k = new com.avito.android.competitor_analytics.mvi.f(uVarD2);
            this.f124263l = new com.avito.android.competitor_analytics.mvi.d(uVarD2, this.f124257f);
            u<InterfaceC18315a> uVarD3 = dagger.internal.g.d(new C18317c(this.f124253b, new a(dVar)));
            this.f124265n = uVarD3;
            this.f124266o = new k(uVarD3);
            this.f124267p = new m(this.f124259h, this.f124260i);
            this.f124268q = new f(dVar);
            u<ScreenPerformanceTracker> uVarD4 = dagger.internal.g.d(new C30060h5(this.f124268q, new com.avito.android.competitor_analytics.di.f(l.a(rVar))));
            this.f124269r = uVarD4;
            this.f124270s = new n(new i(this.f124262k, this.f124263l, this.f124266o, this.f124267p, uVarD4, this.f124258g));
        }

        @Override // com.avito.android.competitor_analytics.di.a
        public final void a(CompetitorAnalyticsActivity competitorAnalyticsActivity) {
            competitorAnalyticsActivity.f124233m = this.f124270s;
            competitorAnalyticsActivity.f124234n = this.f124269r.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f124252a.u4();
            t.c(aVarU4);
            competitorAnalyticsActivity.f124235o = aVarU4;
        }
    }

    /* compiled from: DaggerCompetitorAnalyticsComponent.java */
    public static final class c implements a.InterfaceC3708a {
        public c() {
        }

        @Override // com.avito.android.competitor_analytics.di.a.InterfaceC3708a
        public final com.avito.android.competitor_analytics.di.a a(d dVar, InterfaceC39417a interfaceC39417a, r rVar, long j12) {
            interfaceC39417a.getClass();
            return new b(dVar, interfaceC39417a, rVar, Long.valueOf(j12), null);
        }
    }

    public static a.InterfaceC3708a a() {
        return new c();
    }
}
