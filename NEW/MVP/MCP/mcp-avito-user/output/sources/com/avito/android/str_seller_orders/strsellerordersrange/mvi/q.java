package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersRangeViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f290321a;

    public q(Provider<J0> provider) {
        this.f290321a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f290321a.get());
    }
}
