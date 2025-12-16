package com.avito.android.tariff.cpr.configure.advance.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import gB0.C40568c;
import javax.inject.Provider;

/* compiled from: CprConfigureAdvanceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f295481a;

    /* renamed from: b, reason: collision with root package name */
    public final e f295482b;

    /* renamed from: c, reason: collision with root package name */
    public final l f295483c;

    /* renamed from: d, reason: collision with root package name */
    public final o f295484d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f295485e;

    public j(g gVar, e eVar, l lVar, o oVar, Provider provider) {
        this.f295481a = gVar;
        this.f295482b = eVar;
        this.f295483c = lVar;
        this.f295484d = oVar;
        this.f295485e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f295481a.get();
        d dVar = (d) this.f295482b.get();
        this.f295483c.getClass();
        k kVar = new k();
        this.f295484d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f295485e.get();
        C40568c.f396372i.getClass();
        return new i("CprConfigureAdvance", C40568c.f396373j, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
