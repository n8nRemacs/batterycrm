package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.K3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRentAgreementItemBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class P1 implements dagger.internal.h<O1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K3> f73475a;

    public P1(Provider<K3> provider) {
        this.f73475a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O1(this.f73475a.get());
    }
}
