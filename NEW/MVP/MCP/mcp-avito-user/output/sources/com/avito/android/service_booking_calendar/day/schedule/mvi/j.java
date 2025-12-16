package com.avito.android.service_booking_calendar.day.schedule.mvi;

import bt0.C25711c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DayScheduleFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f275409a;

    /* renamed from: b, reason: collision with root package name */
    public final b f275410b;

    /* renamed from: c, reason: collision with root package name */
    public final n f275411c;

    /* renamed from: d, reason: collision with root package name */
    public final p f275412d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f275413e;

    public j(g gVar, b bVar, n nVar, p pVar, Provider provider) {
        this.f275409a = gVar;
        this.f275410b = bVar;
        this.f275411c = nVar;
        this.f275412d = pVar;
        this.f275413e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f275409a.get();
        a aVar = (a) this.f275410b.get();
        this.f275411c.getClass();
        m mVar = new m();
        o oVar = (o) this.f275412d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f275413e.get();
        C25711c.f57523f.getClass();
        return new i("SBCalendarDaySchedule", C25711c.f57524g, new h(fVar, aVar, screenPerformanceTracker, oVar, mVar));
    }
}
