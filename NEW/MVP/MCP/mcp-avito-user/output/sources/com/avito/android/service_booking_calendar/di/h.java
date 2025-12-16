package com.avito.android.service_booking_calendar.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarViewModule_ProvideSimpleRecyclerPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275489a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f275490b;

    public h(u uVar, Provider provider) {
        this.f275489a = uVar;
        this.f275490b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f275489a.get();
        com.avito.konveyor.a aVar2 = this.f275490b.get();
        c.f275482a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
