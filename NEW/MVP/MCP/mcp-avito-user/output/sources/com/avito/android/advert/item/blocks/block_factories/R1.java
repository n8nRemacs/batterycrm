package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.C28076x1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRentConditionsBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class R1 implements dagger.internal.h<Q1> {

    /* renamed from: a, reason: collision with root package name */
    public final C28076x1 f73483a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73484b;

    public R1(C28076x1 c28076x1, Provider provider) {
        this.f73483a = c28076x1;
        this.f73484b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q1((C28070w1) this.f73483a.get(), this.f73484b.get());
    }
}
