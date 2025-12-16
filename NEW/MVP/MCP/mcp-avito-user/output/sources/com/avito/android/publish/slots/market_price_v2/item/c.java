package com.avito.android.publish.slots.market_price_v2.item;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MarketPriceItemEventTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f244568a;

    public c(u uVar) {
        this.f244568a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f244568a.get());
    }
}
