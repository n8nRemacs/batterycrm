package com.avito.android.work_profile.profile.applies.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliesToVacancyFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f330904a;

    /* renamed from: b, reason: collision with root package name */
    public final d f330905b;

    /* renamed from: c, reason: collision with root package name */
    public final m f330906c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f330907d;

    public i(f fVar, d dVar, m mVar, Provider provider) {
        this.f330904a = fVar;
        this.f330905b = dVar;
        this.f330906c = mVar;
        this.f330907d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f330904a.get();
        c cVar = (c) this.f330905b.get();
        this.f330906c.getClass();
        l lVar = new l();
        return new h("AppliesJobFragment", new jQ0.b(null, null, false, false, 15, null), new g(eVar, cVar, this.f330907d.get(), lVar));
    }
}
