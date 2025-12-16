package com.avito.android.free_delivery.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FreeDeliveryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f158802a;

    /* renamed from: b, reason: collision with root package name */
    public final f f158803b;

    /* renamed from: c, reason: collision with root package name */
    public final m f158804c;

    /* renamed from: d, reason: collision with root package name */
    public final o f158805d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f158806e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f158802a = hVar;
        this.f158803b = fVar;
        this.f158804c = mVar;
        this.f158805d = oVar;
        this.f158806e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f158802a.getClass();
        g gVar = new g();
        e eVar = (e) this.f158803b.get();
        l lVar = (l) this.f158804c.get();
        n nVar = (n) this.f158805d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f158806e.get();
        UE.c.f16311i.getClass();
        return new j("FreeDelivery", UE.c.f16312j, new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}
