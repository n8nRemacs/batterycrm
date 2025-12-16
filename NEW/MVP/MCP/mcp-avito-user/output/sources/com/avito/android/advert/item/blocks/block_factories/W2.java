package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.v5;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV4BlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class W2 implements dagger.internal.h<V2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<v5> f73505a;

    public W2(Provider<v5> provider) {
        this.f73505a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new V2(this.f73505a.get());
    }
}
