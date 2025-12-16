package com.avito.android.service_booking_schedule_repetition_impl.di;

import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingScheduleRepetitionLinkHandlerModule_ProvideServiceBookingScheduleRepetitionFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_schedule_repetition_impl.link.c f277589a;

    public e(com.avito.android.service_booking_schedule_repetition_impl.link.c cVar) {
        this.f277589a = cVar;
    }

    public static C43834a a(com.avito.android.service_booking_schedule_repetition_impl.link.c cVar) {
        d.f277588a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingScheduleRepetitionLink.class, new com.avito.android.service_booking_schedule_repetition_impl.link.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingScheduleRepetitionLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f277589a);
    }
}
