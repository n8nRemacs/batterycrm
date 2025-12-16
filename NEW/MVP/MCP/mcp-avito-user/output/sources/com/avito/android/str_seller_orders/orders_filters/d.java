package com.avito.android.str_seller_orders.orders_filters;

import com.avito.android.str_seller_orders.orders_filters.mvi.g;
import com.avito.android.str_seller_orders.orders_filters.mvi.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersFiltersViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final i f289128a;

    public d(i iVar) {
        this.f289128a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f289128a.get(), null, 2, null);
    }
}
