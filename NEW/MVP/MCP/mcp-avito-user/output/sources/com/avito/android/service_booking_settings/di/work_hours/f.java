package com.avito.android.service_booking_settings.di.work_hours;

import com.avito.android.service_booking_settings_public.ServiceBookingWorkHoursLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingWorkHoursLinkHandlerModule_ProvideServiceBookingWorkHoursLinkFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_settings.d f277834a;

    public f(com.avito.android.service_booking_settings.d dVar) {
        this.f277834a = dVar;
    }

    public static C43834a a(com.avito.android.service_booking_settings.d dVar) {
        e.f277833a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingWorkHoursLink.class, new ServiceBookingWorkHoursLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingWorkHoursLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f277834a);
    }
}
