package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectVerticalFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f211975a;

    /* renamed from: b, reason: collision with root package name */
    public final d f211976b;

    /* renamed from: c, reason: collision with root package name */
    public final k f211977c;

    /* renamed from: d, reason: collision with root package name */
    public final m f211978d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f211979e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f211975a = fVar;
        this.f211976b = dVar;
        this.f211977c = kVar;
        this.f211978d = mVar;
        this.f211979e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f211975a.get();
        c cVar = (c) this.f211976b.get();
        this.f211977c.getClass();
        j jVar = new j();
        l lVar = (l) this.f211978d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f211979e.get();
        U50.c.f16191l.getClass();
        return new h("SelectVertical", U50.c.f16192m, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
