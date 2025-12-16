package com.avito.android.service_booking_additional_settings.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdditionalSettingsBookingToggleModule_ProvideBookingToggleItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.b f275166a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap.b f275167b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.b f275168c;

    public d(com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.b bVar, com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap.b bVar2, com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.b bVar3) {
        this.f275166a = bVar;
        this.f275167b = bVar2;
        this.f275168c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.a aVar = (com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.a) this.f275166a.get();
        com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap.a aVar2 = (com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap.a) this.f275167b.get();
        com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.a aVar3 = (com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.a) this.f275168c.get();
        a.f275161a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        c10493a.b(aVar);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
