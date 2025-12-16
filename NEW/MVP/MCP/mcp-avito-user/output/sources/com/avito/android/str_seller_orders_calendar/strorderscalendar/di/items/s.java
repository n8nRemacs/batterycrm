package com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersCalendarMainItemsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final r f290662a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f290663b;

    public s(r rVar, dagger.internal.u uVar) {
        this.f290662a = rVar;
        this.f290663b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f290663b.get();
        this.f290662a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
