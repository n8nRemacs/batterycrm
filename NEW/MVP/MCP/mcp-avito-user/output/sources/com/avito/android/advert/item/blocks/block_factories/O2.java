package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27969g5;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTitleBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class O2 implements dagger.internal.h<N2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27969g5> f73471a;

    public O2(Provider<InterfaceC27969g5> provider) {
        this.f73471a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N2(this.f73471a.get());
    }
}
