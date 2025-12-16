package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.B3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRatingBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class H1 implements dagger.internal.h<G1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B3> f73443a;

    public H1(Provider<B3> provider) {
        this.f73443a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G1(this.f73443a.get());
    }
}
