package com.avito.android.loyalty.ui.quality_service.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pX.AbstractC47027c;

/* compiled from: QualityServiceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final h f184017a;

    /* renamed from: b, reason: collision with root package name */
    public final f f184018b;

    /* renamed from: c, reason: collision with root package name */
    public final o f184019c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f184020d;

    /* renamed from: e, reason: collision with root package name */
    public final j f184021e;

    public m(h hVar, f fVar, o oVar, Provider provider, j jVar) {
        this.f184017a = hVar;
        this.f184018b = fVar;
        this.f184019c = oVar;
        this.f184020d = provider;
        this.f184021e = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f184017a.get();
        e eVar = (e) this.f184018b.get();
        this.f184019c.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f184020d.get();
        this.f184021e.getClass();
        return new l("QualityService", AbstractC47027c.d.f428586b, new k(gVar, eVar, screenPerformanceTracker, nVar, new i()));
    }
}
