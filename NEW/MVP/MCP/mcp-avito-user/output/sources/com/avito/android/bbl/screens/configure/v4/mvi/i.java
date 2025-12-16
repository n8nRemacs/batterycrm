package com.avito.android.bbl.screens.configure.v4.mvi;

import Bh.C13148c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BblConfigureV4FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f99506a;

    /* renamed from: b, reason: collision with root package name */
    public final d f99507b;

    /* renamed from: c, reason: collision with root package name */
    public final k f99508c;

    /* renamed from: d, reason: collision with root package name */
    public final n f99509d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f99510e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f99506a = fVar;
        this.f99507b = dVar;
        this.f99508c = kVar;
        this.f99509d = nVar;
        this.f99510e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f99506a.get();
        c cVar = (c) this.f99507b.get();
        this.f99508c.getClass();
        j jVar = new j();
        l lVar = (l) this.f99509d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f99510e.get();
        C13148c.f1598j.getClass();
        return new h("BblConfigureV4", C13148c.f1599k, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
