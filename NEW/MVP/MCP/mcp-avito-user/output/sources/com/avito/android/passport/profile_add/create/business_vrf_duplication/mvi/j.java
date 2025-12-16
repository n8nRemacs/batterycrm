package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationProfileCreationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f211262a;

    /* renamed from: b, reason: collision with root package name */
    public final c f211263b;

    /* renamed from: c, reason: collision with root package name */
    public final l f211264c;

    /* renamed from: d, reason: collision with root package name */
    public final n f211265d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f211266e;

    public j(g gVar, c cVar, l lVar, n nVar, Provider provider) {
        this.f211262a = gVar;
        this.f211263b = cVar;
        this.f211264c = lVar;
        this.f211265d = nVar;
        this.f211266e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f211262a.get();
        a aVar = (a) this.f211263b.get();
        k kVar = (k) this.f211264c.get();
        this.f211265d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f211266e.get();
        Z50.c.f19880e.getClass();
        return new i("BusinessVrfDuplicationProfileCreation", Z50.c.f19881f, new h(fVar, aVar, screenPerformanceTracker, mVar, kVar));
    }
}
