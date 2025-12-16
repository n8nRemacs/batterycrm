package com.avito.android.hotel_available_rooms.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelAvailableRoomsViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.hotel_available_rooms.konveyor.converters.a> f163210a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f163211b;

    public w(dagger.internal.u uVar, Provider provider) {
        this.f163210a = provider;
        this.f163211b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v(this.f163210a.get(), (com.avito.android.hotel_available_rooms.konveyor.converters.m) this.f163211b.get());
    }
}
