package com.avito.android.str_booking.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingAdaptersModule_ProvideHeaderListRecyclerAdapter$_avito_str_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f285558a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f285559b;

    public i(dagger.internal.u uVar, Provider provider) {
        this.f285558a = uVar;
        this.f285559b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f285558a.get();
        com.avito.konveyor.a aVar2 = this.f285559b.get();
        int i12 = f.f285555a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
