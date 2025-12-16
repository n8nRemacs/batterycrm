package com.avito.android.mortgage.pre_approval.form.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreApprovalFormFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f201943a;

    /* renamed from: b, reason: collision with root package name */
    public final c f201944b;

    /* renamed from: c, reason: collision with root package name */
    public final g f201945c;

    /* renamed from: d, reason: collision with root package name */
    public final e f201946d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f201947e;

    public j(l lVar, c cVar, g gVar, e eVar, Provider provider) {
        this.f201943a = lVar;
        this.f201944b = cVar;
        this.f201945c = gVar;
        this.f201946d = eVar;
        this.f201947e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f201943a.get();
        b bVar = (b) this.f201944b.get();
        this.f201945c.getClass();
        f fVar = new f();
        d dVar = (d) this.f201946d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f201947e.get();
        R00.b.f14054h.getClass();
        return new i("preApprovalForm", R00.b.f14055i, new h(dVar, screenPerformanceTracker, kVar, bVar, fVar));
    }
}
