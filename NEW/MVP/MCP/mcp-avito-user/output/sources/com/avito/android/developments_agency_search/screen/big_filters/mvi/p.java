package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ww.C49692c;

/* compiled from: BigFiltersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final m f136747a;

    /* renamed from: b, reason: collision with root package name */
    public final k f136748b;

    /* renamed from: c, reason: collision with root package name */
    public final r f136749c;

    /* renamed from: d, reason: collision with root package name */
    public final t f136750d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f136751e;

    public p(m mVar, k kVar, r rVar, t tVar, Provider provider) {
        this.f136747a = mVar;
        this.f136748b = kVar;
        this.f136749c = rVar;
        this.f136750d = tVar;
        this.f136751e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f136747a.get();
        j jVar = (j) this.f136748b.get();
        this.f136749c.getClass();
        q qVar = new q();
        s sVar = (s) this.f136750d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f136751e.get();
        C49692c.f441874i.getClass();
        return new o("RealtyAgencySearchParameters", C49692c.f441875j, new n(lVar, jVar, screenPerformanceTracker, sVar, qVar));
    }
}
