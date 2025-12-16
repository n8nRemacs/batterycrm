package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemPriceHistoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final AO.b f173792a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.favorite.m f173793b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f173794c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f173795d;

    public e(AO.b bVar, com.avito.android.favorite.m mVar, Provider provider, dagger.internal.l lVar) {
        this.f173792a = bVar;
        this.f173793b = mVar;
        this.f173794c = provider;
        this.f173795d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((AO.a) this.f173792a.get(), (com.avito.android.favorite.h) this.f173793b.get(), this.f173794c.get(), (ItemPriceHistoryInitialData) this.f173795d.f393949a);
    }
}
