package com.avito.android.advert_core.comfortable_deal_promo;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsComfortableDealPromoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f83086a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f83087b;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC28373a> provider2) {
        this.f83086a = provider;
        this.f83087b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f83087b.get(), this.f83086a.get());
    }
}
