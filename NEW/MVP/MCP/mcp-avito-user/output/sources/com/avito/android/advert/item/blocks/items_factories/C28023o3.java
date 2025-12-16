package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsPpRecallItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.o3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28023o3 implements dagger.internal.h<C28016n3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73999a;

    public C28023o3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73999a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28016n3(this.f73999a.get());
    }
}
