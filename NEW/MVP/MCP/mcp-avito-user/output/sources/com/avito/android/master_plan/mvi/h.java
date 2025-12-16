package com.avito.android.master_plan.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MasterPlanFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f186087a;

    /* renamed from: b, reason: collision with root package name */
    public final b f186088b;

    /* renamed from: c, reason: collision with root package name */
    public final j f186089c;

    /* renamed from: d, reason: collision with root package name */
    public final l f186090d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f186091e;

    public h(e eVar, b bVar, j jVar, l lVar, Provider provider) {
        this.f186087a = eVar;
        this.f186088b = bVar;
        this.f186089c = jVar;
        this.f186090d = lVar;
        this.f186091e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f186087a.get();
        a aVar = (a) this.f186088b.get();
        this.f186089c.getClass();
        i iVar = new i();
        this.f186090d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f186091e.get();
        vY.d.f440839f.getClass();
        return new g("MasterPlan", vY.d.f440840g, new f(cVar, aVar, screenPerformanceTracker, kVar, iVar));
    }
}
