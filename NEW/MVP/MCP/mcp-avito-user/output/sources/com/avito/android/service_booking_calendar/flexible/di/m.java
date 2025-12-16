package com.avito.android.service_booking_calendar.flexible.di;

import androidx.recyclerview.widget.C;
import javax.inject.Provider;

/* compiled from: FlexibleCalendarHeaderModule_ProvideWeekAdapterPresenter$_avito_service_booking_calendar_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f275813a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f275814b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f275815c;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f275813a = provider;
        this.f275814b = provider2;
        this.f275815c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f275813a);
        com.avito.konveyor.adapter.h hVar = this.f275814b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f275815c.get();
        e.f275798a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
