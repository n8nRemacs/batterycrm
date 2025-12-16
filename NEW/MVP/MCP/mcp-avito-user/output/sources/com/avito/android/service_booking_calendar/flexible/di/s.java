package com.avito.android.service_booking_calendar.flexible.di;

import Cd.D;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: FlexibleCalendarModule_ProvideViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<com.avito.android.service_booking_calendar.flexible.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f275822a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f275823b;

    public s(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f275822a = lVar;
        this.f275823b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f275822a.f393949a;
        D d12 = (D) this.f275823b.get();
        r.f275821a.getClass();
        return (com.avito.android.service_booking_calendar.flexible.a) new P0(t02, d12).a(com.avito.android.service_booking_calendar.flexible.b.class);
    }
}
