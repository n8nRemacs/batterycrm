package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f290065a;

    public u(Provider<J0> provider) {
        this.f290065a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f290065a.get());
    }
}
