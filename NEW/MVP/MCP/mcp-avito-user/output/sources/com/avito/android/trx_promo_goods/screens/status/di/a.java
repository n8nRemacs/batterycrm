package com.avito.android.trx_promo_goods.screens.status.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.trx_promo_goods.screens.status.TrxPromoGoodsStatusFragment;
import com.avito.android.trx_promo_goods.screens.status.di.b;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import com.avito.android.trx_promo_goods.screens.status.mvi.k;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTrxPromoGoodsStatusComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTrxPromoGoodsStatusComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.trx_promo_goods.screens.status.di.b.a
        public final com.avito.android.trx_promo_goods.screens.status.di.b a(com.avito.android.trx_promo_goods.common.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar, String str, boolean z12, TrxPromoGoodsStatus trxPromoGoodsStatus) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, str, Boolean.valueOf(z12), trxPromoGoodsStatus, null);
        }
    }

    /* compiled from: DaggerTrxPromoGoodsStatusComponent.java */
    public static final class c implements com.avito.android.trx_promo_goods.screens.status.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f303796a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.common.di.c f303797b;

        /* renamed from: c, reason: collision with root package name */
        public final l f303798c;

        /* renamed from: d, reason: collision with root package name */
        public final l f303799d;

        /* renamed from: e, reason: collision with root package name */
        public final u<IF0.a> f303800e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f303801f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.status.mvi.d f303802g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.status.mvi.b f303803h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f303804i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f303805j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f303806k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.status.g f303807l;

        /* compiled from: DaggerTrxPromoGoodsStatusComponent.java */
        /* renamed from: com.avito.android.trx_promo_goods.screens.status.di.a$c$a, reason: collision with other inner class name */
        public static final class C9311a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303808a;

            public C9311a(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303808a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f303808a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTrxPromoGoodsStatusComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303809a;

            public b(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303809a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f303809a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTrxPromoGoodsStatusComponent.java */
        /* renamed from: com.avito.android.trx_promo_goods.screens.status.di.a$c$c, reason: collision with other inner class name */
        public static final class C9312c implements u<IF0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303810a;

            public C9312c(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303810a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IF0.a aVarZh = this.f303810a.Zh();
                t.c(aVarZh);
                return aVarZh;
            }
        }

        public c(com.avito.android.trx_promo_goods.common.di.c cVar, cv.b bVar, r rVar, String str, Boolean bool, TrxPromoGoodsStatus trxPromoGoodsStatus, C9310a c9310a) {
            this.f303796a = bVar;
            this.f303797b = cVar;
            this.f303798c = l.a(bool);
            this.f303799d = l.a(trxPromoGoodsStatus);
            com.avito.android.trx_promo_goods.screens.status.domain.b bVar2 = new com.avito.android.trx_promo_goods.screens.status.domain.b(l.a(str), this.f303799d, new C9312c(cVar), new C9311a(cVar));
            this.f303802g = new com.avito.android.trx_promo_goods.screens.status.mvi.d(bVar2);
            this.f303803h = new com.avito.android.trx_promo_goods.screens.status.mvi.b(bVar2);
            this.f303804i = new b(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new j(l.a(rVar), this.f303799d));
            this.f303805j = uVarD;
            this.f303806k = com.avito.android.advert.item.delivery_suggests.l.i(this.f303804i, uVarD);
            this.f303807l = new com.avito.android.trx_promo_goods.screens.status.g(new com.avito.android.trx_promo_goods.screens.status.mvi.g(this.f303798c, this.f303799d, this.f303802g, this.f303803h, com.avito.android.trx_promo_goods.screens.status.mvi.i.a(), k.a(), this.f303806k));
        }

        @Override // com.avito.android.trx_promo_goods.screens.status.di.b
        public final void a(TrxPromoGoodsStatusFragment trxPromoGoodsStatusFragment) {
            trxPromoGoodsStatusFragment.f303749n0 = this.f303807l;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f303796a.u4();
            t.c(aVarU4);
            trxPromoGoodsStatusFragment.f303750o0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f303797b.a();
            t.c(interfaceC28373aA);
            trxPromoGoodsStatusFragment.f303751p0 = interfaceC28373aA;
            trxPromoGoodsStatusFragment.f303752q0 = this.f303806k.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
