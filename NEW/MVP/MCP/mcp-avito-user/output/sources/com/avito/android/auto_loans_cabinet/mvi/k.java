package com.avito.android.auto_loans_cabinet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoLoansCabinetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f95498a;

    /* renamed from: b, reason: collision with root package name */
    public final f f95499b;

    /* renamed from: c, reason: collision with root package name */
    public final m f95500c;

    /* renamed from: d, reason: collision with root package name */
    public final p f95501d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f95502e;

    public k(h hVar, f fVar, m mVar, p pVar, Provider provider) {
        this.f95498a = hVar;
        this.f95499b = fVar;
        this.f95500c = mVar;
        this.f95501d = pVar;
        this.f95502e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f95498a.get();
        a aVar = (a) this.f95499b.get();
        this.f95500c.getClass();
        l lVar = new l();
        this.f95501d.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f95502e.get();
        AutoLoansCabinetState.f95448c.getClass();
        return new j("AutoLoansCabinet", AutoLoansCabinetState.f95449d, new i(gVar, aVar, screenPerformanceTracker, nVar, lVar));
    }
}
