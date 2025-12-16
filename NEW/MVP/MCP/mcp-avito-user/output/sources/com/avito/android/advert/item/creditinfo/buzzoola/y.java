package com.avito.android.advert.item.creditinfo.buzzoola;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BuzzoolaCreditBannerViewModelFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f75003a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f75004b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f75005c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.event_service.c> f75006d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75007e;

    public y(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f75003a = uVar;
        this.f75004b = provider;
        this.f75005c = provider2;
        this.f75006d = provider3;
        this.f75007e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((BuzzoolaCreditBannerLoader) this.f75003a.get(), this.f75004b.get(), this.f75005c.get(), this.f75006d.get(), this.f75007e.get());
    }
}
