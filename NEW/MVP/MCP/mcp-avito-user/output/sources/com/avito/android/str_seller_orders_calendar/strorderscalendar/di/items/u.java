package com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarMainItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final r f290666a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f290667b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f290668c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.b f290669d;

    public u(r rVar, dagger.internal.u uVar, Provider provider, com.avito.android.str_seller_orders_calendar.strorderscalendar.b bVar) {
        this.f290666a = rVar;
        this.f290667b = uVar;
        this.f290668c = provider;
        this.f290669d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f290667b.get();
        com.avito.konveyor.a aVar2 = this.f290668c.get();
        this.f290669d.getClass();
        com.avito.android.str_seller_orders_calendar.strorderscalendar.a aVar3 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.a();
        this.f290666a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
