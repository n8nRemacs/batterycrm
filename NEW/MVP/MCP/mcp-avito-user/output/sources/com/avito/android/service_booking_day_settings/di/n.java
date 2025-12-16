package com.avito.android.service_booking_day_settings.di;

import com.avito.android.service_booking_day_settings.ServiceBookingDayScheduleSettingsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingDayScheduleSettingsLinkHandlerModule_ProvideServiceBookingDaySettingsMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_day_settings.deeplink.c f277159a;

    public n(com.avito.android.service_booking_day_settings.deeplink.c cVar) {
        this.f277159a = cVar;
    }

    public static C43834a a(com.avito.android.service_booking_day_settings.deeplink.c cVar) {
        m.f277158a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingDayScheduleSettingsLink.class, new com.avito.android.service_booking_day_settings.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingDayScheduleSettingsLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f277159a);
    }
}
