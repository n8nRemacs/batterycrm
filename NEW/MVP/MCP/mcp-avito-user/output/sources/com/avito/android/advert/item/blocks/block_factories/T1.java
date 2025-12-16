package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.N3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRepairCalculatorBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class T1 implements dagger.internal.h<S1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N3> f73492a;

    public T1(Provider<N3> provider) {
        this.f73492a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S1(this.f73492a.get());
    }
}
