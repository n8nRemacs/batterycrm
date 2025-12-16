package com.avito.android.service_booking_settings.di.work_hours;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursModule_ProvideDiffCalculator$_avito_service_booking_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277840a;

    public j(u uVar) {
        this.f277840a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.a aVar = (com.avito.android.recycler.data_aware.a) this.f277840a.get();
        g.f277835a.getClass();
        return new com.avito.android.recycler.data_aware.i(new com.avito.android.recycler.data_aware.g(), null, true, aVar, 2, null);
    }
}
