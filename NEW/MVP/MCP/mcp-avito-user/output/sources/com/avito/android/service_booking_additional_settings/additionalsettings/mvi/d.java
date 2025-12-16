package com.avito.android.service_booking_additional_settings.additionalsettings.mvi;

import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingAdditionalSettingsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a> f274975a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.e<ServiceBookingAdditionalSettingsInternalAction>> f274976b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.m> f274977c;

    /* renamed from: d, reason: collision with root package name */
    public final u f274978d;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f274975a = provider;
        this.f274976b = provider2;
        this.f274977c = provider3;
        this.f274978d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f274975a.get(), this.f274976b.get(), this.f274977c.get(), (com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.j) this.f274978d.get());
    }
}
