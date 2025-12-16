package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.z4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28091z4 implements dagger.internal.h<C28085y4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74091a;

    public C28091z4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74091a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28085y4(this.f74091a.get());
    }
}
