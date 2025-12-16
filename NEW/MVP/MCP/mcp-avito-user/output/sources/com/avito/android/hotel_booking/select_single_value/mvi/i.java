package com.avito.android.hotel_booking.select_single_value.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectSingleValueFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f164117a;

    /* renamed from: b, reason: collision with root package name */
    public final c f164118b;

    /* renamed from: c, reason: collision with root package name */
    public final k f164119c;

    /* renamed from: d, reason: collision with root package name */
    public final n f164120d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f164121e;

    public i(e eVar, c cVar, k kVar, n nVar, Provider provider) {
        this.f164117a = eVar;
        this.f164118b = cVar;
        this.f164119c = kVar;
        this.f164120d = nVar;
        this.f164121e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f164117a.get();
        b bVar = (b) this.f164118b.get();
        this.f164119c.getClass();
        j jVar = new j();
        this.f164120d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f164121e.get();
        VI.c.f17054h.getClass();
        return new g(HotelBookingSelectSingleValueScreen.f164094d.f90471b, VI.c.f17055i, new f(dVar, bVar, screenPerformanceTracker, lVar, jVar));
    }
}
