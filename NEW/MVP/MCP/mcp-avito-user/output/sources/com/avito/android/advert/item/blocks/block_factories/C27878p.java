package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28068w;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAmenitiesBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27878p implements dagger.internal.h<C27874o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28068w> f73638a;

    public C27878p(Provider<InterfaceC28068w> provider) {
        this.f73638a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27874o(this.f73638a.get());
    }
}
