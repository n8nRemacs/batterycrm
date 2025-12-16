package com.avito.android.service_booking_details.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingItemDetailsModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277316a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f277317b;

    public l(u uVar, Provider provider) {
        this.f277316a = uVar;
        this.f277317b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f277316a.get();
        com.avito.konveyor.a aVar2 = this.f277317b.get();
        e.f277307a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
