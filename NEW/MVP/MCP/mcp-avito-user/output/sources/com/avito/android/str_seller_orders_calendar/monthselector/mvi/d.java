package com.avito.android.str_seller_orders_calendar.monthselector.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MonthSelectorBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f290447a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_seller_orders_calendar.monthselector.c f290448b;

    public d(l lVar, com.avito.android.str_seller_orders_calendar.monthselector.c cVar) {
        this.f290447a = lVar;
        this.f290448b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f290447a.f393949a, (com.avito.android.str_seller_orders_calendar.monthselector.b) this.f290448b.get());
    }
}
