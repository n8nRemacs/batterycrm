package com.avito.android.service_booking_calendar.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarViewModule_ProvideSimpleAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275488a;

    public g(u uVar) {
        this.f275488a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f275488a.get();
        c.f275482a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
