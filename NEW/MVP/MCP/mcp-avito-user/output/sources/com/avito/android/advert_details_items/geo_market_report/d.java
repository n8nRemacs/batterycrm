package com.avito.android.advert_details_items.geo_market_report;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsGeoMarketReportPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f84778a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f84779b;

    public d(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.advert_core.analytics.a> provider2) {
        this.f84778a = provider;
        this.f84779b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f84778a.get(), this.f84779b.get());
    }
}
