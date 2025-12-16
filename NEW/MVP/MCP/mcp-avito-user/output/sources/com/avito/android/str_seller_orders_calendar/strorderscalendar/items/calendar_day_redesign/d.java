package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarDayRedesignItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f290845a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290846b;

    public d(j jVar, u uVar) {
        this.f290845a = jVar;
        this.f290846b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f290845a.get(), (a) this.f290846b.get());
    }
}
