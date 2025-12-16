package com.avito.android.advert_collection_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f82084a;

    /* renamed from: b, reason: collision with root package name */
    public final u f82085b;

    public d(dagger.internal.f fVar, u uVar) {
        this.f82084a = fVar;
        this.f82085b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f82084a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f82085b.get();
        c.f82083a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
