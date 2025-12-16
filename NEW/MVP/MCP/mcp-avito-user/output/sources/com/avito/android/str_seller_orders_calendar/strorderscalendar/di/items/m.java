package com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarDatesItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final j f290652a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f290653b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f290654c;

    public m(j jVar, dagger.internal.u uVar, Provider provider) {
        this.f290652a = jVar;
        this.f290653b = uVar;
        this.f290654c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f290653b.get();
        com.avito.konveyor.a aVar2 = this.f290654c.get();
        this.f290652a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
