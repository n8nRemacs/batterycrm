package com.avito.android.advert_collection_list;

import android.content.res.Resources;

/* compiled from: AdvertCollectionListResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_collection_list.di.k f82174a;

    public k(com.avito.android.advert_collection_list.di.k kVar) {
        this.f82174a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Resources) this.f82174a.get());
    }
}
