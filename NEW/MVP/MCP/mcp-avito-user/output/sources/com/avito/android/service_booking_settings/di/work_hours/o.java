package com.avito.android.service_booking_settings.di.work_hours;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursModule_ProvideWorkHoursTimeFormatterFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<org.threeten.bp.format.c> {

    /* compiled from: ServiceBookingWorkHoursModule_ProvideWorkHoursTimeFormatterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f277846a = new o();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.f277835a.getClass();
        return org.threeten.bp.format.c.b("HH:mm");
    }
}
