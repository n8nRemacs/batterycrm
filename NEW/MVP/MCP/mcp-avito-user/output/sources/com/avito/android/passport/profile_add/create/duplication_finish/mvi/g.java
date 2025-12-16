package com.avito.android.passport.profile_add.create.duplication_finish.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BusinessVerificationDuplicationFinishFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f211323a;

    /* renamed from: b, reason: collision with root package name */
    public final b f211324b;

    /* renamed from: c, reason: collision with root package name */
    public final i f211325c;

    /* renamed from: d, reason: collision with root package name */
    public final k f211326d;

    /* renamed from: e, reason: collision with root package name */
    public final l f211327e;

    public g(d dVar, b bVar, i iVar, k kVar, l lVar) {
        this.f211323a = dVar;
        this.f211324b = bVar;
        this.f211325c = iVar;
        this.f211326d = kVar;
        this.f211327e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f211323a.get();
        a aVar = (a) this.f211324b.get();
        this.f211325c.getClass();
        h hVar = new h();
        this.f211326d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f211327e.f393949a;
        P50.c.f12833b.getClass();
        return new f("BusinessVerificationDuplicationFinish", P50.c.f12834c, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
