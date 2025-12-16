package com.avito.android.item_price_history.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemPriceHistoryModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f173678a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f173679b;

    /* renamed from: c, reason: collision with root package name */
    public final u f173680c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f173678a = provider;
        this.f173679b = provider2;
        this.f173680c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f173678a);
        com.avito.konveyor.adapter.h hVar = this.f173679b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f173680c.get();
        e.f173676a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
