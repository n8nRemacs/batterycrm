package com.avito.android.autoteka.presentation.report.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaReportFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f97746a;

    /* renamed from: b, reason: collision with root package name */
    public final e f97747b;

    /* renamed from: c, reason: collision with root package name */
    public final l f97748c;

    /* renamed from: d, reason: collision with root package name */
    public final u f97749d;

    /* renamed from: e, reason: collision with root package name */
    public final n f97750e;

    public j(g gVar, e eVar, l lVar, u uVar, n nVar) {
        this.f97746a = gVar;
        this.f97747b = eVar;
        this.f97748c = lVar;
        this.f97749d = uVar;
        this.f97750e = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f97746a.get();
        d dVar = (d) this.f97747b.get();
        k kVar = (k) this.f97748c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f97749d.get();
        this.f97750e.getClass();
        m mVar = new m();
        Pf.c.f13218c.getClass();
        return new i("AutotekaReport", Pf.c.f13219d, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
