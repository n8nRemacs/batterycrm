package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: StrSoftBookingFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final v f282870a;

    /* renamed from: b, reason: collision with root package name */
    public final t f282871b;

    /* renamed from: c, reason: collision with root package name */
    public final A f282872c;

    /* renamed from: d, reason: collision with root package name */
    public final C f282873d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f282874e;

    public y(v vVar, t tVar, A a12, C c12, Provider provider) {
        this.f282870a = vVar;
        this.f282871b = tVar;
        this.f282872c = a12;
        this.f282873d = c12;
        this.f282874e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) this.f282870a.get();
        C34981a c34981a = (C34981a) this.f282871b.get();
        this.f282872c.getClass();
        z zVar = new z();
        B b12 = (B) this.f282873d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f282874e.get();
        com.avito.android.short_term_rent.soft_booking.mvi.state.a.f282791s.getClass();
        return new x("StrSoftBooking", com.avito.android.short_term_rent.soft_booking.mvi.state.a.f282792t, new w(uVar, c34981a, screenPerformanceTracker, b12, zVar));
    }
}
