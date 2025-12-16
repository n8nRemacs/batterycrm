package com.avito.android.service_booking_common.di;

import javax.inject.Provider;

/* compiled from: ServiceBookingTimeslotItemModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class A implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f276504a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f276505b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f276506c;

    public A(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider) {
        this.f276504a = fVar;
        this.f276505b = provider;
        this.f276506c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f276504a);
        com.avito.konveyor.adapter.h hVar = this.f276505b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f276506c.get();
        w.f276556a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
