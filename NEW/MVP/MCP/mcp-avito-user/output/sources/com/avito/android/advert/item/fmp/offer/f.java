package com.avito.android.advert.item.fmp.offer;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpOfferPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75549a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f75550b;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC28373a> provider2) {
        this.f75549a = provider;
        this.f75550b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f75550b.get(), this.f75549a.get());
    }
}
