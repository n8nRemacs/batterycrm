package com.avito.android.orderBeduinV2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrderFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final o f209926a;

    /* renamed from: b, reason: collision with root package name */
    public final l f209927b;

    /* renamed from: c, reason: collision with root package name */
    public final t f209928c;

    /* renamed from: d, reason: collision with root package name */
    public final v f209929d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f209930e;

    public r(o oVar, l lVar, t tVar, v vVar, Provider provider) {
        this.f209926a = oVar;
        this.f209927b = lVar;
        this.f209928c = tVar;
        this.f209929d = vVar;
        this.f209930e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = (n) this.f209926a.get();
        a aVar = (a) this.f209927b.get();
        this.f209928c.getClass();
        s sVar = new s();
        this.f209929d.getClass();
        u uVar = new u();
        ScreenPerformanceTracker screenPerformanceTracker = this.f209930e.get();
        U40.c.f16170g.getClass();
        return new q("Order", U40.c.f16171h, new p(nVar, aVar, screenPerformanceTracker, uVar, sVar));
    }
}
