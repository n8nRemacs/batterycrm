package com.avito.android.service_booking_calendar.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: CalendarViewModule_ProvidePresenterSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.view.day.e> f275486a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.view.month.e> f275487b;

    public f(Provider<com.avito.android.service_booking_calendar.view.day.e> provider, Provider<com.avito.android.service_booking_calendar.view.month.e> provider2) {
        this.f275486a = provider;
        this.f275487b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_booking_calendar.view.day.e eVar = this.f275486a.get();
        com.avito.android.service_booking_calendar.view.month.e eVar2 = this.f275487b.get();
        c.f275482a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{eVar, eVar2});
        t.d(setL0);
        return setL0;
    }
}
