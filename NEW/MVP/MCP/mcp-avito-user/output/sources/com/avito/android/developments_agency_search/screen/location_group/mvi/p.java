package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Iw.C14165c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationGroupFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final m f138210a;

    /* renamed from: b, reason: collision with root package name */
    public final k f138211b;

    /* renamed from: c, reason: collision with root package name */
    public final r f138212c;

    /* renamed from: d, reason: collision with root package name */
    public final t f138213d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f138214e;

    public p(m mVar, k kVar, r rVar, t tVar, Provider provider) {
        this.f138210a = mVar;
        this.f138211b = kVar;
        this.f138212c = rVar;
        this.f138213d = tVar;
        this.f138214e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f138210a.get();
        j jVar = (j) this.f138211b.get();
        this.f138212c.getClass();
        q qVar = new q();
        s sVar = (s) this.f138213d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f138214e.get();
        C14165c.f8620g.getClass();
        return new o("LocationGroup", C14165c.f8621h, new n(lVar, jVar, screenPerformanceTracker, sVar, qVar));
    }
}
