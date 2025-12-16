package com.avito.android.orders_aggregation;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.y;

/* compiled from: OrdersAggregationIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final O f210208a;

    public d(O o12) {
        this.f210208a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((L) this.f210208a.get());
    }
}
