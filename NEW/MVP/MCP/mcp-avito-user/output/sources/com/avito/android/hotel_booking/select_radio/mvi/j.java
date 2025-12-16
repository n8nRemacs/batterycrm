package com.avito.android.hotel_booking.select_radio.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectRadioFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f164046a;

    /* renamed from: b, reason: collision with root package name */
    public final d f164047b;

    /* renamed from: c, reason: collision with root package name */
    public final l f164048c;

    /* renamed from: d, reason: collision with root package name */
    public final o f164049d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f164050e;

    public j(f fVar, d dVar, l lVar, o oVar, Provider provider) {
        this.f164046a = fVar;
        this.f164047b = dVar;
        this.f164048c = lVar;
        this.f164049d = oVar;
        this.f164050e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f164046a.get();
        c cVar = (c) this.f164047b.get();
        this.f164048c.getClass();
        k kVar = new k();
        this.f164049d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f164050e.get();
        TI.c.f15519h.getClass();
        return new h(HotelBookingSelectRadioScreen.f164018d.f90471b, TI.c.f15520i, new g(eVar, cVar, screenPerformanceTracker, mVar, kVar));
    }
}
