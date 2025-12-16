package com.avito.android.job.cv_packages.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvPackagesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final m f174499a;

    /* renamed from: b, reason: collision with root package name */
    public final k f174500b;

    /* renamed from: c, reason: collision with root package name */
    public final t f174501c;

    /* renamed from: d, reason: collision with root package name */
    public final o f174502d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f174503e;

    public q(m mVar, k kVar, t tVar, o oVar, Provider provider) {
        this.f174499a = mVar;
        this.f174500b = kVar;
        this.f174501c = tVar;
        this.f174502d = oVar;
        this.f174503e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f174499a.getClass();
        l lVar = new l();
        a aVar = (a) this.f174500b.get();
        this.f174501c.getClass();
        s sVar = new s();
        return new p(this.f174503e.get(), aVar, lVar, (n) this.f174502d.get(), sVar);
    }
}
