package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsOtherCategoriesItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.b3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27932b3 implements dagger.internal.h<C27925a3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73923a;

    public C27932b3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73923a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27925a3(this.f73923a.get());
    }
}
