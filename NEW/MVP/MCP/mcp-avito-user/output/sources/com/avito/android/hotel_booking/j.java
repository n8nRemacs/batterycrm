package com.avito.android.hotel_booking;

import com.avito.android.hotel_booking.mvi.m;
import com.avito.android.hotel_booking.mvi.o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HotelBookingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final o f163616a;

    public j(o oVar) {
        this.f163616a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((m) this.f163616a.get(), null, 2, null);
    }
}
