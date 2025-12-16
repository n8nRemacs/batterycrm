package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RegionSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f128451a;

    /* renamed from: b, reason: collision with root package name */
    public final f f128452b;

    /* renamed from: c, reason: collision with root package name */
    public final m f128453c;

    /* renamed from: d, reason: collision with root package name */
    public final p f128454d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f128455e;

    public k(h hVar, f fVar, m mVar, p pVar, Provider provider) {
        this.f128451a = hVar;
        this.f128452b = fVar;
        this.f128453c = mVar;
        this.f128454d = pVar;
        this.f128455e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f128451a.get();
        a aVar = (a) this.f128452b.get();
        this.f128453c.getClass();
        l lVar = new l();
        this.f128454d.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f128455e.get();
        RegionSheetState.f128389h.getClass();
        return new j("CpxPromoGeoRegionSheet", RegionSheetState.f128390i, new i(gVar, aVar, screenPerformanceTracker, nVar, lVar));
    }
}
