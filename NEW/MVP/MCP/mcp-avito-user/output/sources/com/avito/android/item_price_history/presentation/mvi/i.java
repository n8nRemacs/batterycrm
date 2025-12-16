package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemPriceHistoryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final AO.b f173832a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f173833b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC30570d> f173834c;

    public i(AO.b bVar, Provider provider, Provider provider2) {
        this.f173832a = bVar;
        this.f173833b = provider;
        this.f173834c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((AO.a) this.f173832a.get(), this.f173833b.get(), this.f173834c.get());
    }
}
