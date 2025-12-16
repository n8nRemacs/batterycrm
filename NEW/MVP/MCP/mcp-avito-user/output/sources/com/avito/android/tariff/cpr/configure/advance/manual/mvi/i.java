package com.avito.android.tariff.cpr.configure.advance.manual.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CprConfigureAdvanceManualFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f295432a;

    /* renamed from: b, reason: collision with root package name */
    public final d f295433b;

    /* renamed from: c, reason: collision with root package name */
    public final k f295434c;

    /* renamed from: d, reason: collision with root package name */
    public final n f295435d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f295436e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f295432a = fVar;
        this.f295433b = dVar;
        this.f295434c = kVar;
        this.f295435d = nVar;
        this.f295436e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f295432a.get();
        c cVar = (c) this.f295433b.get();
        this.f295434c.getClass();
        j jVar = new j();
        this.f295435d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f295436e.get();
        fB0.c.f395775i.getClass();
        return new h("CprConfigureAdvanceManual", fB0.c.f395776j, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
