package com.avito.android.advert.item.marketplace_sales_advert_promo_banner;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesAdvertPromoBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f77523a;

    public e(Provider<com.avito.android.advert_core.analytics.a> provider) {
        this.f77523a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f77523a.get());
    }
}
