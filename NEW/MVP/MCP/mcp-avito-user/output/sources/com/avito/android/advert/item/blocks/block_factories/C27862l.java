package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28044s;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAddressBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27862l implements dagger.internal.h<C27858k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28044s> f73598a;

    public C27862l(Provider<InterfaceC28044s> provider) {
        this.f73598a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27858k(this.f73598a.get());
    }
}
