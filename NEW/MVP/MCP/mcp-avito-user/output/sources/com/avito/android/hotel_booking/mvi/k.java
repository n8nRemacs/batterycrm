package com.avito.android.hotel_booking.mvi;

import com.avito.android.hotel_booking.HotelBookingOpenParams;

/* compiled from: HotelBookingBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f163924a;

    /* renamed from: b, reason: collision with root package name */
    public final v f163925b;

    public k(dagger.internal.l lVar, v vVar) {
        this.f163924a = lVar;
        this.f163925b = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((HotelBookingOpenParams) this.f163924a.f393949a, (t) this.f163925b.get());
    }
}
