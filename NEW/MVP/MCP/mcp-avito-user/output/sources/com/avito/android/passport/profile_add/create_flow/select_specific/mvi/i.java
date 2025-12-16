package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSpecificFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f211754a;

    /* renamed from: b, reason: collision with root package name */
    public final d f211755b;

    /* renamed from: c, reason: collision with root package name */
    public final k f211756c;

    /* renamed from: d, reason: collision with root package name */
    public final m f211757d;

    /* renamed from: e, reason: collision with root package name */
    public final u f211758e;

    public i(f fVar, d dVar, k kVar, m mVar, u uVar) {
        this.f211754a = fVar;
        this.f211755b = dVar;
        this.f211756c = kVar;
        this.f211757d = mVar;
        this.f211758e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f211754a.get();
        c cVar = (c) this.f211755b.get();
        j jVar = (j) this.f211756c.get();
        l lVar = (l) this.f211757d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f211758e.get();
        T50.c.f15369f.getClass();
        return new h("SelectSpecific", T50.c.f15370g, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
