package com.avito.android.publish.slots.market_price_v2.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MarketPriceV2PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f244586a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244587b;

    /* renamed from: c, reason: collision with root package name */
    public final u f244588c;

    public o(u uVar, u uVar2, Provider provider) {
        this.f244586a = provider;
        this.f244587b = uVar;
        this.f244588c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f244586a.get(), (com.avito.android.util.text.a) this.f244587b.get(), (a) this.f244588c.get());
    }
}
