package com.avito.android.widget_filters.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: WidgetFiltersFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final s f330230a;

    /* renamed from: b, reason: collision with root package name */
    public final q f330231b;

    /* renamed from: c, reason: collision with root package name */
    public final x f330232c;

    /* renamed from: d, reason: collision with root package name */
    public final A f330233d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f330234e;

    public v(s sVar, q qVar, x xVar, A a12, Provider provider) {
        this.f330230a = sVar;
        this.f330231b = qVar;
        this.f330232c = xVar;
        this.f330233d = a12;
        this.f330234e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f330230a.get();
        n nVar = (n) this.f330231b.get();
        this.f330232c.getClass();
        w wVar = new w();
        z zVar = (z) this.f330233d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f330234e.get();
        com.avito.android.widget_filters.mvi.entity.c.f330093r.getClass();
        return new u("WidgetFilters", com.avito.android.widget_filters.mvi.entity.c.f330094s, new t(rVar, nVar, screenPerformanceTracker, zVar, wVar));
    }
}
