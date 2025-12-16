package com.avito.android.tariff.cpx.configure.advance.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureAdvanceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f295762a;

    /* renamed from: b, reason: collision with root package name */
    public final e f295763b;

    /* renamed from: c, reason: collision with root package name */
    public final l f295764c;

    /* renamed from: d, reason: collision with root package name */
    public final n f295765d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f295766e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f295762a = gVar;
        this.f295763b = eVar;
        this.f295764c = lVar;
        this.f295765d = nVar;
        this.f295766e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f295762a.get();
        d dVar = (d) this.f295763b.get();
        this.f295764c.getClass();
        k kVar = new k();
        m mVar = (m) this.f295765d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f295766e.get();
        mB0.e.f414380j.getClass();
        return new i("CpxConfigureAdvance", mB0.e.f414381k, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
