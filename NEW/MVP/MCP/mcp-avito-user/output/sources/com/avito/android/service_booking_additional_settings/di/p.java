package com.avito.android.service_booking_additional_settings.di;

import com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.ServiceBookingAdditionalSettingsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingAdditionalSettingsLinkHandlerModule_ProvideServiceBookingAdditionalSettingsMapping$_avito_service_booking_additional_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.d f275221a;

    public p(com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.d dVar) {
        this.f275221a = dVar;
    }

    public static C43834a a(com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.d dVar) {
        o.f275220a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingAdditionalSettingsLink.class, new com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingAdditionalSettingsLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f275221a);
    }
}
