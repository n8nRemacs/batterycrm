package com.avito.android.advert.item;

import javax.inject.Provider;

/* compiled from: AdvertDetailsCollectionToastManager_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28150n implements dagger.internal.h<C28144l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_toast.a> f77737a;

    public C28150n(Provider<com.avito.android.advert_collection_toast.a> provider) {
        this.f77737a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28144l(this.f77737a.get());
    }
}
