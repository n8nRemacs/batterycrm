package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacProblemsBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f168929a;

    /* renamed from: b, reason: collision with root package name */
    public final d f168930b;

    /* renamed from: c, reason: collision with root package name */
    public final k f168931c;

    /* renamed from: d, reason: collision with root package name */
    public final n f168932d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f168933e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f168929a = fVar;
        this.f168930b = dVar;
        this.f168931c = kVar;
        this.f168932d = nVar;
        this.f168933e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f168929a.getClass();
        e eVar = new e();
        c cVar = (c) this.f168930b.get();
        this.f168931c.getClass();
        j jVar = new j();
        l lVar = (l) this.f168932d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f168933e.get();
        eM.c.f395129c.getClass();
        return new h("IacProblemsBottomSheet", eM.c.f395130d, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
