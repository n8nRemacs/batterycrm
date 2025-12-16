package com.avito.android.crm_candidates.features.applications_list.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmApplicationsListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f129531a;

    /* renamed from: b, reason: collision with root package name */
    public final c f129532b;

    /* renamed from: c, reason: collision with root package name */
    public final n f129533c;

    /* renamed from: d, reason: collision with root package name */
    public final q f129534d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f129535e;

    public h(e eVar, c cVar, n nVar, q qVar, Provider provider) {
        this.f129531a = eVar;
        this.f129532b = cVar;
        this.f129533c = nVar;
        this.f129534d = qVar;
        this.f129535e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f129531a.get();
        a aVar = (a) this.f129532b.get();
        this.f129533c.getClass();
        m mVar = new m();
        this.f129534d.getClass();
        o oVar = new o();
        return new g("JobCrmApplicationsList", new JobCrmApplicationsListState(null, false, false, false, null, 31, null), new f(dVar, aVar, this.f129535e.get(), oVar, mVar));
    }
}
