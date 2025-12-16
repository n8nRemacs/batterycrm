package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.service_booking.BookingFlow;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingMviStepReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.n> f274795a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f274796b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<BookingFlow> f274797c;

    public u(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f274795a = provider;
        this.f274796b = uVar;
        this.f274797c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f274795a.get(), (com.avito.android.service_booking.mvi.a) this.f274796b.get(), this.f274797c.get());
    }
}
