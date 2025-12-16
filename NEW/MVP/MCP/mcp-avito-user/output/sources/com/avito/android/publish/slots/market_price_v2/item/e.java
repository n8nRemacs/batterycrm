package com.avito.android.publish.slots.market_price_v2.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MarketPriceV2Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f244572a;

    public e(Provider<k> provider) {
        this.f244572a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f244572a.get());
    }
}
