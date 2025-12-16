package com.avito.android.return_checkout.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryReturnCheckoutFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f255349a;

    /* renamed from: b, reason: collision with root package name */
    public final b f255350b;

    /* renamed from: c, reason: collision with root package name */
    public final k f255351c;

    /* renamed from: d, reason: collision with root package name */
    public final n f255352d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f255353e;

    public i(f fVar, b bVar, k kVar, n nVar, Provider provider) {
        this.f255349a = fVar;
        this.f255350b = bVar;
        this.f255351c = kVar;
        this.f255352d = nVar;
        this.f255353e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f255349a.get();
        a aVar = (a) this.f255350b.get();
        this.f255351c.getClass();
        j jVar = new j();
        this.f255352d.getClass();
        m mVar = new m();
        return new h("DeliveryReturnCheckout", new Wm0.c(null, 1, null), new g(eVar, aVar, this.f255353e.get(), mVar, jVar));
    }
}
