package com.avito.android.publish.price_list.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListItemsModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f238516a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f238517b;

    public m(dagger.internal.u uVar, Provider provider) {
        this.f238516a = uVar;
        this.f238517b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f238516a.get();
        com.avito.konveyor.a aVar = this.f238517b.get();
        e.f238492a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
