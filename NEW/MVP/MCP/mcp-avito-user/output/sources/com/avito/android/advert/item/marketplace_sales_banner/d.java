package com.avito.android.advert.item.marketplace_sales_banner;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesBannerFilter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f77549a;

    public d(Provider<com.avito.android.advert_core.analytics.a> provider) {
        this.f77549a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f77549a.get());
    }
}
