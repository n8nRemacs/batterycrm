package com.avito.android.service_booking_calendar.flexible.di;

import androidx.recyclerview.widget.C;
import javax.inject.Provider;

/* compiled from: FlexibleCalendarHeaderModule_ProvideMonthAdapterPresenter$_avito_service_booking_calendar_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f275801a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f275802b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.e> f275803c;

    public g(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f275801a = provider;
        this.f275802b = uVar;
        this.f275803c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f275801a);
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f275802b.get();
        com.avito.android.recycler.data_aware.e eVar = this.f275803c.get();
        e.f275798a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
