package com.avito.android.checkout.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xo.C49974c;

/* compiled from: CheckoutFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f118390a;

    /* renamed from: b, reason: collision with root package name */
    public final h f118391b;

    /* renamed from: c, reason: collision with root package name */
    public final o f118392c;

    /* renamed from: d, reason: collision with root package name */
    public final q f118393d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f118394e;

    public m(j jVar, h hVar, o oVar, q qVar, Provider provider) {
        this.f118390a = jVar;
        this.f118391b = hVar;
        this.f118392c = oVar;
        this.f118393d = qVar;
        this.f118394e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f118390a.get();
        g gVar = (g) this.f118391b.get();
        this.f118392c.getClass();
        n nVar = new n();
        p pVar = (p) this.f118393d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f118394e.get();
        C49974c.f442644i.getClass();
        return new l("Checkout", C49974c.f442645j, new k(iVar, gVar, screenPerformanceTracker, pVar, nVar));
    }
}
