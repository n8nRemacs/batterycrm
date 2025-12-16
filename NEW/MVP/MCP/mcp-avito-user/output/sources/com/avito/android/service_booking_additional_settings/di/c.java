package com.avito.android.service_booking_additional_settings.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdditionalSettingsBookingToggleModule_ProvideBookingToggleDataAwareAdapterPresenterImplFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f275163a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f275164b;

    /* renamed from: c, reason: collision with root package name */
    public final u f275165c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f275163a = provider;
        this.f275164b = provider2;
        this.f275165c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f275163a);
        com.avito.konveyor.adapter.h hVar = this.f275164b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f275165c.get();
        a.f275161a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
