package com.avito.android.item_price_history.data;

import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemPriceHistoryRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<CO.a> f173653a;

    /* renamed from: b, reason: collision with root package name */
    public final b f173654b;

    /* renamed from: c, reason: collision with root package name */
    public final l f173655c;

    public e(Provider provider, b bVar, l lVar) {
        this.f173653a = provider;
        this.f173654b = bVar;
        this.f173655c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = g.b(this.f173653a);
        this.f173654b.getClass();
        return new c(eVarB, new a(), (ItemPriceHistoryInitialData) this.f173655c.f393949a);
    }
}
