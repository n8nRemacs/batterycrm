package com.avito.android.trx_promo_impl.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.trx_promo_impl.TrxPromoFragment;
import com.avito.android.trx_promo_impl.TrxPromoScreen;
import com.avito.android.trx_promo_impl.di.e;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTrxPromoComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTrxPromoComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.trx_promo_impl.di.e.a
        public final e a(l lVar, InterfaceC39417a interfaceC39417a, TrxPromoScreen trxPromoScreen, com.avito.android.analytics.screens.r rVar, String str, String str2, boolean z12, Y41.l lVar2, Y41.l lVar3, PaidServicesResultRepository paidServicesResultRepository) {
            interfaceC39417a.getClass();
            trxPromoScreen.getClass();
            str.getClass();
            lVar2.getClass();
            lVar3.getClass();
            return new c(lVar, interfaceC39417a, trxPromoScreen, rVar, str, str2, Boolean.valueOf(z12), lVar2, lVar3, paidServicesResultRepository, null);
        }
    }

    /* compiled from: DaggerTrxPromoComponent.java */
    public static final class c implements com.avito.android.trx_promo_impl.di.e {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.item.date.d> f304103A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.item.date.b f304104B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.item.discount_v2.d> f304105C;

        /* renamed from: D, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.item.discount_v2.b f304106D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.item.banner.d> f304107E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f304108F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f304109G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f304110H;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f304111a;

        /* renamed from: b, reason: collision with root package name */
        public final l f304112b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f304113c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TF0.a> f304114d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f304115e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.data.a> f304116f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.domain.a> f304117g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.mvi.i f304118h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f304119i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f304120j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.mvi.g f304121k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.mvi.p f304122l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f304123m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f304124n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f304125o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f304126p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f304127q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.m f304128r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f304129s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.item.header.d> f304130t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f304131u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.item.header.b f304132v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.item.commission.d> f304133w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.item.commission.b f304134x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.item.extra_info.d> f304135y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.item.extra_info.b f304136z;

        /* compiled from: DaggerTrxPromoComponent.java */
        /* renamed from: com.avito.android.trx_promo_impl.di.a$c$a, reason: collision with other inner class name */
        public static final class C9332a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304137a;

            public C9332a(l lVar) {
                this.f304137a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f304137a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerTrxPromoComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304138a;

            public b(l lVar) {
                this.f304138a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f304138a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTrxPromoComponent.java */
        /* renamed from: com.avito.android.trx_promo_impl.di.a$c$c, reason: collision with other inner class name */
        public static final class C9333c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f304139a;

            public C9333c(cv.b bVar) {
                this.f304139a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f304139a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTrxPromoComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304140a;

            public d(l lVar) {
                this.f304140a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f304140a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTrxPromoComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304141a;

            public e(l lVar) {
                this.f304141a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f304141a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTrxPromoComponent.java */
        public static final class f implements u<TF0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304142a;

            public f(l lVar) {
                this.f304142a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                TF0.a aVarBk = this.f304142a.Bk();
                t.c(aVarBk);
                return aVarBk;
            }
        }

        public c() {
            throw null;
        }

        public c(l lVar, cv.b bVar, Screen screen, com.avito.android.analytics.screens.r rVar, String str, String str2, Boolean bool, Y41.l lVar2, Y41.l lVar3, PaidServicesResultRepository paidServicesResultRepository, C9331a c9331a) {
            this.f304111a = bVar;
            this.f304112b = lVar;
            this.f304113c = dagger.internal.l.a(str2);
            u<com.avito.android.trx_promo_impl.data.a> uVarD = dagger.internal.g.d(new com.avito.android.trx_promo_impl.data.c(new f(lVar), new d(lVar)));
            this.f304116f = uVarD;
            u<com.avito.android.trx_promo_impl.domain.a> uVarD2 = dagger.internal.g.d(new com.avito.android.trx_promo_impl.domain.d(this.f304113c, uVarD));
            this.f304117g = uVarD2;
            this.f304118h = new com.avito.android.trx_promo_impl.mvi.i(uVarD2);
            this.f304119i = new C9333c(bVar);
            this.f304120j = new C9332a(lVar);
            this.f304121k = new com.avito.android.trx_promo_impl.mvi.g(dagger.internal.l.a(paidServicesResultRepository), this.f304117g, this.f304119i, this.f304120j);
            this.f304122l = new com.avito.android.trx_promo_impl.mvi.p(com.avito.android.trx_promo_impl.data.mapper.c.a());
            this.f304123m = new e(lVar);
            this.f304124n = dagger.internal.l.a(screen);
            this.f304125o = dagger.internal.l.a(rVar);
            this.f304126p = dagger.internal.g.d(new com.avito.android.trx_promo_impl.di.c(this.f304124n, this.f304125o, dagger.internal.l.a(str), this.f304123m));
            this.f304127q = dagger.internal.l.a(bool);
            this.f304128r = new com.avito.android.trx_promo_impl.m(new com.avito.android.trx_promo_impl.mvi.l(this.f304118h, this.f304121k, com.avito.android.trx_promo_impl.mvi.n.a(), this.f304122l, this.f304126p, this.f304127q));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar2);
            this.f304129s = lVarA;
            u<com.avito.android.trx_promo_impl.item.header.d> uVarD3 = dagger.internal.g.d(new com.avito.android.trx_promo_impl.item.header.g(lVarA));
            this.f304130t = uVarD3;
            b bVar2 = new b(lVar);
            this.f304131u = bVar2;
            this.f304132v = new com.avito.android.trx_promo_impl.item.header.b(uVarD3, bVar2);
            u<com.avito.android.trx_promo_impl.item.commission.d> uVarD4 = dagger.internal.g.d(new com.avito.android.trx_promo_impl.item.commission.i(this.f304129s));
            this.f304133w = uVarD4;
            this.f304134x = new com.avito.android.trx_promo_impl.item.commission.b(uVarD4);
            u<com.avito.android.trx_promo_impl.item.extra_info.d> uVarD5 = dagger.internal.g.d(new com.avito.android.trx_promo_impl.item.extra_info.g(this.f304129s));
            this.f304135y = uVarD5;
            this.f304136z = new com.avito.android.trx_promo_impl.item.extra_info.b(uVarD5);
            u<com.avito.android.trx_promo_impl.item.date.d> uVarD6 = dagger.internal.g.d(new com.avito.android.trx_promo_impl.item.date.j(this.f304129s, dagger.internal.l.a(lVar3)));
            this.f304103A = uVarD6;
            this.f304104B = new com.avito.android.trx_promo_impl.item.date.b(uVarD6);
            u<com.avito.android.trx_promo_impl.item.discount_v2.d> uVarD7 = dagger.internal.g.d(new com.avito.android.trx_promo_impl.item.discount_v2.h(this.f304129s));
            this.f304105C = uVarD7;
            this.f304106D = new com.avito.android.trx_promo_impl.item.discount_v2.b(uVarD7, this.f304131u);
            u<com.avito.android.trx_promo_impl.item.banner.d> uVarD8 = dagger.internal.g.d(new com.avito.android.trx_promo_impl.item.banner.h(this.f304129s));
            this.f304107E = uVarD8;
            u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new q(this.f304132v, this.f304134x, this.f304136z, this.f304104B, this.f304106D, new com.avito.android.trx_promo_impl.item.banner.c(uVarD8, this.f304131u)));
            this.f304108F = uVarD9;
            u<com.avito.konveyor.adapter.a> uVarD10 = dagger.internal.g.d(new p(uVarD9));
            this.f304109G = uVarD10;
            this.f304110H = dagger.internal.g.d(new r(uVarD10, this.f304108F));
        }

        @Override // com.avito.android.trx_promo_impl.di.e
        public final void a(TrxPromoFragment trxPromoFragment) {
            trxPromoFragment.f303871n0 = this.f304128r;
            trxPromoFragment.f303873p0 = this.f304126p.get();
            trxPromoFragment.f303874q0 = this.f304110H.get();
            trxPromoFragment.f303875r0 = this.f304133w.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f304111a.u4();
            t.c(aVarU4);
            trxPromoFragment.f303876s0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f304112b.a();
            t.c(interfaceC28373aA);
            trxPromoFragment.f303877t0 = interfaceC28373aA;
        }
    }

    public static e.a a() {
        return new b();
    }
}
