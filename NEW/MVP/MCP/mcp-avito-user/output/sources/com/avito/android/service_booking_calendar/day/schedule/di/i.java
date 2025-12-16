package com.avito.android.service_booking_calendar.day.schedule.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DayScheduleModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275350a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f275351b;

    public i(u uVar, Provider provider) {
        this.f275350a = uVar;
        this.f275351b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f275350a.get();
        com.avito.konveyor.a aVar = this.f275351b.get();
        c.f275338a.getClass();
        return new com.avito.konveyor.adapter.j(hVar, aVar);
    }
}
