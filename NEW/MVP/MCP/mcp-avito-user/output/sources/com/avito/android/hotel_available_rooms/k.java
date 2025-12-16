package com.avito.android.hotel_available_rooms;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HotelAvailableRoomsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.hotel_available_rooms.mvi.j f162832a;

    public k(com.avito.android.hotel_available_rooms.mvi.j jVar) {
        this.f162832a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.hotel_available_rooms.mvi.h) this.f162832a.get(), null, 2, null);
    }
}
