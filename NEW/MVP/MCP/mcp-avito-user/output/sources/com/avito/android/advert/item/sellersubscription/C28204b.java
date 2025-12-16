package com.avito.android.advert.item.sellersubscription;

import javax.inject.Provider;

/* compiled from: AdvertDetailsSellerSubscriptionBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.sellersubscription.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28204b implements dagger.internal.h<C28203a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f79733a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D> f79734b;

    public C28204b(dagger.internal.u uVar, Provider provider) {
        this.f79733a = uVar;
        this.f79734b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28203a((InterfaceC28205c) this.f79733a.get(), this.f79734b.get());
    }
}
