package com.avito.android.service_booking_details;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ServiceBookingItemDetailsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_details.mvi.n f277483a;

    public t(com.avito.android.service_booking_details.mvi.n nVar) {
        this.f277483a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_booking_details.mvi.m mVar = (com.avito.android.service_booking_details.mvi.m) this.f277483a.get();
        i2.f411430a.getClass();
        return new s(mVar, i2.a.f411433c);
    }
}
