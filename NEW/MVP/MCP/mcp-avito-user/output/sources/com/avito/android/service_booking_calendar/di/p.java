package com.avito.android.service_booking_calendar.di;

import com.avito.android.service_booking_calendar.link.ServiceBookingCalendarMonthLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingCalendarLinksHandlerModule_ProvideCalendarMonthLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.link.c f275507a;

    public p(com.avito.android.service_booking_calendar.link.c cVar) {
        this.f275507a = cVar;
    }

    public static C43834a a(com.avito.android.service_booking_calendar.link.c cVar) {
        o.f275506a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingCalendarMonthLink.class, new ServiceBookingCalendarMonthLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingCalendarMonthLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f275507a);
    }
}
