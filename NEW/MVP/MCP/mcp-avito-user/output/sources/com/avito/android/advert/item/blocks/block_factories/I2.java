package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.Y4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsStickedSalesBannerBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class I2 implements dagger.internal.h<H2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y4> f73448a;

    public I2(Provider<Y4> provider) {
        this.f73448a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H2(this.f73448a.get());
    }
}
