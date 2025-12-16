package com.avito.android.hotel_booking.di;

import com.avito.android.hotel_booking.HotelBookingDeeplink;
import lv.C43834a;

/* compiled from: HotelBookingDeeplinkModule_ProvideHotelBookingDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_booking.di.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30795p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.booking.c f163453a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.booking.f f163454b;

    public C30795p(com.avito.android.hotel_booking.deeplink.booking.c cVar, com.avito.android.hotel_booking.deeplink.booking.f fVar) {
        this.f163453a = cVar;
        this.f163454b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f163454b.getClass();
        com.avito.android.hotel_booking.deeplink.booking.d dVar = new com.avito.android.hotel_booking.deeplink.booking.d();
        com.avito.android.hotel_booking.deeplink.booking.c cVar = this.f163453a;
        C30793n.f163451a.getClass();
        return new C43834a(HotelBookingDeeplink.class, dVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(HotelBookingDeeplink.class), cVar));
    }
}
