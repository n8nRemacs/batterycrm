package com.avito.android.str_seller_orders.orders_buyer.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersBuyerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f289080a;

    public e(u uVar) {
        this.f289080a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.str_seller_orders.orders_buyer.domain.a) this.f289080a.get());
    }
}
