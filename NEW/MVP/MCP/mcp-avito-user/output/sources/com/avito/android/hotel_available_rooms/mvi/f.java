package com.avito.android.hotel_available_rooms.mvi;

import com.avito.android.hotel_available_rooms.HotelAvailableRoomsOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HotelAvailableRoomsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f163146a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f163147b;

    public f(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f163146a = lVar;
        this.f163147b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((HotelAvailableRoomsOpenParams) this.f163146a.f393949a, (k) this.f163147b.get());
    }
}
