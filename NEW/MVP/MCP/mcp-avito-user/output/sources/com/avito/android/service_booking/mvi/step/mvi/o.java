package com.avito.android.service_booking.mvi.step.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingMviStepOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f274786a;

    public o(dagger.internal.u uVar) {
        this.f274786a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.service_booking.storage.preferences.a) this.f274786a.get());
    }
}
