package com.avito.android.hotel_available_rooms.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HotelAvailableRoomsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f163092a;

    public d(dagger.internal.u uVar) {
        this.f163092a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((k) this.f163092a.get());
    }
}
