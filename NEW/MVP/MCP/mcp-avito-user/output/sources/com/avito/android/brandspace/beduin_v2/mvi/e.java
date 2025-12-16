package com.avito.android.brandspace.beduin_v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import ik.C41418c;

/* compiled from: BrandspaceBeduinV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f107573a;

    /* renamed from: b, reason: collision with root package name */
    public final i f107574b;

    /* renamed from: c, reason: collision with root package name */
    public final g f107575c;

    /* renamed from: d, reason: collision with root package name */
    public final l f107576d;

    public e(b bVar, i iVar, g gVar, l lVar) {
        this.f107573a = bVar;
        this.f107574b = iVar;
        this.f107575c = gVar;
        this.f107576d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f107573a.getClass();
        a aVar = new a();
        this.f107574b.getClass();
        h hVar = new h();
        this.f107575c.getClass();
        f fVar = new f();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f107576d.f393949a;
        C41418c.f398709c.getClass();
        return new d("BrandspaceBeduinV2", C41418c.f398710d, new c(aVar, screenPerformanceTracker, hVar, fVar));
    }
}
