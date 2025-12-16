package com.avito.android.str_seller_orders.orders_filters.mvi;

import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersFiltersBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f289190a;

    public e(dagger.internal.l lVar) {
        this.f289190a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((StrOrdersFiltersOpenParams) this.f289190a.f393949a);
    }
}
