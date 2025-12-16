package com.avito.android.service_orders.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: ServiceOrdersToolbarActionsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class x implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_orders.list.toolbar.b f279169a;

    public x(com.avito.android.service_orders.list.toolbar.b bVar) {
        this.f279169a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_orders.list.toolbar.a aVar = (com.avito.android.service_orders.list.toolbar.a) this.f279169a.get();
        v.f279167a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
