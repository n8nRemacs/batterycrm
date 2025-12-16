package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScheduleRepetitionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f277737a;

    /* renamed from: b, reason: collision with root package name */
    public final f f277738b;

    /* renamed from: c, reason: collision with root package name */
    public final m f277739c;

    /* renamed from: d, reason: collision with root package name */
    public final o f277740d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f277741e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f277737a = hVar;
        this.f277738b = fVar;
        this.f277739c = mVar;
        this.f277740d = oVar;
        this.f277741e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f277737a.get();
        d dVar = (d) this.f277738b.get();
        this.f277739c.getClass();
        l lVar = new l();
        n nVar = (n) this.f277740d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f277741e.get();
        ScheduleRepetitionState.f277707g.getClass();
        return new j("ScheduleRepetition", ScheduleRepetitionState.f277708h, new i(gVar, dVar, screenPerformanceTracker, nVar, lVar));
    }
}
