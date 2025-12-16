package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.K5;
import javax.inject.Provider;

/* compiled from: MarketplaceStocksBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class g3 implements dagger.internal.h<f3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K5> f73570a;

    public g3(Provider<K5> provider) {
        this.f73570a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f3(this.f73570a.get());
    }
}
