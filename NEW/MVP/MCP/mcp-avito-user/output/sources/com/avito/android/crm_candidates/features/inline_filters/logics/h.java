package com.avito.android.crm_candidates.features.inline_filters.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmInlineFiltersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f129653a;

    /* renamed from: b, reason: collision with root package name */
    public final c f129654b;

    /* renamed from: c, reason: collision with root package name */
    public final l f129655c;

    /* renamed from: d, reason: collision with root package name */
    public final o f129656d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f129657e;

    public h(e eVar, c cVar, l lVar, o oVar, Provider provider) {
        this.f129653a = eVar;
        this.f129654b = cVar;
        this.f129655c = lVar;
        this.f129656d = oVar;
        this.f129657e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f129653a.get();
        b bVar = (b) this.f129654b.get();
        k kVar = (k) this.f129655c.get();
        this.f129656d.getClass();
        m mVar = new m();
        return new g("JobCrmInlineFilters", new Ts.c(null, 1, null), new f(dVar, bVar, this.f129657e.get(), mVar, kVar));
    }
}
