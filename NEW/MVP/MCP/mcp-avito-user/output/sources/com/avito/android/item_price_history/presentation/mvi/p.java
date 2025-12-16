package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemPriceHistoryReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f173848a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f173849b;

    public p(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f173848a = uVar;
        this.f173849b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((s) this.f173848a.get(), (ItemPriceHistoryInitialData) this.f173849b.f393949a);
    }
}
