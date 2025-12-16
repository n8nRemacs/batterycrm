package com.avito.android.service_booking_calendar.flexible.header.recycler.month;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BorderWeekOfMonthItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> f276060a;

    public b(Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> provider) {
        this.f276060a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f276060a.get());
    }
}
