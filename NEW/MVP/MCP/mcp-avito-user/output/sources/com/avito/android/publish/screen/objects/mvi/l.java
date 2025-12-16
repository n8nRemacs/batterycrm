package com.avito.android.publish.screen.objects.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ObjectFillFormFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f240237a;

    /* renamed from: b, reason: collision with root package name */
    public final g f240238b;

    /* renamed from: c, reason: collision with root package name */
    public final n f240239c;

    /* renamed from: d, reason: collision with root package name */
    public final p f240240d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f240241e;

    public l(i iVar, g gVar, n nVar, p pVar, Provider provider) {
        this.f240237a = iVar;
        this.f240238b = gVar;
        this.f240239c = nVar;
        this.f240240d = pVar;
        this.f240241e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f240237a.get();
        f fVar = (f) this.f240238b.get();
        this.f240239c.getClass();
        m mVar = new m();
        this.f240240d.getClass();
        o oVar = new o();
        ScreenPerformanceTracker screenPerformanceTracker = this.f240241e.get();
        Ge0.f.f6686d.getClass();
        return new k("ObjectFillForm", Ge0.f.f6687e, new j(hVar, fVar, screenPerformanceTracker, oVar, mVar));
    }
}
