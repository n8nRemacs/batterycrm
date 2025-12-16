package com.avito.android.service_orders.di;

import androidx.recyclerview.widget.C;
import javax.inject.Provider;

/* compiled from: ServiceOrdersListModule_ProvideDataAwareAdapterPresenterImpl$_avito_service_orders_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f279145a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f279146b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f279147c;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f279145a = provider;
        this.f279146b = provider2;
        this.f279147c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f279145a);
        com.avito.konveyor.adapter.h hVar = this.f279146b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f279147c.get();
        j.f279138a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
