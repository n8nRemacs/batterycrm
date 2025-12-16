package com.avito.android.advert.item.blocks.items_factories;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSellerProfileItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.q4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28038q4 implements dagger.internal.h<C28031p4> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f74012a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74013b;

    public C28038q4(dagger.internal.u uVar, Provider provider) {
        this.f74012a = uVar;
        this.f74013b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28031p4((com.avito.android.advert_details_items.sellerprofile.E) this.f74012a.get(), this.f74013b.get());
    }
}
