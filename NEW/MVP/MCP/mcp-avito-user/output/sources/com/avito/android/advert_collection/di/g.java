package com.avito.android.advert_collection.di;

import javax.inject.Provider;

/* compiled from: AdvertCollectionItemsModule_ProvideAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f81466a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f81467b;

    public g(dagger.internal.u uVar, Provider provider) {
        this.f81466a = uVar;
        this.f81467b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f81466a.get();
        com.avito.konveyor.a aVar2 = this.f81467b.get();
        f.f81465a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
