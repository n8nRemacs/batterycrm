package com.avito.android.screens.bbip_v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vp0.C49366c;

/* compiled from: BbipV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f261557a;

    /* renamed from: b, reason: collision with root package name */
    public final d f261558b;

    /* renamed from: c, reason: collision with root package name */
    public final k f261559c;

    /* renamed from: d, reason: collision with root package name */
    public final m f261560d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f261561e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f261557a = fVar;
        this.f261558b = dVar;
        this.f261559c = kVar;
        this.f261560d = mVar;
        this.f261561e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f261557a.get();
        a aVar = (a) this.f261558b.get();
        this.f261559c.getClass();
        j jVar = new j();
        l lVar = (l) this.f261560d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f261561e.get();
        C49366c.f440985m.getClass();
        return new h("BbipV2", C49366c.f440986n, new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
