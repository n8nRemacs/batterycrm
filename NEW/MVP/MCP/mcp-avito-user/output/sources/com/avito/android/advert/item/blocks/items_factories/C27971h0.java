package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsChatHistoryItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27971h0 implements dagger.internal.h<C27964g0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73961a;

    public C27971h0(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f73961a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27964g0(this.f73961a.get());
    }
}
