package com.avito.android.imv_goods_advert.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvGoodsAdvertFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f170565a;

    /* renamed from: b, reason: collision with root package name */
    public final d f170566b;

    /* renamed from: c, reason: collision with root package name */
    public final k f170567c;

    /* renamed from: d, reason: collision with root package name */
    public final m f170568d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f170569e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f170565a = fVar;
        this.f170566b = dVar;
        this.f170567c = kVar;
        this.f170568d = mVar;
        this.f170569e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f170565a.get();
        c cVar = (c) this.f170566b.get();
        this.f170567c.getClass();
        j jVar = new j();
        l lVar = (l) this.f170568d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f170569e.get();
        aN.c.f20885g.getClass();
        return new h("ImvGoodsAdvert", aN.c.f20886h, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
