package com.avito.android.related_products.bottom_sheet.mvi;

import cj0.C27210c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RelatedProductsBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f252928a;

    /* renamed from: b, reason: collision with root package name */
    public final b f252929b;

    /* renamed from: c, reason: collision with root package name */
    public final i f252930c;

    /* renamed from: d, reason: collision with root package name */
    public final k f252931d;

    /* renamed from: e, reason: collision with root package name */
    public final l f252932e;

    public g(d dVar, b bVar, i iVar, k kVar, l lVar) {
        this.f252928a = dVar;
        this.f252929b = bVar;
        this.f252930c = iVar;
        this.f252931d = kVar;
        this.f252932e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f252928a.get();
        this.f252929b.getClass();
        a aVar = new a();
        this.f252930c.getClass();
        h hVar = new h();
        this.f252931d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f252932e.f393949a;
        C27210c.f58116c.getClass();
        return new f("RelatedProductsBottomSheet", C27210c.f58117d, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
