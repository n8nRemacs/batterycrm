package com.avito.android.service_booking_common.di;

import javax.inject.Provider;

/* compiled from: ServiceBookingDateItemModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f276523a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f276524b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f276525c;

    public o(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider) {
        this.f276523a = fVar;
        this.f276524b = provider;
        this.f276525c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f276523a);
        com.avito.konveyor.adapter.h hVar = this.f276524b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f276525c.get();
        k.f276519a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
