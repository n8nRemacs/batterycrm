package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28066v3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B1 implements dagger.internal.h<A1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28066v3> f73420a;

    public B1(Provider<InterfaceC28066v3> provider) {
        this.f73420a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A1(this.f73420a.get());
    }
}
