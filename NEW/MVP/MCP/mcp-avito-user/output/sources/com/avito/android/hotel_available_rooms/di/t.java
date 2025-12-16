package com.avito.android.hotel_available_rooms.di;

import com.avito.android.hotel_available_rooms.HotelAvailableRoomsOpenParams;

/* compiled from: HotelAvailableRoomsModule_ProvideHotelAvailableRoomsFromKeyFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final s f162757a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f162758b;

    public t(s sVar, dagger.internal.l lVar) {
        this.f162757a = sVar;
        this.f162758b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams = (HotelAvailableRoomsOpenParams) this.f162758b.f393949a;
        this.f162757a.getClass();
        return hotelAvailableRoomsOpenParams.f162665f;
    }
}
