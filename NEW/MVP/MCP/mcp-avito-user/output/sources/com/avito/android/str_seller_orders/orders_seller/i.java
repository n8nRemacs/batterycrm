package com.avito.android.str_seller_orders.orders_seller;

import com.avito.android.str_seller_orders.orders_seller.mvi.k;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: StrSellerOrdersViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final k f289380a;

    public i(k kVar) {
        this.f289380a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.str_seller_orders.orders_seller.mvi.i iVar = (com.avito.android.str_seller_orders.orders_seller.mvi.i) this.f289380a.get();
        i2.f411430a.getClass();
        return new h(iVar, i2.a.f411433c);
    }
}
