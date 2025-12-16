package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsEquipmentsTileItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.o1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28021o1 implements dagger.internal.h<C28014n1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73997a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C43617a> f73998b;

    public C28021o1(Provider<com.avito.android.advert.item.similars.j> provider, Provider<C43617a> provider2) {
        this.f73997a = provider;
        this.f73998b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.item.similars.j jVar = this.f73997a.get();
        this.f73998b.get();
        return new C28014n1(jVar);
    }
}
