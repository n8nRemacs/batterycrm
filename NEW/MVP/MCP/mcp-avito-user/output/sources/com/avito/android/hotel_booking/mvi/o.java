package com.avito.android.hotel_booking.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingState;
import javax.inject.Provider;

/* compiled from: HotelBookingFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f163931a;

    /* renamed from: b, reason: collision with root package name */
    public final i f163932b;

    /* renamed from: c, reason: collision with root package name */
    public final x f163933c;

    /* renamed from: d, reason: collision with root package name */
    public final z f163934d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f163935e;

    public o(k kVar, i iVar, x xVar, z zVar, Provider provider) {
        this.f163931a = kVar;
        this.f163932b = iVar;
        this.f163933c = xVar;
        this.f163934d = zVar;
        this.f163935e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f163931a.get();
        g gVar = (g) this.f163932b.get();
        this.f163933c.getClass();
        w wVar = new w();
        y yVar = (y) this.f163934d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f163935e.get();
        HotelBookingState.f163866o.getClass();
        return new m(HotelBookingScreen.f163820d.f90471b, HotelBookingState.f163867p, new l(jVar, gVar, screenPerformanceTracker, yVar, wVar));
    }
}
