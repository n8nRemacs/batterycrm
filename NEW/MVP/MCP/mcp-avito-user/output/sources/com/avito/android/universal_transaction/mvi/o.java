package com.avito.android.universal_transaction.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TransactionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final l f306461a;

    /* renamed from: b, reason: collision with root package name */
    public final j f306462b;

    /* renamed from: c, reason: collision with root package name */
    public final q f306463c;

    /* renamed from: d, reason: collision with root package name */
    public final s f306464d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f306465e;

    public o(l lVar, j jVar, q qVar, s sVar, Provider provider) {
        this.f306461a = lVar;
        this.f306462b = jVar;
        this.f306463c = qVar;
        this.f306464d = sVar;
        this.f306465e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f306461a.get();
        a aVar = (a) this.f306462b.get();
        this.f306463c.getClass();
        p pVar = new p();
        this.f306464d.getClass();
        r rVar = new r();
        ScreenPerformanceTracker screenPerformanceTracker = this.f306465e.get();
        CG0.c.f2063e.getClass();
        return new n("UniversalTransaction", CG0.c.f2064f, new m(kVar, aVar, screenPerformanceTracker, rVar, pVar));
    }
}
