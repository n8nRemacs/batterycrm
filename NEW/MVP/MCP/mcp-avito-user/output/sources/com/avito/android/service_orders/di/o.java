package com.avito.android.service_orders.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: ServiceOrdersListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_orders.list.blueprints.title_item.b f279149a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_orders.list.blueprints.snippet_item.b f279150b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.service_orders.list.blueprints.calendar_button_item.b f279151c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.service_orders.list.blueprints.banner_item.b f279152d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.service_orders.list.blueprints.management_panels.b f279153e;

    public o(com.avito.android.service_orders.list.blueprints.title_item.b bVar, com.avito.android.service_orders.list.blueprints.snippet_item.b bVar2, com.avito.android.service_orders.list.blueprints.calendar_button_item.b bVar3, com.avito.android.service_orders.list.blueprints.banner_item.b bVar4, com.avito.android.service_orders.list.blueprints.management_panels.b bVar5) {
        this.f279149a = bVar;
        this.f279150b = bVar2;
        this.f279151c = bVar3;
        this.f279152d = bVar4;
        this.f279153e = bVar5;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_orders.list.blueprints.title_item.a aVar = (com.avito.android.service_orders.list.blueprints.title_item.a) this.f279149a.get();
        com.avito.android.service_orders.list.blueprints.snippet_item.a aVar2 = (com.avito.android.service_orders.list.blueprints.snippet_item.a) this.f279150b.get();
        com.avito.android.service_orders.list.blueprints.calendar_button_item.a aVar3 = (com.avito.android.service_orders.list.blueprints.calendar_button_item.a) this.f279151c.get();
        com.avito.android.service_orders.list.blueprints.banner_item.a aVar4 = (com.avito.android.service_orders.list.blueprints.banner_item.a) this.f279152d.get();
        com.avito.android.service_orders.list.blueprints.management_panels.a aVar5 = (com.avito.android.service_orders.list.blueprints.management_panels.a) this.f279153e.get();
        j.f279138a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        return c10493a.a();
    }
}
