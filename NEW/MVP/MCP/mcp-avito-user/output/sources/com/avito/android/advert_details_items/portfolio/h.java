package com.avito.android.advert_details_items.portfolio;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPortfolioBlockItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f85129a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.services_portfolio.uxFeedback.b> f85130b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f85131c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f85132d;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.services_portfolio.uxFeedback.b> provider2, Provider<InterfaceC28373a> provider3, Provider<R0> provider4) {
        this.f85129a = provider;
        this.f85130b = provider2;
        this.f85131c = provider3;
        this.f85132d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f85129a.get(), this.f85130b.get(), this.f85131c.get(), this.f85132d.get());
    }
}
