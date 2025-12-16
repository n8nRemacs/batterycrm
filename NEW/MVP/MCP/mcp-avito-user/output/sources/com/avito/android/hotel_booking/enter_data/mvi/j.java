package com.avito.android.hotel_booking.enter_data.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EnterDataFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f163582a;

    /* renamed from: b, reason: collision with root package name */
    public final d f163583b;

    /* renamed from: c, reason: collision with root package name */
    public final l f163584c;

    /* renamed from: d, reason: collision with root package name */
    public final o f163585d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f163586e;

    public j(f fVar, d dVar, l lVar, o oVar, Provider provider) {
        this.f163582a = fVar;
        this.f163583b = dVar;
        this.f163584c = lVar;
        this.f163585d = oVar;
        this.f163586e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f163582a.get();
        c cVar = (c) this.f163583b.get();
        this.f163584c.getClass();
        k kVar = new k();
        m mVar = (m) this.f163585d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f163586e.get();
        QI.c.f13663g.getClass();
        return new h(HotelBookingEnterDataScreen.f163541d.f90471b, QI.c.f13664h, new g(eVar, cVar, screenPerformanceTracker, mVar, kVar));
    }
}
