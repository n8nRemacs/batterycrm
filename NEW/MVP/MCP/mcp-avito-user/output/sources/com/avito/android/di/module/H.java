package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideAdvertGridServiceTrustItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H implements dagger.internal.h<com.avito.android.serp.adapter.service_trust_grid.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.sale_advert_item.c> f143978a;

    public H(Provider<com.avito.android.serp.adapter.sale_advert_item.c> provider) {
        this.f143978a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.sale_advert_item.c cVar = this.f143978a.get();
        D d12 = D.f143878a;
        return new com.avito.android.serp.adapter.service_trust_grid.d(cVar);
    }
}
