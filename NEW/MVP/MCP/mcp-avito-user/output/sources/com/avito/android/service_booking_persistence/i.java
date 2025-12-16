package com.avito.android.service_booking_persistence;

import AK0.l;
import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingOnboardingStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f277486a;

    public i(C30214v6 c30214v6) {
        this.f277486a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((l) this.f277486a.get());
    }
}
