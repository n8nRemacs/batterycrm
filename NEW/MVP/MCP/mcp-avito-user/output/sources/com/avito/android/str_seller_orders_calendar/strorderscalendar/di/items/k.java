package com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersCalendarDatesItemsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f290648a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f290649b;

    public k(j jVar, dagger.internal.u uVar) {
        this.f290648a = jVar;
        this.f290649b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f290649b.get();
        this.f290648a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
