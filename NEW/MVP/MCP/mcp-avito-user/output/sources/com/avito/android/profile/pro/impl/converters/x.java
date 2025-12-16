package com.avito.android.profile.pro.impl.converters;

/* compiled from: ProfileProOrdersConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.active_orders_common.items.order.e f222483a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.active_orders_common.items.all_orders.e f222484b;

    public x(com.avito.android.active_orders_common.items.order.e eVar, com.avito.android.active_orders_common.items.all_orders.e eVar2) {
        this.f222483a = eVar;
        this.f222484b = eVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f222483a.getClass();
        com.avito.android.active_orders_common.items.order.d dVar = new com.avito.android.active_orders_common.items.order.d();
        this.f222484b.getClass();
        return new w(dVar, new com.avito.android.active_orders_common.items.all_orders.d());
    }
}
