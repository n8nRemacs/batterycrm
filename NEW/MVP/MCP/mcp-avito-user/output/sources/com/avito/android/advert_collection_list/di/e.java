package com.avito.android.advert_collection_list.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionListModule_ProvideDataAwareAdapterPresenter$_avito_advert_collection_list_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f82086a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f82087b;

    /* renamed from: c, reason: collision with root package name */
    public final u f82088c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f82086a = provider;
        this.f82087b = provider2;
        this.f82088c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f82086a);
        com.avito.konveyor.a aVar = this.f82087b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f82088c.get();
        c.f82083a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), eVar);
    }
}
