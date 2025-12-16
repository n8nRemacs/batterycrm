package com.avito.android.advert_collection.di;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import javax.inject.Provider;

/* compiled from: AdvertCollectionItemsModule_ProvideFavoriteAdvertItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<com.avito.android.favorites.adapter.advert.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u3.h<SimpleTestGroup>> f81472a;

    public j(Provider<u3.h<SimpleTestGroup>> provider) {
        this.f81472a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u3.h<SimpleTestGroup> hVar = this.f81472a.get();
        f.f81465a.getClass();
        return new com.avito.android.favorites.adapter.advert.p(null, hVar);
    }
}
