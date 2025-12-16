package com.avito.android.trx_promo_goods.screens.date_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment;
import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLinkContent;
import com.avito.android.trx_promo_goods.screens.date_picker.di.b;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.h;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.j;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.m;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.o;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTrxPromoGoodsDatePickerComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTrxPromoGoodsDatePickerComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.trx_promo_goods.screens.date_picker.di.b.a
        public final com.avito.android.trx_promo_goods.screens.date_picker.di.b a(com.avito.android.trx_promo_goods.common.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar, TrxPromoGoodsConfigureDatePickerLinkContent trxPromoGoodsConfigureDatePickerLinkContent, String str) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, trxPromoGoodsConfigureDatePickerLinkContent, str, null);
        }
    }

    /* compiled from: DaggerTrxPromoGoodsDatePickerComponent.java */
    public static final class c implements com.avito.android.trx_promo_goods.screens.date_picker.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.common.di.c f303681a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f303682b;

        /* renamed from: c, reason: collision with root package name */
        public final l f303683c;

        /* renamed from: d, reason: collision with root package name */
        public final j f303684d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f303685e;

        /* renamed from: f, reason: collision with root package name */
        public final h f303686f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.date_picker.mvi.r f303687g = new com.avito.android.trx_promo_goods.screens.date_picker.mvi.r(com.avito.android.trx_promo_goods.screens.date_picker.data.mapper.c.a());

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f303688h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f303689i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f303690j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.trx_promo_goods.screens.date_picker.f f303691k;

        /* compiled from: DaggerTrxPromoGoodsDatePickerComponent.java */
        /* renamed from: com.avito.android.trx_promo_goods.screens.date_picker.di.a$c$a, reason: collision with other inner class name */
        public static final class C9304a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f303692a;

            public C9304a(cv.b bVar) {
                this.f303692a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f303692a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTrxPromoGoodsDatePickerComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.trx_promo_goods.common.di.c f303693a;

            public b(com.avito.android.trx_promo_goods.common.di.c cVar) {
                this.f303693a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f303693a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.trx_promo_goods.common.di.c cVar, cv.b bVar, r rVar, TrxPromoGoodsConfigureDatePickerLinkContent trxPromoGoodsConfigureDatePickerLinkContent, String str, C9303a c9303a) {
            this.f303681a = cVar;
            this.f303682b = bVar;
            this.f303683c = l.a(trxPromoGoodsConfigureDatePickerLinkContent);
            this.f303684d = new j(this.f303683c, l.b(str));
            this.f303686f = new h(new C9304a(bVar));
            this.f303688h = new b(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new g(l.a(rVar)));
            this.f303689i = uVarD;
            this.f303690j = com.avito.android.advert.item.delivery_suggests.l.i(this.f303688h, uVarD);
            this.f303691k = new com.avito.android.trx_promo_goods.screens.date_picker.f(new m(this.f303684d, this.f303686f, o.a(), this.f303687g, this.f303690j));
        }

        @Override // com.avito.android.trx_promo_goods.screens.date_picker.di.b
        public final void a(TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment) {
            trxPromoGoodsDatePickerFragment.f303625h0 = this.f303691k;
            trxPromoGoodsDatePickerFragment.f303627j0 = this.f303690j.get();
            com.avito.android.util.text.a aVarE = this.f303681a.e();
            t.c(aVarE);
            trxPromoGoodsDatePickerFragment.f303628k0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f303682b.u4();
            t.c(aVarU4);
            trxPromoGoodsDatePickerFragment.f303629l0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
