package com.avito.android.str_seller_orders.strsellerorders.mvi.items.order;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f290013a;

    public b(Provider<c> provider) {
        this.f290013a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f290013a.get());
    }
}
