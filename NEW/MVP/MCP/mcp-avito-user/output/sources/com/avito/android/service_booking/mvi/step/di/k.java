package com.avito.android.service_booking.mvi.step.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingMviStepModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f274632a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f274633b;

    public k(u uVar, Provider provider) {
        this.f274632a = uVar;
        this.f274633b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f274632a.get();
        com.avito.konveyor.a aVar2 = this.f274633b.get();
        d.f274623a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
