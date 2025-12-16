package com.avito.android.service_booking_settings.di.work_hours;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingWorkHoursModule_ProvideDataAwareAdapterPresenterImpl$_avito_service_booking_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f277837a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f277838b;

    /* renamed from: c, reason: collision with root package name */
    public final u f277839c;

    public i(u uVar, Provider provider, Provider provider2) {
        this.f277837a = provider;
        this.f277838b = provider2;
        this.f277839c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f277837a);
        com.avito.konveyor.adapter.h hVar = this.f277838b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f277839c.get();
        g.f277835a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
