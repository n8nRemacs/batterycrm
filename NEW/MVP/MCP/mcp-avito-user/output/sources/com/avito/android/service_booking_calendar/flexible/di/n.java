package com.avito.android.service_booking_calendar.flexible.di;

import javax.inject.Provider;

/* compiled from: FlexibleCalendarHeaderModule_ProvideWeekAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f275816a;

    public n(Provider<com.avito.konveyor.a> provider) {
        this.f275816a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f275816a.get();
        e.f275798a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
