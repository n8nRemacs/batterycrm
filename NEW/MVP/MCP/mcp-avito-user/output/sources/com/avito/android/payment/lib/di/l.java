package com.avito.android.payment.lib.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentMethodsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f214638a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f214639b;

    public l(dagger.internal.u uVar, Provider provider) {
        this.f214638a = uVar;
        this.f214639b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f214638a.get();
        com.avito.konveyor.a aVar = this.f214639b.get();
        int i12 = d.f214619a;
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
