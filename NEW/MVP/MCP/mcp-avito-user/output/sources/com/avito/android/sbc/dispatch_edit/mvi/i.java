package com.avito.android.sbc.dispatch_edit.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbcDispatchEditFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f260139a;

    /* renamed from: b, reason: collision with root package name */
    public final d f260140b;

    /* renamed from: c, reason: collision with root package name */
    public final k f260141c;

    /* renamed from: d, reason: collision with root package name */
    public final m f260142d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f260143e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f260139a = fVar;
        this.f260140b = dVar;
        this.f260141c = kVar;
        this.f260142d = mVar;
        this.f260143e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f260139a.get();
        c cVar = (c) this.f260140b.get();
        this.f260141c.getClass();
        j jVar = new j();
        l lVar = (l) this.f260142d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f260143e.get();
        Wo0.d.f18059f.getClass();
        return new h("SbcDispatchEdit", Wo0.d.f18060g, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
