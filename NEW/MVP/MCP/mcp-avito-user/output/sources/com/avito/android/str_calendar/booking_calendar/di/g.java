package com.avito.android.str_calendar.booking_calendar.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingCalendarItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f286273a;

    /* renamed from: b, reason: collision with root package name */
    public final u f286274b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f286275c;

    public g(d dVar, u uVar, Provider provider) {
        this.f286273a = dVar;
        this.f286274b = uVar;
        this.f286275c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f286274b.get();
        com.avito.konveyor.a aVar2 = this.f286275c.get();
        this.f286273a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
