package com.avito.android.service_booking_common.di;

import javax.inject.Provider;

/* compiled from: ServiceBookingDateItemModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.b> f276527a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f276528b;

    public q(dagger.internal.u uVar, Provider provider) {
        this.f276527a = provider;
        this.f276528b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.b bVar = this.f276527a.get();
        com.avito.android.recycler.data_aware.a aVar = (com.avito.android.recycler.data_aware.a) this.f276528b.get();
        k.f276519a.getClass();
        return new com.avito.android.recycler.data_aware.i(bVar, null, false, aVar, 2, null);
    }
}
