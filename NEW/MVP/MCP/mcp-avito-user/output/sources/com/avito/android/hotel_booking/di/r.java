package com.avito.android.hotel_booking.di;

import com.avito.android.hotel_booking.HotelBookingSelectRadioDeeplink;
import lv.C43834a;

/* compiled from: HotelBookingDeeplinkModule_ProvideHotelBookingSelectRadioDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.select_radio.c f163457a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.select_radio.h f163458b;

    public r(com.avito.android.hotel_booking.deeplink.select_radio.c cVar, com.avito.android.hotel_booking.deeplink.select_radio.h hVar) {
        this.f163457a = cVar;
        this.f163458b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f163458b.getClass();
        com.avito.android.hotel_booking.deeplink.select_radio.f fVar = new com.avito.android.hotel_booking.deeplink.select_radio.f();
        com.avito.android.hotel_booking.deeplink.select_radio.c cVar = this.f163457a;
        C30793n.f163451a.getClass();
        return new C43834a(HotelBookingSelectRadioDeeplink.class, fVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(HotelBookingSelectRadioDeeplink.class), cVar));
    }
}
