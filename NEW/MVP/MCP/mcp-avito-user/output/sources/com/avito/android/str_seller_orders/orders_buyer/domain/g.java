package com.avito.android.str_seller_orders.orders_buyer.domain;

import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadBuyerOrdersUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f288987a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f288988b;

    public g(Provider<d1> provider, Provider<R0> provider2) {
        this.f288987a = provider;
        this.f288988b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f288987a.get(), this.f288988b.get());
    }
}
