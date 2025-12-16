package com.avito.android.advert.item.blocks.block_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsNoteBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.p1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27880p1 implements dagger.internal.h<C27876o1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.T2> f73640a;

    public C27880p1(Provider<com.avito.android.advert.item.blocks.items_factories.T2> provider) {
        this.f73640a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27876o1(this.f73640a.get());
    }
}
