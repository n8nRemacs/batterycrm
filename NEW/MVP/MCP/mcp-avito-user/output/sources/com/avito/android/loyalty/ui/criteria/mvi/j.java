package com.avito.android.loyalty.ui.criteria.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import iX.AbstractC41357c;
import javax.inject.Provider;

/* compiled from: CriteriaFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f183555a;

    /* renamed from: b, reason: collision with root package name */
    public final e f183556b;

    /* renamed from: c, reason: collision with root package name */
    public final n f183557c;

    /* renamed from: d, reason: collision with root package name */
    public final l f183558d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f183559e;

    public j(g gVar, e eVar, n nVar, l lVar, Provider provider) {
        this.f183555a = gVar;
        this.f183556b = eVar;
        this.f183557c = nVar;
        this.f183558d = lVar;
        this.f183559e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f183555a.get();
        d dVar = (d) this.f183556b.get();
        this.f183557c.getClass();
        m mVar = new m();
        this.f183558d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f183559e.get();
        AbstractC41357c.f398541b.getClass();
        return new i("Criteria", AbstractC41357c.f398542c, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
