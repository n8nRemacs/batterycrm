package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesAdvertPromoBannerItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class D5 implements dagger.internal.h<C5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73729a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f73730b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f73731c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f73732d;

    public D5(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f73729a = provider;
        this.f73730b = provider2;
        this.f73731c = provider3;
        this.f73732d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C5(this.f73729a.get(), this.f73730b.get(), this.f73731c.get(), (InterfaceC35945t1) this.f73732d.get());
    }
}
