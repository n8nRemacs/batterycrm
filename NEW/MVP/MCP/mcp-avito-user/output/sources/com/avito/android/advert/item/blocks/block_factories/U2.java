package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.s5;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV3BlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class U2 implements dagger.internal.h<T2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<s5> f73497a;

    public U2(Provider<s5> provider) {
        this.f73497a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new T2(this.f73497a.get());
    }
}
