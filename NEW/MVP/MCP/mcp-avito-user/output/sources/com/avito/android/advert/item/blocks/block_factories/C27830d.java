package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.InterfaceC28240u;
import javax.inject.Provider;

/* compiled from: AdvertDescriptionBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27830d implements dagger.internal.h<C27826c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28240u> f73536a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.blocks.items_factories.Q0 f73537b;

    public C27830d(Provider provider, com.avito.android.advert.item.blocks.items_factories.Q0 q02) {
        this.f73536a = provider;
        this.f73537b = q02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27826c(this.f73536a.get(), (com.avito.android.advert.item.blocks.items_factories.P0) this.f73537b.get());
    }
}
