package com.avito.android.service_booking_additional_settings.di;

import com.avito.android.service_booking_additional_settings.deeplink.toggle_service_booking_link.ServiceBookingToggleLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServiceBookingAdditionalSettingsLinkHandlerModule_ProvideToggleServiceBookingLinkMapping$_avito_service_booking_additional_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_additional_settings.deeplink.toggle_link.e f275222a;

    public q(com.avito.android.service_booking_additional_settings.deeplink.toggle_link.e eVar) {
        this.f275222a = eVar;
    }

    public static C43834a a(com.avito.android.service_booking_additional_settings.deeplink.toggle_link.e eVar) {
        o.f275220a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServiceBookingToggleLink.class, new com.avito.android.service_booking_additional_settings.deeplink.toggle_link.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServiceBookingToggleLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f275222a);
    }
}
