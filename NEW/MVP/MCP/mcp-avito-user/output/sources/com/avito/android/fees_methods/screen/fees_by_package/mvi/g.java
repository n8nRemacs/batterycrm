package com.avito.android.fees_methods.screen.fees_by_package.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesByPackageFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f158055a;

    /* renamed from: b, reason: collision with root package name */
    public final b f158056b;

    /* renamed from: c, reason: collision with root package name */
    public final i f158057c;

    /* renamed from: d, reason: collision with root package name */
    public final k f158058d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f158059e;

    /* renamed from: f, reason: collision with root package name */
    public final l f158060f;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider, l lVar) {
        this.f158055a = dVar;
        this.f158056b = bVar;
        this.f158057c = iVar;
        this.f158058d = kVar;
        this.f158059e = provider;
        this.f158060f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f158055a.get();
        a aVar = (a) this.f158056b.get();
        this.f158057c.getClass();
        h hVar = new h();
        this.f158058d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f158059e.get();
        boolean zBooleanValue = ((Boolean) this.f158060f.f393949a).booleanValue();
        FeesByPackageState.f158024l.getClass();
        return new f("FeesByPackage", FeesByPackageState.a(FeesByPackageState.f158025m, zBooleanValue, false, false, null, null, null, null, null, null, null, 1022), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
