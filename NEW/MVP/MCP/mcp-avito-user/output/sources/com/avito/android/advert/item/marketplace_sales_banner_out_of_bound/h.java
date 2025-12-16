package com.avito.android.advert.item.marketplace_sales_banner_out_of_bound;

import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesBannerOutOfBoundsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f77583a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f77584b;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<C> provider2) {
        this.f77583a = provider;
        this.f77584b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f77583a.get(), this.f77584b.get());
    }
}
