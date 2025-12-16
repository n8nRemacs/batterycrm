package com.avito.android.service_booking_additional_settings.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdditionalSettingsBookingToggleModule_ProvideBookingToggleSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275169a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f275170b;

    public e(u uVar, Provider provider) {
        this.f275169a = uVar;
        this.f275170b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f275169a.get();
        com.avito.konveyor.a aVar = this.f275170b.get();
        a.f275161a.getClass();
        return new com.avito.konveyor.adapter.j(hVar, aVar);
    }
}
