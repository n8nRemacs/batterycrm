package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.trx_promo_goods.screens.configure.TrxPromoGoodsConfigureFragment;
import com.avito.android.trx_promo_goods.screens.configure.di.b;
import com.avito.android.trx_promo_goods.screens.configure.di.l;
import com.avito.android.trx_promo_goods.screens.configure.mvi.q;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import java.time.Clock;

/* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.trx_promo_goods.screens.configure.di.b.a
        public final com.avito.android.trx_promo_goods.screens.configure.di.b a(com.avito.android.trx_promo_goods.common.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar, String str, boolean z12, Y41.l lVar, Y41.l lVar2, PaidServicesResultRepository paidServicesResultRepository) {
            interfaceC39417a.getClass();
            lVar.getClass();
            lVar2.getClass();
            return new c(cVar, interfaceC39417a, rVar, str, Boolean.valueOf(z12), lVar, lVar2, paidServicesResultRepository, null);
        }
    }

    /* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
    public static final class c implements com.avito.android.trx_promo_goods.screens.configure.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.d> f303418A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f303419B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f303420C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f303421D;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f303422a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.common.di.c f303423b;

        /* renamed from: c, reason: collision with root package name */
        public final u<IF0.a> f303424c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f303425d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.domain.b f303426e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.mvi.j f303427f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f303428g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f303429h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Clock> f303430i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.mvi.h f303431j;

        /* renamed from: k, reason: collision with root package name */
        public final q f303432k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f303433l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f303434m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f303435n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f303436o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.h f303437p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_goods.screens.configure.item.header.d> f303438q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f303439r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.item.header.b f303440s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.l f303441t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_goods.screens.configure.item.commission.d> f303442u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.item.commission.b f303443v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_goods.screens.configure.item.date.d> f303444w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.item.date.b f303445x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_goods.screens.configure.item.extra_info.d> f303446y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.configure.item.extra_info.b f303447z;

        /* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
        /* renamed from: com.avito.android.trx_promo_goods.screens.configure.di.a$c$a, reason: collision with other inner class name */
        public static final class C9286a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303448a;

            public C9286a(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303448a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f303448a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f303449a;

            public b(cv.b bVar) {
                this.f303449a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f303449a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
        /* renamed from: com.avito.android.trx_promo_goods.screens.configure.di.a$c$c, reason: collision with other inner class name */
        public static final class C9287c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303450a;

            public C9287c(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303450a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f303450a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303451a;

            public d(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303451a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f303451a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTrxPromoGoodsConfigureComponent.java */
        public static final class e implements u<IF0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303452a;

            public e(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303452a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IF0.a aVarZh = this.f303452a.Zh();
                t.c(aVarZh);
                return aVarZh;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.trx_promo_goods.common.di.c cVar, cv.b bVar, r rVar, String str, Boolean bool, Y41.l lVar, Y41.l lVar2, PaidServicesResultRepository paidServicesResultRepository, C9285a c9285a) {
            this.f303422a = bVar;
            this.f303423b = cVar;
            com.avito.android.trx_promo_goods.screens.configure.domain.b bVar2 = new com.avito.android.trx_promo_goods.screens.configure.domain.b(dagger.internal.l.a(str), new e(cVar), new C9287c(cVar));
            this.f303426e = bVar2;
            this.f303427f = new com.avito.android.trx_promo_goods.screens.configure.mvi.j(bVar2);
            this.f303428g = new b(bVar);
            this.f303429h = dagger.internal.l.a(paidServicesResultRepository);
            u<Clock> uVarD = dagger.internal.g.d(l.a.f303462a);
            this.f303430i = uVarD;
            LF0.c cVar2 = new LF0.c(uVarD);
            this.f303431j = new com.avito.android.trx_promo_goods.screens.configure.mvi.h(this.f303426e, this.f303428g, this.f303429h, cVar2);
            this.f303432k = new q(cVar2);
            this.f303433l = new d(cVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new o(dagger.internal.l.a(rVar)));
            this.f303434m = uVarD2;
            this.f303435n = com.avito.android.advert.item.delivery_suggests.l.i(this.f303433l, uVarD2);
            this.f303436o = dagger.internal.l.a(bool);
            this.f303437p = new com.avito.android.trx_promo_goods.screens.configure.h(new com.avito.android.trx_promo_goods.screens.configure.mvi.m(this.f303427f, this.f303431j, com.avito.android.trx_promo_goods.screens.configure.mvi.o.a(), this.f303432k, this.f303435n, this.f303436o));
            u<com.avito.android.trx_promo_goods.screens.configure.item.header.d> uVarD3 = dagger.internal.g.d(com.avito.android.trx_promo_goods.screens.configure.item.header.f.a());
            this.f303438q = uVarD3;
            C9286a c9286a = new C9286a(cVar);
            this.f303439r = c9286a;
            this.f303440s = new com.avito.android.trx_promo_goods.screens.configure.item.header.b(uVarD3, c9286a);
            this.f303441t = dagger.internal.l.a(lVar);
            u<com.avito.android.trx_promo_goods.screens.configure.item.commission.d> uVarD4 = dagger.internal.g.d(new com.avito.android.trx_promo_goods.screens.configure.item.commission.h(this.f303441t, dagger.internal.l.a(lVar2)));
            this.f303442u = uVarD4;
            this.f303443v = new com.avito.android.trx_promo_goods.screens.configure.item.commission.b(uVarD4, this.f303439r);
            u<com.avito.android.trx_promo_goods.screens.configure.item.date.d> uVarD5 = dagger.internal.g.d(new com.avito.android.trx_promo_goods.screens.configure.item.date.g(this.f303441t));
            this.f303444w = uVarD5;
            this.f303445x = new com.avito.android.trx_promo_goods.screens.configure.item.date.b(uVarD5);
            u<com.avito.android.trx_promo_goods.screens.configure.item.extra_info.d> uVarD6 = dagger.internal.g.d(new com.avito.android.trx_promo_goods.screens.configure.item.extra_info.g(this.f303441t));
            this.f303446y = uVarD6;
            this.f303447z = new com.avito.android.trx_promo_goods.screens.configure.item.extra_info.b(uVarD6);
            u<com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.d> uVarD7 = dagger.internal.g.d(new com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.h(this.f303441t));
            this.f303418A = uVarD7;
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new m(this.f303440s, this.f303443v, this.f303445x, this.f303447z, new com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.b(uVarD7, this.f303439r)));
            this.f303419B = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new k(uVarD8));
            this.f303420C = uVarD9;
            this.f303421D = dagger.internal.g.d(new n(uVarD9, this.f303419B));
        }

        @Override // com.avito.android.trx_promo_goods.screens.configure.di.b
        public final void a(TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment) {
            trxPromoGoodsConfigureFragment.f303337n0 = this.f303437p;
            trxPromoGoodsConfigureFragment.f303339p0 = this.f303435n.get();
            trxPromoGoodsConfigureFragment.f303340q0 = this.f303421D.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f303422a.u4();
            t.c(aVarU4);
            trxPromoGoodsConfigureFragment.f303341r0 = aVarU4;
            com.avito.android.trx_promo_goods.common.di.c cVar = this.f303423b;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            trxPromoGoodsConfigureFragment.f303342s0 = interfaceC28373aA;
            com.avito.android.util.text.a aVarE = cVar.e();
            t.c(aVarE);
            trxPromoGoodsConfigureFragment.f303343t0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
