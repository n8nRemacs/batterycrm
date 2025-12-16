package com.avito.android.profile.user_profile.cards.active_orders;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActiveOrdersItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224669a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.active_orders_common.items.order.e f224670b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.active_orders_common.items.all_orders.e f224671c;

    public m(u uVar, com.avito.android.active_orders_common.items.order.e eVar, com.avito.android.active_orders_common.items.all_orders.e eVar2) {
        this.f224669a = uVar;
        this.f224670b = eVar;
        this.f224671c = eVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f224669a.get();
        this.f224670b.getClass();
        com.avito.android.active_orders_common.items.order.d dVar = new com.avito.android.active_orders_common.items.order.d();
        this.f224671c.getClass();
        return new l(nVar, dVar, new com.avito.android.active_orders_common.items.all_orders.d());
    }
}
