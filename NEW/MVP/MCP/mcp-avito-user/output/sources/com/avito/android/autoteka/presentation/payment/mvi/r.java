package com.avito.android.autoteka.presentation.payment.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import javax.inject.Provider;

/* compiled from: AutotekaPaymentFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final o f97512a;

    /* renamed from: b, reason: collision with root package name */
    public final j f97513b;

    /* renamed from: c, reason: collision with root package name */
    public final t f97514c;

    /* renamed from: d, reason: collision with root package name */
    public final B f97515d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f97516e;

    public r(o oVar, j jVar, t tVar, B b12, Provider provider) {
        this.f97512a = oVar;
        this.f97513b = jVar;
        this.f97514c = tVar;
        this.f97515d = b12;
        this.f97516e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f97512a.get();
        i iVar = (i) this.f97513b.get();
        s sVar = (s) this.f97514c.get();
        this.f97515d.getClass();
        A a12 = new A();
        ScreenPerformanceTracker screenPerformanceTracker = this.f97516e.get();
        AutotekaPaymentState.f97457c.getClass();
        return new q("AutotekaPayment", AutotekaPaymentState.f97458d, new p(mVar, iVar, screenPerformanceTracker, a12, sVar));
    }
}
