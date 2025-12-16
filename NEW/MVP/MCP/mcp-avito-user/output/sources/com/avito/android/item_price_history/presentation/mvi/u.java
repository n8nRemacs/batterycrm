package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemPriceHistoryViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f173852a;

    public u(dagger.internal.l lVar) {
        this.f173852a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t((ItemPriceHistoryInitialData) this.f173852a.f393949a);
    }
}
