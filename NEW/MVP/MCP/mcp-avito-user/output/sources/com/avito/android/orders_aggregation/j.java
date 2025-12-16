package com.avito.android.orders_aggregation;

import android.content.SharedPreferences;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrdersAggregationTabShownStatusStorageImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f210264a;

    public j(Provider<SharedPreferences> provider) {
        this.f210264a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f210264a.get());
    }
}
