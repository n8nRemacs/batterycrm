package com.avito.android.wallet.page.history.details.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentHistoryDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f327915a;

    /* renamed from: b, reason: collision with root package name */
    public final h f327916b;

    /* renamed from: c, reason: collision with root package name */
    public final o f327917c;

    /* renamed from: d, reason: collision with root package name */
    public final q f327918d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f327919e;

    public m(j jVar, h hVar, o oVar, q qVar, Provider provider) {
        this.f327915a = jVar;
        this.f327916b = hVar;
        this.f327917c = oVar;
        this.f327918d = qVar;
        this.f327919e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f327915a.get();
        a aVar = (a) this.f327916b.get();
        this.f327917c.getClass();
        n nVar = new n();
        p pVar = (p) this.f327918d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f327919e.get();
        SO0.c.f14964d.getClass();
        return new l("PaymentHistoryDetails", SO0.c.f14965e, new k(iVar, aVar, screenPerformanceTracker, pVar, nVar));
    }
}
