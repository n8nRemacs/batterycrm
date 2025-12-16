package com.avito.android.active_orders_common.items.order;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f68384a;

    public i(u uVar) {
        this.f68384a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((j) this.f68384a.get());
    }
}
