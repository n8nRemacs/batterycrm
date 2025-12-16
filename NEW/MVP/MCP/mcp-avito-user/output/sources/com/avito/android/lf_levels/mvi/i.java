package com.avito.android.lf_levels.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LfLevelsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f175390a;

    /* renamed from: b, reason: collision with root package name */
    public final d f175391b;

    /* renamed from: c, reason: collision with root package name */
    public final k f175392c;

    /* renamed from: d, reason: collision with root package name */
    public final m f175393d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f175394e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f175390a = fVar;
        this.f175391b = dVar;
        this.f175392c = kVar;
        this.f175393d = mVar;
        this.f175394e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f175390a.get();
        c cVar = (c) this.f175391b.get();
        this.f175392c.getClass();
        j jVar = new j();
        l lVar = (l) this.f175393d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f175394e.get();
        wR.c.f441444k.getClass();
        return new h("LfLevels", wR.c.f441445l, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
