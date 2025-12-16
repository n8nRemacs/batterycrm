package com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarFlatInfoItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final n f290659a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f290660b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f290661c;

    public q(n nVar, dagger.internal.u uVar, Provider provider) {
        this.f290659a = nVar;
        this.f290660b = uVar;
        this.f290661c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f290660b.get();
        com.avito.konveyor.a aVar2 = this.f290661c.get();
        this.f290659a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
