package com.avito.android.service_booking_calendar.flexible.header.recycler.month;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WeekOfMonthItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> f276072a;

    public h(Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> provider) {
        this.f276072a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f276072a.get());
    }
}
