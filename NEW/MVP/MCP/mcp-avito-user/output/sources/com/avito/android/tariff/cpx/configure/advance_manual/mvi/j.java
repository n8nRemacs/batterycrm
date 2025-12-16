package com.avito.android.tariff.cpx.configure.advance_manual.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureAdvanceManualFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f295853a;

    /* renamed from: b, reason: collision with root package name */
    public final e f295854b;

    /* renamed from: c, reason: collision with root package name */
    public final l f295855c;

    /* renamed from: d, reason: collision with root package name */
    public final o f295856d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f295857e;

    public j(g gVar, e eVar, l lVar, o oVar, Provider provider) {
        this.f295853a = gVar;
        this.f295854b = eVar;
        this.f295855c = lVar;
        this.f295856d = oVar;
        this.f295857e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f295853a.get();
        d dVar = (d) this.f295854b.get();
        this.f295855c.getClass();
        k kVar = new k();
        this.f295856d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f295857e.get();
        oB0.c.f419557i.getClass();
        return new i("CpxConfigureAdvanceManual", oB0.c.f419558j, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
