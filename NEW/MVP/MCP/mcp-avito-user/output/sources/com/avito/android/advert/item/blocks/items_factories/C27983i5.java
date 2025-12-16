package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsTitleItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.i5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27983i5 implements dagger.internal.h<C27976h5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73972a;

    public C27983i5(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73972a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27976h5(this.f73972a.get());
    }
}
