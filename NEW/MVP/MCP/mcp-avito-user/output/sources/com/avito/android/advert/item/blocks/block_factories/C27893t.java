package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsAutoRecallMeBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27893t implements dagger.internal.h<C27889s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.D> f73656a;

    public C27893t(Provider<com.avito.android.advert.item.blocks.items_factories.D> provider) {
        this.f73656a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27889s(this.f73656a.get());
    }
}
