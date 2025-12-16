package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.y;

/* compiled from: StrCalendarParametersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final j f287439a;

    /* renamed from: b, reason: collision with root package name */
    public final h f287440b;

    /* renamed from: c, reason: collision with root package name */
    public final s f287441c;

    /* renamed from: d, reason: collision with root package name */
    public final u f287442d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f287443e;

    public q(j jVar, h hVar, s sVar, u uVar, dagger.internal.u uVar2) {
        this.f287439a = jVar;
        this.f287440b = hVar;
        this.f287441c = sVar;
        this.f287442d = uVar;
        this.f287443e = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f287439a.get();
        a aVar = (a) this.f287440b.get();
        r rVar = (r) this.f287441c.get();
        t tVar = (t) this.f287442d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f287443e.get();
        Gy0.e.f6873v.getClass();
        return new p("CalendarParameters", Gy0.e.f6874w, new o(iVar, aVar, screenPerformanceTracker, tVar, rVar));
    }
}
