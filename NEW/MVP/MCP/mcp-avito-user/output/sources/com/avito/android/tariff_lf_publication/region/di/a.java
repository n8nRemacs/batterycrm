package com.avito.android.tariff_lf_publication.region.di;

import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_publication.region.TariffLfPublicationRegionFragment;
import com.avito.android.tariff_lf_publication.region.di.b;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffLfPublicationRegionComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffLfPublicationRegionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff_lf_publication.region.di.b.a
        public final com.avito.android.tariff_lf_publication.region.di.b a(KD0.b bVar, InterfaceC39417a interfaceC39417a, r rVar, String str, l lVar, l lVar2) {
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, rVar, str, lVar, lVar2, null);
        }
    }

    /* compiled from: DaggerTariffLfPublicationRegionComponent.java */
    public static final class c implements com.avito.android.tariff_lf_publication.region.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final KD0.b f301050a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f301051b;

        /* renamed from: c, reason: collision with root package name */
        public final u<OD0.a> f301052c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f301053d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.region.mvi.d f301054e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.region.mvi.b f301055f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.region.mvi.k f301056g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f301057h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f301058i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f301059j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.region.f f301060k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_publication.common.ui.items.header.e> f301061l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f301062m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.common.ui.items.header.b f301063n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_publication.region.ui.items.option.d> f301064o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f301065p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f301066q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f301067r;

        /* compiled from: DaggerTariffLfPublicationRegionComponent.java */
        /* renamed from: com.avito.android.tariff_lf_publication.region.di.a$c$a, reason: collision with other inner class name */
        public static final class C9210a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f301068a;

            public C9210a(KD0.b bVar) {
                this.f301068a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f301068a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTariffLfPublicationRegionComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f301069a;

            public b(KD0.b bVar) {
                this.f301069a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f301069a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffLfPublicationRegionComponent.java */
        /* renamed from: com.avito.android.tariff_lf_publication.region.di.a$c$c, reason: collision with other inner class name */
        public static final class C9211c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f301070a;

            public C9211c(KD0.b bVar) {
                this.f301070a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f301070a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffLfPublicationRegionComponent.java */
        public static final class d implements u<OD0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f301071a;

            public d(KD0.b bVar) {
                this.f301071a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                OD0.a aVarMo1if = this.f301071a.mo1if();
                t.c(aVarMo1if);
                return aVarMo1if;
            }
        }

        public c() {
            throw null;
        }

        public c(KD0.b bVar, cv.b bVar2, r rVar, String str, l lVar, l lVar2, C9209a c9209a) {
            this.f301050a = bVar;
            this.f301051b = bVar2;
            com.avito.android.tariff_lf_publication.region.domain.b bVar3 = new com.avito.android.tariff_lf_publication.region.domain.b(dagger.internal.l.a(str), new d(bVar), new b(bVar));
            this.f301054e = new com.avito.android.tariff_lf_publication.region.mvi.d(bVar3);
            this.f301055f = new com.avito.android.tariff_lf_publication.region.mvi.b(bVar3);
            this.f301056g = new com.avito.android.tariff_lf_publication.region.mvi.k(com.avito.android.tariff_lf_publication.region.data.mapper.c.a());
            this.f301057h = new C9211c(bVar);
            u<C28478k> uVarD = dagger.internal.g.d(new k(dagger.internal.l.a(rVar)));
            this.f301058i = uVarD;
            this.f301059j = com.avito.android.advert.item.delivery_suggests.l.i(this.f301057h, uVarD);
            this.f301060k = new com.avito.android.tariff_lf_publication.region.f(new com.avito.android.tariff_lf_publication.region.mvi.g(this.f301054e, this.f301055f, com.avito.android.tariff_lf_publication.region.mvi.i.a(), this.f301056g, this.f301059j));
            u<com.avito.android.tariff_lf_publication.common.ui.items.header.e> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_lf_publication.common.ui.items.header.g.a());
            this.f301061l = uVarD2;
            this.f301063n = new com.avito.android.tariff_lf_publication.common.ui.items.header.b(uVarD2, new C9210a(bVar));
            u<com.avito.android.tariff_lf_publication.region.ui.items.option.d> uVarD3 = dagger.internal.g.d(new com.avito.android.tariff_lf_publication.region.ui.items.option.g(dagger.internal.l.a(lVar2)));
            this.f301064o = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new i(this.f301063n, new com.avito.android.tariff_lf_publication.region.ui.items.option.b(uVarD3)));
            this.f301065p = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new h(uVarD4));
            this.f301066q = uVarD5;
            this.f301067r = dagger.internal.g.d(new j(uVarD5, this.f301065p));
        }

        @Override // com.avito.android.tariff_lf_publication.region.di.b
        public final void a(TariffLfPublicationRegionFragment tariffLfPublicationRegionFragment) {
            tariffLfPublicationRegionFragment.f301019n0 = this.f301060k;
            tariffLfPublicationRegionFragment.f301022q0 = this.f301059j.get();
            InterfaceC28373a interfaceC28373aA = this.f301050a.a();
            t.c(interfaceC28373aA);
            tariffLfPublicationRegionFragment.f301023r0 = interfaceC28373aA;
            tariffLfPublicationRegionFragment.f301024s0 = this.f301067r.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f301051b.u4();
            t.c(aVarU4);
            tariffLfPublicationRegionFragment.f301025t0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
