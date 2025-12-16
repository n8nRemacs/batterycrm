package com.avito.android.tariff_lf_publication.count.di;

import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_publication.count.TariffLfPublicationCountFragment;
import com.avito.android.tariff_lf_publication.count.di.b;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffLfPublicationCountComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffLfPublicationCountComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff_lf_publication.count.di.b.a
        public final com.avito.android.tariff_lf_publication.count.di.b a(KD0.b bVar, InterfaceC39417a interfaceC39417a, r rVar, String str, l lVar, l lVar2) {
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, rVar, str, lVar, lVar2, null);
        }
    }

    /* compiled from: DaggerTariffLfPublicationCountComponent.java */
    public static final class c implements com.avito.android.tariff_lf_publication.count.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final KD0.b f300760a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f300761b;

        /* renamed from: c, reason: collision with root package name */
        public final u<OD0.a> f300762c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f300763d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.count.mvi.e f300764e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.count.mvi.c f300765f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.count.mvi.l f300766g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f300767h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f300768i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f300769j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.count.g f300770k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_publication.common.ui.items.header.e> f300771l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f300772m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.common.ui.items.header.b f300773n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_publication.count.ui.items.option.d> f300774o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f300775p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f300776q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f300777r;

        /* compiled from: DaggerTariffLfPublicationCountComponent.java */
        /* renamed from: com.avito.android.tariff_lf_publication.count.di.a$c$a, reason: collision with other inner class name */
        public static final class C9200a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f300778a;

            public C9200a(KD0.b bVar) {
                this.f300778a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f300778a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTariffLfPublicationCountComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f300779a;

            public b(KD0.b bVar) {
                this.f300779a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f300779a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffLfPublicationCountComponent.java */
        /* renamed from: com.avito.android.tariff_lf_publication.count.di.a$c$c, reason: collision with other inner class name */
        public static final class C9201c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f300780a;

            public C9201c(KD0.b bVar) {
                this.f300780a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f300780a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffLfPublicationCountComponent.java */
        public static final class d implements u<OD0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f300781a;

            public d(KD0.b bVar) {
                this.f300781a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                OD0.a aVarMo1if = this.f300781a.mo1if();
                t.c(aVarMo1if);
                return aVarMo1if;
            }
        }

        public c() {
            throw null;
        }

        public c(KD0.b bVar, cv.b bVar2, r rVar, String str, l lVar, l lVar2, C9199a c9199a) {
            this.f300760a = bVar;
            this.f300761b = bVar2;
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            d dVar = new d(bVar);
            b bVar3 = new b(bVar);
            com.avito.android.tariff_lf_publication.count.domain.d dVar2 = new com.avito.android.tariff_lf_publication.count.domain.d(lVarA, dVar, bVar3);
            this.f300764e = new com.avito.android.tariff_lf_publication.count.mvi.e(dVar2);
            this.f300765f = new com.avito.android.tariff_lf_publication.count.mvi.c(dVar2, new com.avito.android.tariff_lf_publication.count.domain.b(lVarA, dVar, bVar3));
            this.f300766g = new com.avito.android.tariff_lf_publication.count.mvi.l(com.avito.android.tariff_lf_publication.count.data.mapper.c.a());
            this.f300767h = new C9201c(bVar);
            u<C28478k> uVarD = dagger.internal.g.d(new k(dagger.internal.l.a(rVar)));
            this.f300768i = uVarD;
            this.f300769j = com.avito.android.advert.item.delivery_suggests.l.i(this.f300767h, uVarD);
            this.f300770k = new com.avito.android.tariff_lf_publication.count.g(new com.avito.android.tariff_lf_publication.count.mvi.h(this.f300764e, this.f300765f, com.avito.android.tariff_lf_publication.count.mvi.j.a(), this.f300766g, this.f300769j));
            u<com.avito.android.tariff_lf_publication.common.ui.items.header.e> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_lf_publication.common.ui.items.header.g.a());
            this.f300771l = uVarD2;
            C9200a c9200a = new C9200a(bVar);
            this.f300772m = c9200a;
            this.f300773n = new com.avito.android.tariff_lf_publication.common.ui.items.header.b(uVarD2, c9200a);
            u<com.avito.android.tariff_lf_publication.count.ui.items.option.d> uVarD3 = dagger.internal.g.d(new com.avito.android.tariff_lf_publication.count.ui.items.option.g(dagger.internal.l.a(lVar2)));
            this.f300774o = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new i(this.f300773n, new com.avito.android.tariff_lf_publication.count.ui.items.option.b(uVarD3, this.f300772m)));
            this.f300775p = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new h(uVarD4));
            this.f300776q = uVarD5;
            this.f300777r = dagger.internal.g.d(new j(uVarD5, this.f300775p));
        }

        @Override // com.avito.android.tariff_lf_publication.count.di.b
        public final void a(TariffLfPublicationCountFragment tariffLfPublicationCountFragment) {
            tariffLfPublicationCountFragment.f300727n0 = this.f300770k;
            tariffLfPublicationCountFragment.f300730q0 = this.f300769j.get();
            InterfaceC28373a interfaceC28373aA = this.f300760a.a();
            t.c(interfaceC28373aA);
            tariffLfPublicationCountFragment.f300731r0 = interfaceC28373aA;
            tariffLfPublicationCountFragment.f300732s0 = this.f300777r.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f300761b.u4();
            t.c(aVarU4);
            tariffLfPublicationCountFragment.f300733t0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
