package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDisclaimerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.c1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27937c1 implements dagger.internal.h<C27930b1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73928a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f73929b;

    public C27937c1(Provider<com.avito.android.advert.item.similars.j> provider, Provider<com.avito.android.util.text.a> provider2) {
        this.f73928a = provider;
        this.f73929b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27930b1(this.f73928a.get(), this.f73929b.get());
    }
}
