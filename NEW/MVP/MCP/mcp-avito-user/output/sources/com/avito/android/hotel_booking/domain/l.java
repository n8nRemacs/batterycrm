package com.avito.android.hotel_booking.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelBookingUpdateParameterUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f163472a;

    public l(Provider<R0> provider) {
        this.f163472a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f163472a.get());
    }
}
