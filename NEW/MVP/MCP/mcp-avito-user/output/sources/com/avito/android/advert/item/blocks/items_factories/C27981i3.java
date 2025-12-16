package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsPopularityInfoFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.i3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27981i3 implements dagger.internal.h<C27974h3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73971a;

    public C27981i3(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73971a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27974h3(this.f73971a.get());
    }
}
