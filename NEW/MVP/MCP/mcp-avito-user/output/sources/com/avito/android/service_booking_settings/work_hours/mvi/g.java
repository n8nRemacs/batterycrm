package com.avito.android.service_booking_settings.work_hours.mvi;

import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_settings.domain.c f278112a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f278113b;

    public g(com.avito.android.service_booking_settings.domain.c cVar, dagger.internal.l lVar) {
        this.f278112a = cVar;
        this.f278113b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.service_booking_settings.domain.a) this.f278112a.get(), (ServiceBookingWorkHoursArgument) this.f278113b.f393949a);
    }
}
