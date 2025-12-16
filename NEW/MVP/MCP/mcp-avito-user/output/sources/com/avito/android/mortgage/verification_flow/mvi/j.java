package com.avito.android.mortgage.verification_flow.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import s10.C47959c;

/* compiled from: VerificationFlowFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final e f203925a;

    /* renamed from: b, reason: collision with root package name */
    public final l f203926b;

    /* renamed from: c, reason: collision with root package name */
    public final b f203927c;

    /* renamed from: d, reason: collision with root package name */
    public final g f203928d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f203929e;

    public j(e eVar, l lVar, b bVar, g gVar, Provider provider) {
        this.f203925a = eVar;
        this.f203926b = lVar;
        this.f203927c = bVar;
        this.f203928d = gVar;
        this.f203929e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f203925a.get();
        k kVar = (k) this.f203926b.get();
        this.f203927c.getClass();
        a aVar = new a();
        this.f203928d.getClass();
        f fVar = new f();
        ScreenPerformanceTracker screenPerformanceTracker = this.f203929e.get();
        C47959c.f437291g.getClass();
        return new i("MortgageVerificationFlowStart", C47959c.f437292h, new h(aVar, fVar, cVar, screenPerformanceTracker, kVar));
    }
}
