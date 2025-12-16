package com.avito.android.hotel_available_rooms.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelAvailableRoomsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f163153a;

    /* renamed from: b, reason: collision with root package name */
    public final d f163154b;

    /* renamed from: c, reason: collision with root package name */
    public final q f163155c;

    /* renamed from: d, reason: collision with root package name */
    public final t f163156d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f163157e;

    public j(f fVar, d dVar, q qVar, t tVar, Provider provider) {
        this.f163153a = fVar;
        this.f163154b = dVar;
        this.f163155c = qVar;
        this.f163156d = tVar;
        this.f163157e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f163153a.get();
        b bVar = (b) this.f163154b.get();
        this.f163155c.getClass();
        p pVar = new p();
        r rVar = (r) this.f163156d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f163157e.get();
        HotelAvailableRoomsState.f163119l.getClass();
        return new h(HotelAvailableRoomsScreen.f163086d.f90471b, HotelAvailableRoomsState.f163120m, new g(eVar, bVar, screenPerformanceTracker, rVar, pVar));
    }
}
