package com.avito.android.service_booking.mvi.step.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingMviStepModule_ProvideDataAwareAdapterPresenterImpl$_avito_service_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f274625a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f274626b;

    /* renamed from: c, reason: collision with root package name */
    public final u f274627c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f274625a = provider;
        this.f274626b = provider2;
        this.f274627c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f274625a);
        com.avito.konveyor.adapter.h hVar = this.f274626b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f274627c.get();
        d.f274623a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
