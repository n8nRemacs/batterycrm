package com.avito.android.tariff.cpx.configure.levels.di;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.configure.levels.TariffCpxConfigureLevelsFragment;
import com.avito.android.tariff.cpx.configure.levels.di.b;
import com.avito.android.tariff.cpx.configure.levels.mvi.o;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import v50.g;

/* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.configure.levels.di.b.a
        public final com.avito.android.tariff.cpx.configure.levels.di.b a(r rVar, WA0.b bVar, InterfaceC39417a interfaceC39417a, String str, Y41.l lVar, p pVar) {
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, rVar, str, lVar, pVar, null);
        }
    }

    /* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.configure.levels.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final WA0.b f296084a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f296085b;

        /* renamed from: c, reason: collision with root package name */
        public final u<WB0.a> f296086c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f296087d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.configure.levels.mvi.domain.a> f296088e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.configure.levels.mvi.g f296089f;

        /* renamed from: g, reason: collision with root package name */
        public final u<g.b> f296090g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f296091h;

        /* renamed from: i, reason: collision with root package name */
        public final u<v50.g> f296092i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.configure.levels.mvi.e f296093j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f296094k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C28478k> f296095l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f296096m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.configure.levels.j f296097n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f296098o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.configure.levels.items.header.d> f296099p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.configure.levels.items.header.c f296100q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.configure.levels.items.level_cards.f> f296101r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f296102s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f296103t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f296104u;

        /* renamed from: v, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f296105v;

        /* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.configure.levels.di.a$c$a, reason: collision with other inner class name */
        public static final class C9010a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f296106a;

            public C9010a(cv.b bVar) {
                this.f296106a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296106a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296107a;

            public b(WA0.b bVar) {
                this.f296107a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f296107a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.configure.levels.di.a$c$c, reason: collision with other inner class name */
        public static final class C9011c implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296108a;

            public C9011c(WA0.b bVar) {
                this.f296108a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f296108a.S1();
            }
        }

        /* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296109a;

            public d(WA0.b bVar) {
                this.f296109a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f296109a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffCpxConfigureLevelsComponent.java */
        public static final class e implements u<WB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296110a;

            public e(WA0.b bVar) {
                this.f296110a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WB0.a aVarT6 = this.f296110a.T6();
                t.c(aVarT6);
                return aVarT6;
            }
        }

        public c() {
            throw null;
        }

        public c(WA0.b bVar, cv.b bVar2, r rVar, String str, Y41.l lVar, p pVar, C9009a c9009a) {
            this.f296084a = bVar;
            this.f296085b = bVar2;
            u<com.avito.android.tariff.cpx.configure.levels.mvi.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.tariff.cpx.configure.levels.mvi.domain.d(dagger.internal.l.a(str), new e(bVar), new b(bVar)));
            this.f296088e = uVarD;
            this.f296089f = new com.avito.android.tariff.cpx.configure.levels.mvi.g(uVarD);
            u<v50.g> uVarD2 = dagger.internal.g.d(new m(new C9011c(bVar), new C9010a(bVar2)));
            this.f296092i = uVarD2;
            this.f296093j = new com.avito.android.tariff.cpx.configure.levels.mvi.e(uVarD2, this.f296088e);
            this.f296094k = new d(bVar);
            u<C28478k> uVarD3 = dagger.internal.g.d(new n(dagger.internal.l.a(rVar)));
            this.f296095l = uVarD3;
            this.f296096m = com.avito.android.advert.item.delivery_suggests.l.i(this.f296094k, uVarD3);
            this.f296097n = new com.avito.android.tariff.cpx.configure.levels.j(new com.avito.android.tariff.cpx.configure.levels.mvi.j(this.f296089f, this.f296093j, com.avito.android.tariff.cpx.configure.levels.mvi.l.a(), o.a(), this.f296096m));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f296098o = lVarA;
            u<com.avito.android.tariff.cpx.configure.levels.items.header.d> uVarD4 = dagger.internal.g.d(new com.avito.android.tariff.cpx.configure.levels.items.header.h(lVarA));
            this.f296099p = uVarD4;
            this.f296100q = new com.avito.android.tariff.cpx.configure.levels.items.header.c(uVarD4);
            u<com.avito.android.tariff.cpx.configure.levels.items.level_cards.f> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff.cpx.configure.levels.items.level_cards.h(dagger.internal.l.a(pVar), this.f296098o));
            this.f296101r = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new i(this.f296100q, new com.avito.android.tariff.cpx.configure.levels.items.level_cards.c(uVarD5)));
            this.f296102s = uVarD6;
            u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new h(uVarD6));
            this.f296103t = uVarD7;
            this.f296104u = dagger.internal.g.d(new k(uVarD7, this.f296102s));
            this.f296105v = dagger.internal.g.d(new j(this.f296099p, this.f296101r));
        }

        @Override // com.avito.android.tariff.cpx.configure.levels.di.b
        public final void a(TariffCpxConfigureLevelsFragment tariffCpxConfigureLevelsFragment) {
            tariffCpxConfigureLevelsFragment.f296054n0 = this.f296097n;
            tariffCpxConfigureLevelsFragment.f296056p0 = this.f296096m.get();
            tariffCpxConfigureLevelsFragment.f296057q0 = this.f296104u.get();
            WA0.b bVar = this.f296084a;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            tariffCpxConfigureLevelsFragment.f296058r0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296085b.u4();
            t.c(aVarU4);
            tariffCpxConfigureLevelsFragment.f296059s0 = aVarU4;
            tariffCpxConfigureLevelsFragment.f296060t0 = this.f296105v.get();
            com.avito.android.util.text.a aVarE = bVar.e();
            t.c(aVarE);
            tariffCpxConfigureLevelsFragment.f296061u0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
