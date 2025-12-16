package com.avito.android.orders_aggregation.di.module;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.orders_aggregation.r;
import com.avito.android.orders_aggregation.s;
import com.avito.android.orders_aggregation.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrdersAggregationModule_ProvideViewModel$_avito_orders_aggregation_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<T0> f210257a;

    /* renamed from: b, reason: collision with root package name */
    public final s f210258b;

    public l(Provider provider, s sVar) {
        this.f210257a = provider;
        this.f210258b = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = this.f210257a.get();
        r rVar = (r) this.f210258b.get();
        g.f210251a.getClass();
        return (t) new P0(t02, rVar).a(t.class);
    }
}
