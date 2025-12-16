package com.avito.android.advert.item.services_price;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesPriceItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f79964a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f79964a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f79964a.get());
    }
}
