package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDeliverySuggestsBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.n0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27871n0 implements dagger.internal.h<C27867m0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.J0> f73631a;

    public C27871n0(Provider<com.avito.android.advert.item.blocks.items_factories.J0> provider) {
        this.f73631a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27867m0(this.f73631a.get());
    }
}
