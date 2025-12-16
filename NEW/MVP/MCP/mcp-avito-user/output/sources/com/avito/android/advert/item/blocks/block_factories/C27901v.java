package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAutotekaTeaserBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27901v implements dagger.internal.h<C27897u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.G> f73665a;

    public C27901v(Provider<com.avito.android.advert.item.blocks.items_factories.G> provider) {
        this.f73665a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27897u(this.f73665a.get());
    }
}
