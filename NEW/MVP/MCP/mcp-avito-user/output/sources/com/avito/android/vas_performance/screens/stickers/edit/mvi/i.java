package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersEditFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f320819a;

    /* renamed from: b, reason: collision with root package name */
    public final d f320820b;

    /* renamed from: c, reason: collision with root package name */
    public final k f320821c;

    /* renamed from: d, reason: collision with root package name */
    public final m f320822d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f320823e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f320824f;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider, dagger.internal.l lVar) {
        this.f320819a = fVar;
        this.f320820b = dVar;
        this.f320821c = kVar;
        this.f320822d = mVar;
        this.f320823e = provider;
        this.f320824f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f320819a.get();
        c cVar = (c) this.f320820b.get();
        this.f320821c.getClass();
        j jVar = new j();
        this.f320822d.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f320823e.get();
        boolean zBooleanValue = ((Boolean) this.f320824f.f393949a).booleanValue();
        ML0.c.f10600s.getClass();
        return new h("StickersEdit", ML0.c.a(ML0.c.f10601t, zBooleanValue, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070), new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
