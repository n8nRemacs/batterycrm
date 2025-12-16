package com.avito.android.service_booking_common.di;

import javax.inject.Provider;

/* compiled from: ServiceBookingTimeslotItemModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class D implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f276510a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f276511b;

    public D(dagger.internal.u uVar, Provider provider) {
        this.f276510a = uVar;
        this.f276511b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f276510a.get();
        com.avito.konveyor.a aVar2 = this.f276511b.get();
        w.f276556a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
