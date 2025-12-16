package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursSaveScheduleInfoConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f277886a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking_settings.data.preferences.b f277887b;

    public o(dagger.internal.l lVar, com.avito.android.service_booking_settings.data.preferences.b bVar) {
        this.f277886a = lVar;
        this.f277887b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((ServiceBookingWorkHoursArgument) this.f277886a.f393949a, (com.avito.android.service_booking_settings.data.preferences.a) this.f277887b.get());
    }
}
