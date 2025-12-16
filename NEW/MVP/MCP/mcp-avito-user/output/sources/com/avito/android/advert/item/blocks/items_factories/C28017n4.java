package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSearchSuggestsItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.n4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28017n4 implements dagger.internal.h<C28010m4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73994a;

    public C28017n4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73994a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28010m4(this.f73994a.get());
    }
}
