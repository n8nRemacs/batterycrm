package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28024o4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28043r4;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSellerInfoBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.l2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27865l2 implements dagger.internal.h<C27861k2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28024o4> f73601a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28043r4> f73602b;

    public C27865l2(Provider<InterfaceC28024o4> provider, Provider<InterfaceC28043r4> provider2) {
        this.f73601a = provider;
        this.f73602b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27861k2(this.f73601a.get(), this.f73602b.get());
    }
}
