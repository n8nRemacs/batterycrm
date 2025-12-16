package com.avito.android.service_booking_details.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingItemDetailsModule_ProvideDataAwareAdapterPresenterImpl$_avito_service_booking_details_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f277309a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f277310b;

    /* renamed from: c, reason: collision with root package name */
    public final u f277311c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f277309a = provider;
        this.f277310b = provider2;
        this.f277311c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f277309a);
        com.avito.konveyor.adapter.h hVar = this.f277310b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f277311c.get();
        e.f277307a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
