package com.avito.android.str_seller_orders_calendar.monthselector.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MonthSelectorItemsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f290408a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290409b;

    public d(c cVar, u uVar) {
        this.f290408a = cVar;
        this.f290409b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f290409b.get();
        this.f290408a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
