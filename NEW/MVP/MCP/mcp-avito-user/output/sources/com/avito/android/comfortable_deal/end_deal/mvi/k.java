package com.avito.android.comfortable_deal.end_deal.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EndDealFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f122346a;

    /* renamed from: b, reason: collision with root package name */
    public final f f122347b;

    /* renamed from: c, reason: collision with root package name */
    public final m f122348c;

    /* renamed from: d, reason: collision with root package name */
    public final o f122349d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f122350e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f122346a = hVar;
        this.f122347b = fVar;
        this.f122348c = mVar;
        this.f122349d = oVar;
        this.f122350e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f122346a.get();
        e eVar = (e) this.f122347b.get();
        this.f122348c.getClass();
        l lVar = new l();
        n nVar = (n) this.f122349d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f122350e.get();
        Hp.c.f7730l.getClass();
        return new j("EndDeal", Hp.c.f7731m, new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}
