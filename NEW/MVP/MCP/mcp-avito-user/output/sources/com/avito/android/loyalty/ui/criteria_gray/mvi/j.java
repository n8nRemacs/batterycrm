package com.avito.android.loyalty.ui.criteria_gray.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kX.AbstractC42642c;

/* compiled from: CriteriaGrayFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f183634a;

    /* renamed from: b, reason: collision with root package name */
    public final e f183635b;

    /* renamed from: c, reason: collision with root package name */
    public final l f183636c;

    /* renamed from: d, reason: collision with root package name */
    public final n f183637d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f183638e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f183634a = gVar;
        this.f183635b = eVar;
        this.f183636c = lVar;
        this.f183637d = nVar;
        this.f183638e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f183634a.get();
        d dVar = (d) this.f183635b.get();
        this.f183636c.getClass();
        k kVar = new k();
        this.f183637d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f183638e.get();
        AbstractC42642c.f406368b.getClass();
        return new i("Criteria_gray", AbstractC42642c.f406369c, new h(fVar, dVar, screenPerformanceTracker, mVar, kVar));
    }
}
