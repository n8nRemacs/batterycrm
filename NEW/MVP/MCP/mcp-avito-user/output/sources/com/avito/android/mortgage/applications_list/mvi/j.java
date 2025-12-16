package com.avito.android.mortgage.applications_list.mvi;

import com.avito.android.analytics.screens.MortgageApplicationsListScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationsListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f198470a;

    /* renamed from: b, reason: collision with root package name */
    public final e f198471b;

    /* renamed from: c, reason: collision with root package name */
    public final p f198472c;

    /* renamed from: d, reason: collision with root package name */
    public final r f198473d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f198474e;

    public j(g gVar, e eVar, p pVar, r rVar, Provider provider) {
        this.f198470a = gVar;
        this.f198471b = eVar;
        this.f198472c = pVar;
        this.f198473d = rVar;
        this.f198474e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f198470a.get();
        c cVar = (c) this.f198471b.get();
        this.f198472c.getClass();
        o oVar = new o();
        q qVar = (q) this.f198473d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f198474e.get();
        SZ.c.f15060d.getClass();
        return new i(MortgageApplicationsListScreen.f90415d.f90471b, SZ.c.f15061e, new h(fVar, cVar, screenPerformanceTracker, qVar, oVar));
    }
}
