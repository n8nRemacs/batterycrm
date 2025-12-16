package com.avito.android.advert_details_items.optimal_price;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsOptimalPricePresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f84989a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f84989a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f84989a.get());
    }
}
