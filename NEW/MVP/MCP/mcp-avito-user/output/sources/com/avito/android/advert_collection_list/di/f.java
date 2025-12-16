package com.avito.android.advert_collection_list.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionListModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_collection_list.adapter.b f82089a;

    public f(com.avito.android.advert_collection_list.adapter.b bVar) {
        this.f82089a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert_collection_list.adapter.a aVar = (com.avito.android.advert_collection_list.adapter.a) this.f82089a.get();
        c.f82083a.getClass();
        return new com.avito.android.recycler.data_aware.i(new com.avito.android.recycler.data_aware.g(), null, false, aVar, 6, null);
    }
}
