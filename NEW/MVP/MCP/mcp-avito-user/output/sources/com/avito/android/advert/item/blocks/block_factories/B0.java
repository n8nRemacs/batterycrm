package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28046s1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpBannerBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B0 implements dagger.internal.h<A0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28046s1> f73419a;

    public B0(Provider<InterfaceC28046s1> provider) {
        this.f73419a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A0(this.f73419a.get());
    }
}
