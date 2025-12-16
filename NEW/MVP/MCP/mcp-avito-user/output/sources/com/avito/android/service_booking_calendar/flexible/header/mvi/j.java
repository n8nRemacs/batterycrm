package com.avito.android.service_booking_calendar.flexible.header.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarHeaderFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f276038a;

    /* renamed from: b, reason: collision with root package name */
    public final l f276039b;

    /* renamed from: c, reason: collision with root package name */
    public final n f276040c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f276041d;

    public j(g gVar, l lVar, n nVar, Provider provider) {
        this.f276038a = gVar;
        this.f276039b = lVar;
        this.f276040c = nVar;
        this.f276041d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f276038a.get();
        this.f276039b.getClass();
        k kVar = new k();
        this.f276040c.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f276041d.get();
        CalendarHeaderState.f276003r.getClass();
        return new i("ServiceBookingFlexibleScheduleHeader", CalendarHeaderState.f276004s, new h(fVar, screenPerformanceTracker, mVar, kVar));
    }
}
