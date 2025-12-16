package com.avito.android.delivery_abuse.price_reduction.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceReductionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f134914a;

    /* renamed from: b, reason: collision with root package name */
    public final d f134915b;

    /* renamed from: c, reason: collision with root package name */
    public final k f134916c;

    /* renamed from: d, reason: collision with root package name */
    public final m f134917d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f134918e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f134914a = fVar;
        this.f134915b = dVar;
        this.f134916c = kVar;
        this.f134917d = mVar;
        this.f134918e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f134914a.get();
        c cVar = (c) this.f134915b.get();
        this.f134916c.getClass();
        j jVar = new j();
        l lVar = (l) this.f134917d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f134918e.get();
        Bv.c.f1788f.getClass();
        return new h("PriceReduction", Bv.c.f1789g, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
