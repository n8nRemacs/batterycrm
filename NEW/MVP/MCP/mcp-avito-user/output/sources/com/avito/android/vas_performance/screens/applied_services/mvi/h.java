package com.avito.android.vas_performance.screens.applied_services.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliedServicesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f320316a;

    /* renamed from: b, reason: collision with root package name */
    public final b f320317b;

    /* renamed from: c, reason: collision with root package name */
    public final j f320318c;

    /* renamed from: d, reason: collision with root package name */
    public final l f320319d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f320320e;

    public h(e eVar, b bVar, j jVar, l lVar, Provider provider) {
        this.f320316a = eVar;
        this.f320317b = bVar;
        this.f320318c = jVar;
        this.f320319d = lVar;
        this.f320320e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f320316a.get();
        this.f320317b.getClass();
        a aVar = new a();
        this.f320318c.getClass();
        i iVar = new i();
        this.f320319d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f320320e.get();
        AppliedServicesState.f320279g.getClass();
        return new g("AppliedServices", AppliedServicesState.f320280h, new f(dVar, aVar, screenPerformanceTracker, kVar, iVar));
    }
}
