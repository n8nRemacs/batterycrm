package com.avito.android.trx_promo_impl.date_range_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment;
import com.avito.android.trx_promo_impl.date_range_picker.di.c;
import com.avito.android.trx_promo_impl.date_range_picker.mvi.n;
import com.avito.android.trx_promo_impl.date_range_picker.mvi.p;
import com.avito.android.trx_promo_impl.di.l;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLinkContent;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTrxPromoDateRangePickerComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTrxPromoDateRangePickerComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.trx_promo_impl.date_range_picker.di.c.a
        public final com.avito.android.trx_promo_impl.date_range_picker.di.c a(l lVar, InterfaceC39417a interfaceC39417a, r rVar, TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent, String str, String str2) {
            interfaceC39417a.getClass();
            return new c(lVar, interfaceC39417a, rVar, trxPromoConfigureDateRangePickerLinkContent, str, str2, null);
        }
    }

    /* compiled from: DaggerTrxPromoDateRangePickerComponent.java */
    public static final class c implements com.avito.android.trx_promo_impl.date_range_picker.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f304000a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f304001b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f304002c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.date_range_picker.mvi.i f304003d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f304004e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.date_range_picker.mvi.g f304005f;

        /* renamed from: g, reason: collision with root package name */
        public final p f304006g = new p(com.avito.android.trx_promo_impl.date_range_picker.data.mapper.c.a());

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f304007h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f304008i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f304009j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.date_range_picker.f f304010k;

        /* compiled from: DaggerTrxPromoDateRangePickerComponent.java */
        /* renamed from: com.avito.android.trx_promo_impl.date_range_picker.di.a$c$a, reason: collision with other inner class name */
        public static final class C9326a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f304011a;

            public C9326a(cv.b bVar) {
                this.f304011a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f304011a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTrxPromoDateRangePickerComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304012a;

            public b(l lVar) {
                this.f304012a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f304012a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(l lVar, cv.b bVar, r rVar, TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent, String str, String str2, C9325a c9325a) {
            this.f304000a = bVar;
            this.f304001b = dagger.internal.l.a(trxPromoConfigureDateRangePickerLinkContent);
            this.f304002c = dagger.internal.l.b(str);
            this.f304003d = new com.avito.android.trx_promo_impl.date_range_picker.mvi.i(this.f304001b, this.f304002c, dagger.internal.l.b(str2));
            this.f304005f = new com.avito.android.trx_promo_impl.date_range_picker.mvi.g(new C9326a(bVar), com.avito.android.trx_promo_impl.date_range_picker.data.mapper.c.a());
            this.f304007h = new b(lVar);
            u<C28478k> uVarD = dagger.internal.g.d(new h(dagger.internal.l.a(rVar)));
            this.f304008i = uVarD;
            this.f304009j = com.avito.android.advert.item.delivery_suggests.l.i(this.f304007h, uVarD);
            this.f304010k = new com.avito.android.trx_promo_impl.date_range_picker.f(new com.avito.android.trx_promo_impl.date_range_picker.mvi.l(this.f304003d, this.f304005f, n.a(), this.f304006g, this.f304009j));
        }

        @Override // com.avito.android.trx_promo_impl.date_range_picker.di.c
        public final void a(TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment) {
            trxPromoDateRangePickerFragment.f303954h0 = this.f304010k;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f304000a.u4();
            t.c(aVarU4);
            trxPromoDateRangePickerFragment.f303956j0 = aVarU4;
            trxPromoDateRangePickerFragment.f303957k0 = this.f304009j.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
