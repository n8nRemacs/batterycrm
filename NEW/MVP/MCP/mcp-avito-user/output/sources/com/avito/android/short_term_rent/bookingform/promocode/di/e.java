package com.avito.android.short_term_rent.bookingform.promocode.di;

import com.avito.android.short_term_rent.deeplink.BookingFormPromoCodeDialogDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BookingFormPromoCodeDialogDeeplinkModule_ProvideBookingFormPromoCodeDialogDeeplinkMapperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.promocode.deeplink.e f282105a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.promocode.deeplink.b f282106b;

    public e(com.avito.android.short_term_rent.bookingform.promocode.deeplink.e eVar, com.avito.android.short_term_rent.bookingform.promocode.deeplink.b bVar) {
        this.f282105a = eVar;
        this.f282106b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f282105a.getClass();
        com.avito.android.short_term_rent.bookingform.promocode.deeplink.d dVar = new com.avito.android.short_term_rent.bookingform.promocode.deeplink.d();
        d.f282104a.getClass();
        return new C43834a(BookingFormPromoCodeDialogDeeplink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BookingFormPromoCodeDialogDeeplink.class), this.f282106b));
    }
}
