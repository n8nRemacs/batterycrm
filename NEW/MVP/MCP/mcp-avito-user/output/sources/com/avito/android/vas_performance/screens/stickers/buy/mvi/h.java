package com.avito.android.vas_performance.screens.stickers.buy.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StickersBuyFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f320745a;

    /* renamed from: b, reason: collision with root package name */
    public final c f320746b;

    /* renamed from: c, reason: collision with root package name */
    public final j f320747c;

    /* renamed from: d, reason: collision with root package name */
    public final m f320748d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f320749e;

    public h(e eVar, c cVar, j jVar, m mVar, Provider provider) {
        this.f320745a = eVar;
        this.f320746b = cVar;
        this.f320747c = jVar;
        this.f320748d = mVar;
        this.f320749e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f320745a.get();
        b bVar = (b) this.f320746b.get();
        this.f320747c.getClass();
        i iVar = new i();
        this.f320748d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f320749e.get();
        KL0.c.f9403j.getClass();
        return new g("StickersBuy", KL0.c.f9404k, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
