package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28032p5;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV2BlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S2 implements dagger.internal.h<R2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28032p5> f73489a;

    public S2(Provider<InterfaceC28032p5> provider) {
        this.f73489a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new R2(this.f73489a.get());
    }
}
