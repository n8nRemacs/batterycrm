package com.avito.android.rating_form.step.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import ih0.C41404c;
import javax.inject.Provider;

/* compiled from: RatingFormStepFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final t f249711a;

    /* renamed from: b, reason: collision with root package name */
    public final n f249712b;

    /* renamed from: c, reason: collision with root package name */
    public final y f249713c;

    /* renamed from: d, reason: collision with root package name */
    public final B f249714d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f249715e;

    public w(t tVar, n nVar, y yVar, B b12, Provider provider) {
        this.f249711a = tVar;
        this.f249712b = nVar;
        this.f249713c = yVar;
        this.f249714d = b12;
        this.f249715e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s sVar = (s) this.f249711a.get();
        j jVar = (j) this.f249712b.get();
        this.f249713c.getClass();
        x xVar = new x();
        A a12 = (A) this.f249714d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f249715e.get();
        C41404c.f398669i.getClass();
        return new v("RatingFormStep", C41404c.f398670j, new u(sVar, jVar, screenPerformanceTracker, a12, xVar));
    }
}
