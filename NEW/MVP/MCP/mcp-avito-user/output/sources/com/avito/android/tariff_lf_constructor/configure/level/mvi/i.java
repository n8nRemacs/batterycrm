package com.avito.android.tariff_lf_constructor.configure.level.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mD0.C43952d;

/* compiled from: ConstructorConfigureLevelFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f299844a;

    /* renamed from: b, reason: collision with root package name */
    public final d f299845b;

    /* renamed from: c, reason: collision with root package name */
    public final k f299846c;

    /* renamed from: d, reason: collision with root package name */
    public final m f299847d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f299848e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f299844a = fVar;
        this.f299845b = dVar;
        this.f299846c = kVar;
        this.f299847d = mVar;
        this.f299848e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f299844a.get();
        c cVar = (c) this.f299845b.get();
        this.f299846c.getClass();
        j jVar = new j();
        this.f299847d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f299848e.get();
        C43952d.f414425g.getClass();
        return new h("ConstructorConfigureLevel", C43952d.f414426h, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
