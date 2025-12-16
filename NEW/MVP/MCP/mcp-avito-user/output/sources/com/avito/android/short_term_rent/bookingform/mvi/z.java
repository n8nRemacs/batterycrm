package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import cw0.C39425b;
import javax.inject.Provider;

/* compiled from: BookingFormFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final u f282023a;

    /* renamed from: b, reason: collision with root package name */
    public final s f282024b;

    /* renamed from: c, reason: collision with root package name */
    public final B f282025c;

    /* renamed from: d, reason: collision with root package name */
    public final D f282026d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f282027e;

    public z(u uVar, s sVar, B b12, D d12, Provider provider) {
        this.f282023a = uVar;
        this.f282024b = sVar;
        this.f282025c = b12;
        this.f282026d = d12;
        this.f282027e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t tVar = (t) this.f282023a.get();
        C34968a c34968a = (C34968a) this.f282024b.get();
        this.f282025c.getClass();
        A a12 = new A();
        C c12 = (C) this.f282026d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f282027e.get();
        C39425b.f393064h.getClass();
        return new y("BookingForm", C39425b.f393065i, new x(tVar, c34968a, screenPerformanceTracker, c12, a12));
    }
}
