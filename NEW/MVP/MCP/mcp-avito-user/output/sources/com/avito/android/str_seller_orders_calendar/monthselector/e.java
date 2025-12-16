package com.avito.android.str_seller_orders_calendar.monthselector;

import com.avito.android.str_seller_orders_calendar.monthselector.mvi.f;
import com.avito.android.str_seller_orders_calendar.monthselector.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MonthSelectorViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final g f290415a;

    public e(g gVar) {
        this.f290415a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f290415a.get(), null, 2, null);
    }
}
