package com.avito.android.verification.verification_input_bill_amount.mvi;

import UM0.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputBillAmountFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f325583a;

    /* renamed from: b, reason: collision with root package name */
    public final e f325584b;

    /* renamed from: c, reason: collision with root package name */
    public final l f325585c;

    /* renamed from: d, reason: collision with root package name */
    public final n f325586d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325587e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f325583a = gVar;
        this.f325584b = eVar;
        this.f325585c = lVar;
        this.f325586d = nVar;
        this.f325587e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f325583a.get();
        d dVar = (d) this.f325584b.get();
        this.f325585c.getClass();
        k kVar = new k();
        m mVar = (m) this.f325586d.get();
        return new i("VerificationInputBillAmount", c.C1120c.f16362b, new h(fVar, dVar, this.f325587e.get(), mVar, kVar));
    }
}
