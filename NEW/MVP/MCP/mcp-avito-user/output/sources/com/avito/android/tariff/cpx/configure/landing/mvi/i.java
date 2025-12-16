package com.avito.android.tariff.cpx.configure.landing.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qB0.C47274e;

/* compiled from: CpxConfigureLandingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f296038a;

    /* renamed from: b, reason: collision with root package name */
    public final d f296039b;

    /* renamed from: c, reason: collision with root package name */
    public final k f296040c;

    /* renamed from: d, reason: collision with root package name */
    public final n f296041d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f296042e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f296038a = fVar;
        this.f296039b = dVar;
        this.f296040c = kVar;
        this.f296041d = nVar;
        this.f296042e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f296038a.get();
        c cVar = (c) this.f296039b.get();
        this.f296040c.getClass();
        j jVar = new j();
        l lVar = (l) this.f296041d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f296042e.get();
        C47274e.f429094h.getClass();
        return new h("CpxConfigureLanding", C47274e.f429095i, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
