package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceHistoryItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.u3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28060u3 implements dagger.internal.h<C28054t3> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74037a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f74038b;

    public C28060u3(dagger.internal.l lVar, Provider provider) {
        this.f74037a = provider;
        this.f74038b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28054t3(this.f74037a.get(), (String) this.f74038b.f393949a);
    }
}
