package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsNormalizedAndHistoryPricesItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class S2 implements dagger.internal.h<R2> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f73853a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f73854b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f73855c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73856d;

    public S2(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f73853a = lVar;
        this.f73854b = provider;
        this.f73855c = uVar;
        this.f73856d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new R2((String) this.f73853a.f393949a, this.f73854b.get(), (InterfaceC35945t1) this.f73855c.get(), this.f73856d.get());
    }
}
