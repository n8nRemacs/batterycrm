package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import javax.inject.Provider;

/* compiled from: StrBookingCalendarFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final C35088g f286495a;

    /* renamed from: b, reason: collision with root package name */
    public final C35086e f286496b;

    /* renamed from: c, reason: collision with root package name */
    public final A f286497c;

    /* renamed from: d, reason: collision with root package name */
    public final E f286498d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f286499e;

    public o(C35088g c35088g, C35086e c35086e, A a12, E e12, Provider provider) {
        this.f286495a = c35088g;
        this.f286496b = c35086e;
        this.f286497c = a12;
        this.f286498d = e12;
        this.f286499e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35087f c35087f = (C35087f) this.f286495a.get();
        C35082a c35082a = (C35082a) this.f286496b.get();
        this.f286497c.getClass();
        z zVar = new z();
        D d12 = (D) this.f286498d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f286499e.get();
        StrBookingCalendarState.f286422r.getClass();
        return new n("StrBookingCalendar", StrBookingCalendarState.f286423s, new m(c35087f, c35082a, screenPerformanceTracker, d12, zVar));
    }
}
