package com.avito.android.advert_collection.di;

import javax.inject.Provider;

/* compiled from: AdvertCollectionItemsModule_ProvideDataAwareAdapterPresenter$_avito_advert_collection_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f81468a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f81469b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f81470c;

    public h(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f81468a = provider;
        this.f81469b = provider2;
        this.f81470c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f81468a);
        com.avito.konveyor.a aVar = this.f81469b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f81470c.get();
        f.f81465a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), eVar);
    }
}
