package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final v f291182a;

    /* renamed from: b, reason: collision with root package name */
    public final r f291183b;

    /* renamed from: c, reason: collision with root package name */
    public final A f291184c;

    /* renamed from: d, reason: collision with root package name */
    public final C f291185d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f291186e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f291187f;

    public y(v vVar, r rVar, A a12, C c12, Provider provider, Provider provider2) {
        this.f291182a = vVar;
        this.f291183b = rVar;
        this.f291184c = a12;
        this.f291185d = c12;
        this.f291186e = provider;
        this.f291187f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) this.f291182a.get();
        C35130a c35130a = (C35130a) this.f291183b.get();
        this.f291184c.getClass();
        z zVar = new z();
        B b12 = (B) this.f291185d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f291186e.get();
        R0 r02 = this.f291187f.get();
        StrOrdersCalendarState.f291041r.getClass();
        return new x("StrSellerOrdersCalendar", StrOrdersCalendarState.f291042s, new w(uVar, c35130a, screenPerformanceTracker, b12, zVar, r02));
    }
}
