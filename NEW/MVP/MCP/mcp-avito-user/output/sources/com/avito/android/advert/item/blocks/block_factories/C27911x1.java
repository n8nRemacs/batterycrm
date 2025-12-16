package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27967g3;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPopularityInfoBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.x1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27911x1 implements dagger.internal.h<C27907w1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27967g3> f73678a;

    public C27911x1(Provider<InterfaceC27967g3> provider) {
        this.f73678a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27907w1(this.f73678a.get());
    }
}
