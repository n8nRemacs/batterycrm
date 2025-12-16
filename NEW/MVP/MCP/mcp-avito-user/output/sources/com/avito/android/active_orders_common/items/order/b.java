package com.avito.android.active_orders_common.items.order;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f68376a;

    public b(u uVar) {
        this.f68376a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f68376a.get());
    }
}
