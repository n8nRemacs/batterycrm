package com.avito.android.mortgage.applicant_type.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicantTypeSelectorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final b f198327a;

    /* renamed from: b, reason: collision with root package name */
    public final h f198328b;

    /* renamed from: c, reason: collision with root package name */
    public final j f198329c;

    /* renamed from: d, reason: collision with root package name */
    public final d f198330d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f198331e;

    public f(b bVar, h hVar, j jVar, d dVar, Provider provider) {
        this.f198327a = bVar;
        this.f198328b = hVar;
        this.f198329c = jVar;
        this.f198330d = dVar;
        this.f198331e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f198327a.getClass();
        a aVar = new a();
        this.f198328b.getClass();
        g gVar = new g();
        i iVar = (i) this.f198329c.get();
        return new e(this.f198331e.get(), aVar, (c) this.f198330d.get(), gVar, iVar);
    }
}
