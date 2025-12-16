package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsMultiItemParamsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.l1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27864l1 implements dagger.internal.h<C27860k1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.N2> f73600a;

    public C27864l1(Provider<com.avito.android.advert.item.blocks.items_factories.N2> provider) {
        this.f73600a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27860k1(this.f73600a.get());
    }
}
