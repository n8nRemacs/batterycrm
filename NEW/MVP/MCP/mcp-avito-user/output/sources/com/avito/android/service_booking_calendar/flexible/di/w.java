package com.avito.android.service_booking_calendar.flexible.di;

import javax.inject.Provider;

/* compiled from: FlexibleCalendarToolbarModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class w implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f275827a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f275828b;

    public w(dagger.internal.u uVar, Provider provider) {
        this.f275827a = uVar;
        this.f275828b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f275827a.get();
        com.avito.konveyor.a aVar2 = this.f275828b.get();
        t.f275824a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
