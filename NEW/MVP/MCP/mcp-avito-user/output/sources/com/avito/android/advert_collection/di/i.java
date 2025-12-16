package com.avito.android.advert_collection.di;

/* compiled from: AdvertCollectionItemsModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_collection.adapter.d f81471a;

    public i(com.avito.android.advert_collection.adapter.d dVar) {
        this.f81471a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f81471a.getClass();
        com.avito.android.advert_collection.adapter.c cVar = new com.avito.android.advert_collection.adapter.c();
        f.f81465a.getClass();
        return new com.avito.android.recycler.data_aware.i(new com.avito.android.recycler.data_aware.g(), null, false, cVar, 6, null);
    }
}
