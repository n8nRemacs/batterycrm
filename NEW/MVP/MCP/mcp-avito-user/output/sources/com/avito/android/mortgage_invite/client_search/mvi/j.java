package com.avito.android.mortgage_invite.client_search.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientSearchFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f205456a;

    /* renamed from: b, reason: collision with root package name */
    public final e f205457b;

    /* renamed from: c, reason: collision with root package name */
    public final n f205458c;

    /* renamed from: d, reason: collision with root package name */
    public final l f205459d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f205460e;

    public j(g gVar, e eVar, n nVar, l lVar, Provider provider) {
        this.f205456a = gVar;
        this.f205457b = eVar;
        this.f205458c = nVar;
        this.f205459d = lVar;
        this.f205460e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f205456a.get();
        d dVar = (d) this.f205457b.get();
        this.f205458c.getClass();
        m mVar = new m();
        this.f205459d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f205460e.get();
        W10.c.f17557g.getClass();
        return new i("MortgageClientSearch", W10.c.f17558h, new h(fVar, screenPerformanceTracker, mVar, dVar, kVar));
    }
}
