package com.avito.android.advert.item.fmp.calculator;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsFmpCalculatorPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75499a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f75500b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f75501c;

    public i(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.deep_linking.x> provider2, Provider<InterfaceC28373a> provider3) {
        this.f75499a = provider;
        this.f75500b = provider2;
        this.f75501c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f75499a.get();
        return new h(this.f75501c.get(), this.f75500b.get(), aVar);
    }
}
