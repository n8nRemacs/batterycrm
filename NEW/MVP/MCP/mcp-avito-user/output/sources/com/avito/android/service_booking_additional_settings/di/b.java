package com.avito.android.service_booking_additional_settings.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdditionalSettingsBookingToggleModule_ProvideBookingToggleAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275162a;

    public b(u uVar) {
        this.f275162a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f275162a.get();
        a.f275161a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
