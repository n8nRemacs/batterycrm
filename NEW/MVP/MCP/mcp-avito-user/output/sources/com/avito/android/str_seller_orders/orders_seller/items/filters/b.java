package com.avito.android.str_seller_orders.orders_seller.items.filters;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f289451a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.d> f289452b;

    public b(e eVar, Provider provider) {
        this.f289451a = eVar;
        this.f289452b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f289451a.getClass();
        return new a(new d(), this.f289452b.get());
    }
}
