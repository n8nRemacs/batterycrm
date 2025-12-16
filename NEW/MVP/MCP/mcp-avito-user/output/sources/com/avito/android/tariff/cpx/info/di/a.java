package com.avito.android.tariff.cpx.info.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.info.TariffCpxInfoFragment;
import com.avito.android.tariff.cpx.info.di.d;
import com.avito.android.tariff.cpx.info.mvi.o;
import com.avito.android.tariff.cpx.info.mvi.s;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import v50.g;

/* compiled from: DaggerTariffCpxInfoComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxInfoComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.info.di.d.a
        public final d a(r rVar, WA0.b bVar, InterfaceC39417a interfaceC39417a, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4) {
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, rVar, lVar, lVar2, lVar3, lVar4, null);
        }
    }

    /* compiled from: DaggerTariffCpxInfoComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.info.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.items.features_header.c f296364A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.info.items.feature.d> f296365B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f296366C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f296367D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f296368E;

        /* renamed from: a, reason: collision with root package name */
        public final WA0.b f296369a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f296370b;

        /* renamed from: c, reason: collision with root package name */
        public final u<RB0.a> f296371c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f296372d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.info.mvi.domain.a> f296373e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.mvi.j f296374f;

        /* renamed from: g, reason: collision with root package name */
        public final u<g.b> f296375g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f296376h;

        /* renamed from: i, reason: collision with root package name */
        public final u<v50.g> f296377i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.mvi.h f296378j;

        /* renamed from: k, reason: collision with root package name */
        public final s f296379k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f296380l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f296381m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f296382n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.h f296383o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f296384p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.info.items.header.f> f296385q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.items.header.e f296386r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f296387s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.info.items.card.d> f296388t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.items.card.c f296389u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.info.items.level_header.f> f296390v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.items.level_header.e f296391w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.info.items.filters_tabs.e> f296392x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.items.filters_tabs.d f296393y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpx.info.items.features_header.d> f296394z;

        /* compiled from: DaggerTariffCpxInfoComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.di.a$c$a, reason: collision with other inner class name */
        public static final class C9024a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296395a;

            public C9024a(WA0.b bVar) {
                this.f296395a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f296395a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTariffCpxInfoComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f296396a;

            public b(cv.b bVar) {
                this.f296396a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296396a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCpxInfoComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.di.a$c$c, reason: collision with other inner class name */
        public static final class C9025c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296397a;

            public C9025c(WA0.b bVar) {
                this.f296397a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f296397a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffCpxInfoComponent.java */
        public static final class d implements u<RB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296398a;

            public d(WA0.b bVar) {
                this.f296398a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                RB0.a aVarB6 = this.f296398a.B6();
                t.c(aVarB6);
                return aVarB6;
            }
        }

        /* compiled from: DaggerTariffCpxInfoComponent.java */
        public static final class e implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296399a;

            public e(WA0.b bVar) {
                this.f296399a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f296399a.S1();
            }
        }

        /* compiled from: DaggerTariffCpxInfoComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296400a;

            public f(WA0.b bVar) {
                this.f296400a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f296400a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(WA0.b bVar, cv.b bVar2, r rVar, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, C9023a c9023a) {
            this.f296369a = bVar;
            this.f296370b = bVar2;
            u<com.avito.android.tariff.cpx.info.mvi.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.tariff.cpx.info.mvi.domain.c(new d(bVar), new C9025c(bVar)));
            this.f296373e = uVarD;
            this.f296374f = new com.avito.android.tariff.cpx.info.mvi.j(uVarD);
            e eVar = new e(bVar);
            b bVar3 = new b(bVar2);
            this.f296376h = bVar3;
            u<v50.g> uVarD2 = dagger.internal.g.d(new m(eVar, bVar3));
            this.f296377i = uVarD2;
            this.f296378j = new com.avito.android.tariff.cpx.info.mvi.h(uVarD2, this.f296373e, this.f296376h);
            this.f296379k = new s(com.avito.android.tariff.cpx.info.mvi.domain.converter.c.a());
            this.f296380l = new f(bVar);
            u<C28478k> uVarD3 = dagger.internal.g.d(new n(dagger.internal.l.a(rVar)));
            this.f296381m = uVarD3;
            this.f296382n = com.avito.android.advert.item.delivery_suggests.l.i(this.f296380l, uVarD3);
            this.f296383o = new com.avito.android.tariff.cpx.info.h(new com.avito.android.tariff.cpx.info.mvi.m(this.f296374f, this.f296378j, o.a(), this.f296379k, this.f296382n));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f296384p = lVarA;
            u<com.avito.android.tariff.cpx.info.items.header.f> uVarD4 = dagger.internal.g.d(new com.avito.android.tariff.cpx.info.items.header.j(lVarA));
            this.f296385q = uVarD4;
            this.f296386r = new com.avito.android.tariff.cpx.info.items.header.e(uVarD4);
            C9024a c9024a = new C9024a(bVar);
            this.f296387s = c9024a;
            u<com.avito.android.tariff.cpx.info.items.card.d> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff.cpx.info.items.card.f(this.f296384p, c9024a));
            this.f296388t = uVarD5;
            this.f296389u = new com.avito.android.tariff.cpx.info.items.card.c(uVarD5);
            u<com.avito.android.tariff.cpx.info.items.level_header.f> uVarD6 = dagger.internal.g.d(new com.avito.android.tariff.cpx.info.items.level_header.k(dagger.internal.l.a(lVar2), this.f296384p, this.f296387s));
            this.f296390v = uVarD6;
            this.f296391w = new com.avito.android.tariff.cpx.info.items.level_header.e(uVarD6);
            u<com.avito.android.tariff.cpx.info.items.filters_tabs.e> uVarD7 = dagger.internal.g.d(new com.avito.android.tariff.cpx.info.items.filters_tabs.h(dagger.internal.l.a(lVar3)));
            this.f296392x = uVarD7;
            this.f296393y = new com.avito.android.tariff.cpx.info.items.filters_tabs.d(uVarD7);
            u<com.avito.android.tariff.cpx.info.items.features_header.d> uVarD8 = dagger.internal.g.d(com.avito.android.tariff.cpx.info.items.features_header.f.a());
            this.f296394z = uVarD8;
            this.f296364A = new com.avito.android.tariff.cpx.info.items.features_header.c(uVarD8);
            u<com.avito.android.tariff.cpx.info.items.feature.d> uVarD9 = dagger.internal.g.d(new com.avito.android.tariff.cpx.info.items.feature.g(dagger.internal.l.a(lVar4)));
            this.f296365B = uVarD9;
            u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new j(this.f296386r, this.f296389u, this.f296391w, this.f296393y, this.f296364A, new com.avito.android.tariff.cpx.info.items.feature.c(uVarD9)));
            this.f296366C = uVarD10;
            u<com.avito.konveyor.adapter.a> uVarD11 = dagger.internal.g.d(new i(uVarD10));
            this.f296367D = uVarD11;
            this.f296368E = dagger.internal.g.d(new k(uVarD11, this.f296366C));
        }

        @Override // com.avito.android.tariff.cpx.info.di.d
        public final void a(TariffCpxInfoFragment tariffCpxInfoFragment) {
            tariffCpxInfoFragment.f296234n0 = this.f296383o;
            tariffCpxInfoFragment.f296236p0 = this.f296382n.get();
            tariffCpxInfoFragment.f296237q0 = this.f296366C.get();
            tariffCpxInfoFragment.f296238r0 = this.f296368E.get();
            InterfaceC28373a interfaceC28373aA = this.f296369a.a();
            t.c(interfaceC28373aA);
            tariffCpxInfoFragment.f296239s0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296370b.u4();
            t.c(aVarU4);
            tariffCpxInfoFragment.f296240t0 = aVarU4;
        }
    }

    public static d.a a() {
        return new b();
    }
}
