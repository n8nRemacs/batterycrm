package com.avito.android.hotel_booking.di;

import com.avito.android.hotel_booking.HotelCreateMessengerDeeplink;
import lv.C43834a;

/* compiled from: HotelBookingDeeplinkModule_ProvideHotelCreateMessengerDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_booking.di.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30798t implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.create_messenger.e f163461a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.hotel_booking.deeplink.create_messenger.h f163462b;

    public C30798t(com.avito.android.hotel_booking.deeplink.create_messenger.e eVar, com.avito.android.hotel_booking.deeplink.create_messenger.h hVar) {
        this.f163461a = eVar;
        this.f163462b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f163462b.getClass();
        com.avito.android.hotel_booking.deeplink.create_messenger.f fVar = new com.avito.android.hotel_booking.deeplink.create_messenger.f();
        com.avito.android.hotel_booking.deeplink.create_messenger.e eVar = this.f163461a;
        C30793n.f163451a.getClass();
        return new C43834a(HotelCreateMessengerDeeplink.class, fVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(HotelCreateMessengerDeeplink.class), eVar));
    }
}
