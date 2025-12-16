package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28003l4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSearchSuggestsBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.f2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27841f2 implements dagger.internal.h<C27837e2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28003l4> f73559a;

    public C27841f2(Provider<InterfaceC28003l4> provider) {
        this.f73559a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27837e2(this.f73559a.get());
    }
}
