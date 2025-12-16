package com.avito.android.service_booking_settings.work_hours.mvi;

import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_settings.domain.c f278051a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f278052b;

    public e(com.avito.android.service_booking_settings.domain.c cVar, dagger.internal.l lVar) {
        this.f278051a = cVar;
        this.f278052b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.service_booking_settings.domain.a) this.f278051a.get(), (ServiceBookingWorkHoursArgument) this.f278052b.f393949a);
    }
}
