package com.avito.android.bbl.screens.configure.v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BblConfigureV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f99379a;

    /* renamed from: b, reason: collision with root package name */
    public final d f99380b;

    /* renamed from: c, reason: collision with root package name */
    public final k f99381c;

    /* renamed from: d, reason: collision with root package name */
    public final m f99382d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f99383e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f99379a = fVar;
        this.f99380b = dVar;
        this.f99381c = kVar;
        this.f99382d = mVar;
        this.f99383e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f99379a.get();
        c cVar = (c) this.f99380b.get();
        this.f99381c.getClass();
        j jVar = new j();
        l lVar = (l) this.f99382d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f99383e.get();
        Ah.c.f570n.getClass();
        return new h("BblConfigureV2", Ah.c.f571o, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
