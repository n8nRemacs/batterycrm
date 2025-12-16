package com.avito.android.str_calendar.seller.calendar.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_calendar.seller.calendar.mvi.entity.StrSellerCalendarState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f287762a;

    /* renamed from: b, reason: collision with root package name */
    public final e f287763b;

    /* renamed from: c, reason: collision with root package name */
    public final l f287764c;

    /* renamed from: d, reason: collision with root package name */
    public final n f287765d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f287766e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f287762a = gVar;
        this.f287763b = eVar;
        this.f287764c = lVar;
        this.f287765d = nVar;
        this.f287766e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f287762a.get();
        d dVar = (d) this.f287763b.get();
        this.f287764c.getClass();
        k kVar = new k();
        m mVar = (m) this.f287765d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f287766e.get();
        StrSellerCalendarState.f287713m.getClass();
        return new i("StrSellerCalendar", StrSellerCalendarState.f287714n, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
