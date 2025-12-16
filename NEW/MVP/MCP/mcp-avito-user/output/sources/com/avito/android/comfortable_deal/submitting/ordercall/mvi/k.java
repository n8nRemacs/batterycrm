package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrderCallFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final e f123093a;

    /* renamed from: b, reason: collision with root package name */
    public final m f123094b;

    /* renamed from: c, reason: collision with root package name */
    public final o f123095c;

    /* renamed from: d, reason: collision with root package name */
    public final h f123096d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f123097e;

    public k(e eVar, m mVar, o oVar, h hVar, Provider provider) {
        this.f123093a = eVar;
        this.f123094b = mVar;
        this.f123095c = oVar;
        this.f123096d = hVar;
        this.f123097e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f123093a.get();
        this.f123094b.getClass();
        l lVar = new l();
        this.f123095c.getClass();
        n nVar = new n();
        g gVar = (g) this.f123096d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f123097e.get();
        OrderCallState.f123072l.getClass();
        return new j("OrderCall", new OrderCallState("", "", "", null, "", "", false, false, "", false), new i(dVar, gVar, screenPerformanceTracker, nVar, lVar));
    }
}
