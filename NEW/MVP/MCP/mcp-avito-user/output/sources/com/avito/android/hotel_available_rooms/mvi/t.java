package com.avito.android.hotel_available_rooms.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelAvailableRoomsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f163205a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.hotel_available_rooms.konveyor.gallery.k> f163206b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.e> f163207c;

    public t(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f163205a = uVar;
        this.f163206b = provider;
        this.f163207c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((u) this.f163205a.get(), this.f163206b.get(), this.f163207c.get());
    }
}
