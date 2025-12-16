package com.avito.android.tariff_cpt.levels.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment;
import com.avito.android.tariff_cpt.levels.di.b;
import com.avito.android.tariff_cpt.levels.mvi.m;
import com.avito.android.tariff_cpt.levels.mvi.o;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import uC0.InterfaceC48882a;
import v50.g;

/* compiled from: DaggerTariffCptLevelsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCptLevelsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff_cpt.levels.di.b.a
        public final com.avito.android.tariff_cpt.levels.di.b a(com.avito.android.tariff_cpt.common.di.d dVar, InterfaceC39417a interfaceC39417a, r rVar, String str, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, rVar, str, lVar, null);
        }
    }

    /* compiled from: DaggerTariffCptLevelsComponent.java */
    public static final class c implements com.avito.android.tariff_cpt.levels.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f298567a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.common.di.d f298568b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC48882a> f298569c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f298570d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.levels.domain.a> f298571e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.levels.mvi.j f298572f;

        /* renamed from: g, reason: collision with root package name */
        public final u<g.b> f298573g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f298574h;

        /* renamed from: i, reason: collision with root package name */
        public final u<v50.g> f298575i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.levels.mvi.h f298576j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f298577k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f298578l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.levels.f f298579m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.levels.ui.items.business_tool.d> f298580n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f298581o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.levels.ui.items.business_tool.c f298582p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.d> f298583q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f298584r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f298585s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f298586t;

        /* compiled from: DaggerTariffCptLevelsComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.levels.di.a$c$a, reason: collision with other inner class name */
        public static final class C9128a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298587a;

            public C9128a(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298587a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f298587a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTariffCptLevelsComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f298588a;

            public b(cv.b bVar) {
                this.f298588a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f298588a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCptLevelsComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.levels.di.a$c$c, reason: collision with other inner class name */
        public static final class C9129c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298589a;

            public C9129c(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298589a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f298589a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffCptLevelsComponent.java */
        public static final class d implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298590a;

            public d(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298590a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f298590a.S1();
            }
        }

        /* compiled from: DaggerTariffCptLevelsComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298591a;

            public e(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298591a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f298591a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffCptLevelsComponent.java */
        public static final class f implements u<InterfaceC48882a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298592a;

            public f(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298592a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48882a interfaceC48882aKk = this.f298592a.kk();
                t.c(interfaceC48882aKk);
                return interfaceC48882aKk;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.tariff_cpt.common.di.d dVar, cv.b bVar, r rVar, String str, Y41.l lVar, C9127a c9127a) {
            this.f298567a = bVar;
            this.f298568b = dVar;
            u<com.avito.android.tariff_cpt.levels.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.tariff_cpt.levels.domain.d(dagger.internal.l.a(str), new f(dVar), new C9129c(dVar)));
            this.f298571e = uVarD;
            this.f298572f = new com.avito.android.tariff_cpt.levels.mvi.j(uVarD);
            d dVar2 = new d(dVar);
            b bVar2 = new b(bVar);
            this.f298574h = bVar2;
            u<v50.g> uVarD2 = dagger.internal.g.d(new k(dVar2, bVar2));
            this.f298575i = uVarD2;
            this.f298576j = new com.avito.android.tariff_cpt.levels.mvi.h(uVarD2, this.f298571e, this.f298574h);
            this.f298577k = new e(dVar);
            this.f298578l = dagger.internal.g.d(new C30060h5(this.f298577k, new l(dagger.internal.l.a(rVar))));
            this.f298579m = new com.avito.android.tariff_cpt.levels.f(new m(this.f298572f, this.f298576j, o.a(), com.avito.android.tariff_cpt.levels.mvi.r.a(), this.f298578l));
            u<com.avito.android.tariff_cpt.levels.ui.items.business_tool.d> uVarD3 = dagger.internal.g.d(new com.avito.android.tariff_cpt.levels.ui.items.business_tool.g(dagger.internal.l.a(lVar)));
            this.f298580n = uVarD3;
            C9128a c9128a = new C9128a(dVar);
            this.f298581o = c9128a;
            this.f298582p = new com.avito.android.tariff_cpt.levels.ui.items.business_tool.c(uVarD3, c9128a);
            u<com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.d> uVarD4 = dagger.internal.g.d(com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.f.a());
            this.f298583q = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff_cpt.levels.di.e(this.f298582p, new com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.c(uVarD4, this.f298581o)));
            this.f298584r = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new com.avito.android.tariff_cpt.levels.di.d(uVarD5));
            this.f298585s = uVarD6;
            this.f298586t = dagger.internal.g.d(new com.avito.android.tariff_cpt.levels.di.f(uVarD6, this.f298584r));
        }

        @Override // com.avito.android.tariff_cpt.levels.di.b
        public final void a(TariffCptLevelsFragment tariffCptLevelsFragment) {
            tariffCptLevelsFragment.f298505h0 = this.f298579m;
            tariffCptLevelsFragment.f298506i0 = this.f298578l.get();
            tariffCptLevelsFragment.f298507j0 = this.f298586t.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f298567a.u4();
            t.c(aVarU4);
            tariffCptLevelsFragment.f298508k0 = aVarU4;
            com.avito.android.util.text.a aVarE = this.f298568b.e();
            t.c(aVarE);
            tariffCptLevelsFragment.f298509l0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
