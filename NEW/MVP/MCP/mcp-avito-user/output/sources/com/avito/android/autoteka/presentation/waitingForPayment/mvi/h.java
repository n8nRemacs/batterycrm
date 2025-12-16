package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaWaitingForPaymentFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f97903a;

    /* renamed from: b, reason: collision with root package name */
    public final c f97904b;

    /* renamed from: c, reason: collision with root package name */
    public final j f97905c;

    /* renamed from: d, reason: collision with root package name */
    public final l f97906d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f97907e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f97903a = eVar;
        this.f97904b = cVar;
        this.f97905c = jVar;
        this.f97906d = lVar;
        this.f97907e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f97903a.get();
        b bVar = (b) this.f97904b.get();
        i iVar = (i) this.f97905c.get();
        this.f97906d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f97907e.get();
        AutotekaWaitingForPaymentState.f97891c.getClass();
        return new g("AutotekaWaitingForPayment", new AutotekaWaitingForPaymentState.Waiting(AutotekaWaitingForPaymentState.f97892d), new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
