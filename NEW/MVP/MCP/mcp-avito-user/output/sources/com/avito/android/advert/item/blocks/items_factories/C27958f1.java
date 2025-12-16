package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsDockingBadgeBarItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.f1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27958f1 implements dagger.internal.h<C27951e1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73949a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f73950b;

    public C27958f1(dagger.internal.u uVar, Provider provider) {
        this.f73949a = provider;
        this.f73950b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27951e1(this.f73949a.get(), (com.avito.android.advert_core.advert_badge_bar.j) this.f73950b.get());
    }
}
