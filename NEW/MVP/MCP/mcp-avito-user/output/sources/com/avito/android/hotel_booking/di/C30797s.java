package com.avito.android.hotel_booking.di;

import com.avito.android.hotel_booking.HotelBookingSelectSingleValueDeeplink;
import lv.C43834a;

/* compiled from: HotelBookingDeeplinkModule_ProvideHotelBookingSelectSingleValueDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_booking.di.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30797s implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.select_single_value.c f163459a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.select_single_value.h f163460b;

    public C30797s(com.avito.android.hotel_booking.deeplink.select_single_value.c cVar, com.avito.android.hotel_booking.deeplink.select_single_value.h hVar) {
        this.f163459a = cVar;
        this.f163460b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f163460b.getClass();
        com.avito.android.hotel_booking.deeplink.select_single_value.f fVar = new com.avito.android.hotel_booking.deeplink.select_single_value.f();
        com.avito.android.hotel_booking.deeplink.select_single_value.c cVar = this.f163459a;
        C30793n.f163451a.getClass();
        return new C43834a(HotelBookingSelectSingleValueDeeplink.class, fVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(HotelBookingSelectSingleValueDeeplink.class), cVar));
    }
}
