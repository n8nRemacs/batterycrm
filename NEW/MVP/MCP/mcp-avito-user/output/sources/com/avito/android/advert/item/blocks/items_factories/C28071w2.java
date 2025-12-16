package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsIcebreakersRedesignItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.w2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28071w2 implements dagger.internal.h<C28065v2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74055a;

    public C28071w2(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74055a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28065v2(this.f74055a.get());
    }
}
