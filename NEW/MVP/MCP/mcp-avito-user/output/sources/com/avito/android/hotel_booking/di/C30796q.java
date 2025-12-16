package com.avito.android.hotel_booking.di;

import com.avito.android.hotel_booking.HotelBookingEnterDataDeeplink;
import lv.C43834a;

/* compiled from: HotelBookingDeeplinkModule_ProvideHotelBookingEnterDataDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_booking.di.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30796q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.enter_data.c f163455a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.enter_data.h f163456b;

    public C30796q(com.avito.android.hotel_booking.deeplink.enter_data.c cVar, com.avito.android.hotel_booking.deeplink.enter_data.h hVar) {
        this.f163455a = cVar;
        this.f163456b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.hotel_booking.deeplink.enter_data.f fVar = (com.avito.android.hotel_booking.deeplink.enter_data.f) this.f163456b.get();
        C30793n.f163451a.getClass();
        return new C43834a(HotelBookingEnterDataDeeplink.class, fVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(HotelBookingEnterDataDeeplink.class), this.f163455a));
    }
}
