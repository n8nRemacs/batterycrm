package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsHotelReviewItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.m2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28008m2 implements dagger.internal.h<C28001l2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73989a;

    public C28008m2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73989a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28001l2(this.f73989a.get());
    }
}
