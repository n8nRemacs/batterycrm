package com.avito.android.service_booking_calendar.flexible.header.recycler.month;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LastWeekOfMonthItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> f276068a;

    public f(Provider<com.avito.android.service_booking_calendar.flexible.header.recycler.f> provider) {
        this.f276068a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f276068a.get());
    }
}
