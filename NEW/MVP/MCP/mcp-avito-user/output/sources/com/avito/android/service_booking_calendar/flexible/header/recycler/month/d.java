package com.avito.android.service_booking_calendar.flexible.header.recycler.month;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FirstWeekOfMonthItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> f276064a;

    public d(Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> provider) {
        this.f276064a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f276064a.get());
    }
}
