package com.avito.android.advert.item.fmp.banner;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75443a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f75444b;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<InterfaceC28373a> provider2) {
        this.f75443a = provider;
        this.f75444b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f75444b.get(), this.f75443a.get());
    }
}
