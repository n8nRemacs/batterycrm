package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.N5;
import javax.inject.Provider;

/* compiled from: ModelSpecsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i3 implements dagger.internal.h<h3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<N5> f73586a;

    public i3(Provider<N5> provider) {
        this.f73586a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h3(this.f73586a.get());
    }
}
