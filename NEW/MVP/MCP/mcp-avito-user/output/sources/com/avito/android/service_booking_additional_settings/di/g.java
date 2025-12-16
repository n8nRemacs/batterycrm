package com.avito.android.service_booking_additional_settings.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdditionalSettingsBookingToggleModule_ProvideDiffCalculator$_avito_service_booking_additional_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final f f275172a;

    public g(f fVar) {
        this.f275172a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.diffutil.a aVar = (com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.diffutil.a) this.f275172a.get();
        a.f275161a.getClass();
        return new com.avito.android.recycler.data_aware.i(aVar, new com.avito.android.recycler.data_aware.j(), false, null, 8, null);
    }
}
