package com.avito.android.item_price_history.di;

import Oi0.InterfaceC14698b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemPriceHistoryModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f173684a;

    /* renamed from: b, reason: collision with root package name */
    public final u f173685b;

    public k(dagger.internal.f fVar, u uVar) {
        this.f173684a = fVar;
        this.f173685b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f173684a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f173685b.get();
        e.f173676a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, interfaceC14698b);
    }
}
