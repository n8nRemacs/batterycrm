package com.avito.android.advert.item.sales_banner;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsStickedSalesBannerPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.sales_banner.analytics.b f79312a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f79313b;

    public e(com.avito.android.advert.item.sales_banner.analytics.b bVar, Provider provider) {
        this.f79312a = bVar;
        this.f79313b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.advert.item.sales_banner.analytics.a) this.f79312a.get(), this.f79313b.get());
    }
}
