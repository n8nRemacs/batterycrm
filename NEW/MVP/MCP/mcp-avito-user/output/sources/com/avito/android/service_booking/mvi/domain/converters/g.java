package com.avito.android.service_booking.mvi.domain.converters;

import com.avito.android.service_booking_common.n;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingButtonTextConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f274355a;

    public g(Provider<n> provider) {
        this.f274355a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f274355a.get());
    }
}
