package com.avito.android.brandspace.brandspace.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import jk.AbstractC42392c;

/* compiled from: BrandspaceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f107665a;

    /* renamed from: b, reason: collision with root package name */
    public final d f107666b;

    /* renamed from: c, reason: collision with root package name */
    public final k f107667c;

    /* renamed from: d, reason: collision with root package name */
    public final m f107668d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f107669e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f107665a = fVar;
        this.f107666b = dVar;
        this.f107667c = kVar;
        this.f107668d = mVar;
        this.f107669e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f107665a.getClass();
        e eVar = new e();
        b bVar = (b) this.f107666b.get();
        j jVar = (j) this.f107667c.get();
        l lVar = (l) this.f107668d.get();
        return new h("Brandspace", AbstractC42392c.b.f405789b, new g(eVar, bVar, this.f107669e.get(), lVar, jVar));
    }
}
