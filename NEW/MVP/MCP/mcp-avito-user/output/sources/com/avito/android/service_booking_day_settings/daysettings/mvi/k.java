package com.avito.android.service_booking_day_settings.daysettings.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DaySettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f277055a;

    /* renamed from: b, reason: collision with root package name */
    public final f f277056b;

    /* renamed from: c, reason: collision with root package name */
    public final m f277057c;

    /* renamed from: d, reason: collision with root package name */
    public final o f277058d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f277059e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f277055a = hVar;
        this.f277056b = fVar;
        this.f277057c = mVar;
        this.f277058d = oVar;
        this.f277059e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f277055a.get();
        d dVar = (d) this.f277056b.get();
        this.f277057c.getClass();
        l lVar = new l();
        n nVar = (n) this.f277058d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f277059e.get();
        DaySettingsState.f276963j.getClass();
        return new j("DaySettings", DaySettingsState.f276964k, new i(gVar, dVar, screenPerformanceTracker, nVar, lVar));
    }
}
