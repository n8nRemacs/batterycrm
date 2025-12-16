package com.avito.android.advert.item.marketplace_sales_banner;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MarketplaceSalesBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f77553a;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f77553a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f77553a.get());
    }
}
