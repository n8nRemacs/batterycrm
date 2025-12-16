package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.T3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRfpBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class X1 implements dagger.internal.h<W1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<T3> f73508a;

    public X1(Provider<T3> provider) {
        this.f73508a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W1(this.f73508a.get());
    }
}
