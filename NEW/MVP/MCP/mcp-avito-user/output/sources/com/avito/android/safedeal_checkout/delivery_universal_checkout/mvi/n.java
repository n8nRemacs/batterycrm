package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import ao0.C23646c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalCheckoutFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f257176a;

    /* renamed from: b, reason: collision with root package name */
    public final b f257177b;

    /* renamed from: c, reason: collision with root package name */
    public final p f257178c;

    /* renamed from: d, reason: collision with root package name */
    public final t f257179d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f257180e;

    public n(k kVar, b bVar, p pVar, t tVar, Provider provider) {
        this.f257176a = kVar;
        this.f257177b = bVar;
        this.f257178c = pVar;
        this.f257179d = tVar;
        this.f257180e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f257176a.get();
        a aVar = (a) this.f257177b.get();
        this.f257178c.getClass();
        o oVar = new o();
        this.f257179d.getClass();
        s sVar = new s();
        return new m("DeliveryUniversalCheckout", new C23646c(null, 1, null), new l(jVar, aVar, this.f257180e.get(), sVar, oVar));
    }
}
