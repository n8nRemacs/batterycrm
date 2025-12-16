package com.avito.android.tariff_cpt.configure.levels.di;

import Y41.l;
import Y41.p;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_cpt.configure.levels.TariffCptConfigureLevelsFragment;
import com.avito.android.tariff_cpt.configure.levels.di.b;
import com.avito.android.tariff_cpt.configure.levels.mvi.m;
import com.avito.android.tariff_cpt.configure.levels.mvi.o;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import uC0.InterfaceC48882a;
import v50.g;

/* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff_cpt.configure.levels.di.b.a
        public final com.avito.android.tariff_cpt.configure.levels.di.b a(com.avito.android.tariff_cpt.common.di.d dVar, InterfaceC39417a interfaceC39417a, r rVar, String str, l lVar, p pVar) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, rVar, str, lVar, pVar, null);
        }
    }

    /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
    public static final class c implements com.avito.android.tariff_cpt.configure.levels.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f297822a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC48882a> f297823b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f297824c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.configure.levels.domain.a> f297825d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.levels.mvi.j f297826e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f297827f;

        /* renamed from: g, reason: collision with root package name */
        public final u<g.b> f297828g;

        /* renamed from: h, reason: collision with root package name */
        public final u<v50.g> f297829h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.levels.mvi.h f297830i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f297831j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C28478k> f297832k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f297833l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.levels.f f297834m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f297835n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.configure.levels.ui.items.header.d> f297836o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f297837p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.levels.ui.items.header.c f297838q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.f> f297839r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f297840s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f297841t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f297842u;

        /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.configure.levels.di.a$c$a, reason: collision with other inner class name */
        public static final class C9095a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297843a;

            public C9095a(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297843a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f297843a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f297844a;

            public b(cv.b bVar) {
                this.f297844a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f297844a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.configure.levels.di.a$c$c, reason: collision with other inner class name */
        public static final class C9096c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297845a;

            public C9096c(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297845a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f297845a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
        public static final class d implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297846a;

            public d(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297846a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f297846a.S1();
            }
        }

        /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297847a;

            public e(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297847a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f297847a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffCptConfigureLevelsComponent.java */
        public static final class f implements u<InterfaceC48882a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297848a;

            public f(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297848a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48882a interfaceC48882aKk = this.f297848a.kk();
                t.c(interfaceC48882aKk);
                return interfaceC48882aKk;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.tariff_cpt.common.di.d dVar, cv.b bVar, r rVar, String str, l lVar, p pVar, C9094a c9094a) {
            this.f297822a = bVar;
            u<com.avito.android.tariff_cpt.configure.levels.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.tariff_cpt.configure.levels.domain.d(dagger.internal.l.a(str), new f(dVar), new C9096c(dVar)));
            this.f297825d = uVarD;
            this.f297826e = new com.avito.android.tariff_cpt.configure.levels.mvi.j(uVarD);
            b bVar2 = new b(bVar);
            this.f297827f = bVar2;
            u<v50.g> uVarD2 = dagger.internal.g.d(new j(new d(dVar), bVar2));
            this.f297829h = uVarD2;
            this.f297830i = new com.avito.android.tariff_cpt.configure.levels.mvi.h(uVarD2, this.f297825d, this.f297827f);
            this.f297831j = new e(dVar);
            u<C28478k> uVarD3 = dagger.internal.g.d(new k(dagger.internal.l.a(rVar)));
            this.f297832k = uVarD3;
            this.f297833l = com.avito.android.advert.item.delivery_suggests.l.i(this.f297831j, uVarD3);
            this.f297834m = new com.avito.android.tariff_cpt.configure.levels.f(new m(this.f297826e, this.f297830i, o.a(), com.avito.android.tariff_cpt.configure.levels.mvi.r.a(), this.f297833l));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f297835n = lVarA;
            u<com.avito.android.tariff_cpt.configure.levels.ui.items.header.d> uVarD4 = dagger.internal.g.d(new com.avito.android.tariff_cpt.configure.levels.ui.items.header.h(lVarA));
            this.f297836o = uVarD4;
            C9095a c9095a = new C9095a(dVar);
            this.f297837p = c9095a;
            this.f297838q = new com.avito.android.tariff_cpt.configure.levels.ui.items.header.c(uVarD4, c9095a);
            u<com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.f> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.h(dagger.internal.l.a(pVar), this.f297835n));
            this.f297839r = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new g(this.f297838q, new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.b(uVarD5, this.f297837p)));
            this.f297840s = uVarD6;
            u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new com.avito.android.tariff_cpt.configure.levels.di.f(uVarD6));
            this.f297841t = uVarD7;
            this.f297842u = dagger.internal.g.d(new h(uVarD7, this.f297840s));
        }

        @Override // com.avito.android.tariff_cpt.configure.levels.di.b
        public final void a(TariffCptConfigureLevelsFragment tariffCptConfigureLevelsFragment) {
            tariffCptConfigureLevelsFragment.f297797n0 = this.f297834m;
            tariffCptConfigureLevelsFragment.f297798o0 = this.f297833l.get();
            tariffCptConfigureLevelsFragment.f297799p0 = this.f297842u.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f297822a.u4();
            t.c(aVarU4);
            tariffCptConfigureLevelsFragment.f297800q0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
