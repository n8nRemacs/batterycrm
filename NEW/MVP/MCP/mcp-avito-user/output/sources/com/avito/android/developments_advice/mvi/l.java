package com.avito.android.developments_advice.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mw.C44146c;

/* compiled from: DevelopmentsAdviceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f136180a;

    /* renamed from: b, reason: collision with root package name */
    public final g f136181b;

    /* renamed from: c, reason: collision with root package name */
    public final n f136182c;

    /* renamed from: d, reason: collision with root package name */
    public final q f136183d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f136184e;

    public l(i iVar, g gVar, n nVar, q qVar, Provider provider) {
        this.f136180a = iVar;
        this.f136181b = gVar;
        this.f136182c = nVar;
        this.f136183d = qVar;
        this.f136184e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f136180a.get();
        f fVar = (f) this.f136181b.get();
        this.f136182c.getClass();
        m mVar = new m();
        o oVar = (o) this.f136183d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f136184e.get();
        C44146c.f414817l.getClass();
        return new k("DevelopmentsAdvice", C44146c.f414818m, new j(hVar, fVar, screenPerformanceTracker, oVar, mVar));
    }
}
