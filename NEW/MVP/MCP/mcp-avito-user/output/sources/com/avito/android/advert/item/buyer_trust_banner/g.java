package com.avito.android.advert.item.buyer_trust_banner;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuyerTrustBannerPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f74225a;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f74225a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f74225a.get());
    }
}
