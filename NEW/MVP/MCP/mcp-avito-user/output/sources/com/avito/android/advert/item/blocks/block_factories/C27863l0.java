package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsCreditCalculatorBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.l0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27863l0 implements dagger.internal.h<C27859k0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.F0> f73599a;

    public C27863l0(Provider<com.avito.android.advert.item.blocks.items_factories.F0> provider) {
        this.f73599a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27859k0(this.f73599a.get());
    }
}
