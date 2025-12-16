package com.avito.android.publish.price_list.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListItemsModule_ProvideDataAwareAdapterPresenterImpl$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f238494a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f238495b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f238496c;

    public g(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f238494a = provider;
        this.f238495b = provider2;
        this.f238496c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f238494a);
        com.avito.konveyor.adapter.h hVar = this.f238495b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f238496c.get();
        e.f238492a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
