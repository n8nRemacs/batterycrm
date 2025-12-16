package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.H3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRealtyUspBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class N1 implements dagger.internal.h<M1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H3> f73465a;

    public N1(Provider<H3> provider) {
        this.f73465a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new M1(this.f73465a.get());
    }
}
