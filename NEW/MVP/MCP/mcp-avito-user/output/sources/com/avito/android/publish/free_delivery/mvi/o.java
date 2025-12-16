package com.avito.android.publish.free_delivery.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import he0.C40926c;
import javax.inject.Provider;

/* compiled from: FreeDeliveryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final l f235859a;

    /* renamed from: b, reason: collision with root package name */
    public final j f235860b;

    /* renamed from: c, reason: collision with root package name */
    public final q f235861c;

    /* renamed from: d, reason: collision with root package name */
    public final s f235862d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f235863e;

    public o(l lVar, j jVar, q qVar, s sVar, Provider provider) {
        this.f235859a = lVar;
        this.f235860b = jVar;
        this.f235861c = qVar;
        this.f235862d = sVar;
        this.f235863e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f235859a.get();
        i iVar = (i) this.f235860b.get();
        this.f235861c.getClass();
        p pVar = new p();
        r rVar = (r) this.f235862d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f235863e.get();
        C40926c.f397328n.getClass();
        return new n("FreeDeliveryPublish", C40926c.f397329o, new m(kVar, iVar, screenPerformanceTracker, rVar, pVar));
    }
}
