package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import Rf.AbstractC15037c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaReportGenerationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f97818a;

    /* renamed from: b, reason: collision with root package name */
    public final d f97819b;

    /* renamed from: c, reason: collision with root package name */
    public final k f97820c;

    /* renamed from: d, reason: collision with root package name */
    public final m f97821d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f97822e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f97818a = fVar;
        this.f97819b = dVar;
        this.f97820c = kVar;
        this.f97821d = mVar;
        this.f97822e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f97818a.get();
        c cVar = (c) this.f97819b.get();
        j jVar = (j) this.f97820c.get();
        this.f97821d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f97822e.get();
        AbstractC15037c.f14540c.getClass();
        return new h("AutotekaReportGeneration", new AbstractC15037c.d(AbstractC15037c.f14541d), new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
