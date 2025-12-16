package com.avito.android.service_orders.di;

import javax.inject.Provider;

/* compiled from: ServiceOrdersListModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f279165a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f279166b;

    public s(dagger.internal.u uVar, Provider provider) {
        this.f279165a = uVar;
        this.f279166b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f279165a.get();
        com.avito.konveyor.a aVar2 = this.f279166b.get();
        j.f279138a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
