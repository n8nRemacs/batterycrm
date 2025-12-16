package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsServiceEducationItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.w4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28073w4 implements dagger.internal.h<C28067v4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74064a;

    public C28073w4(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f74064a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28067v4(this.f74064a.get());
    }
}
