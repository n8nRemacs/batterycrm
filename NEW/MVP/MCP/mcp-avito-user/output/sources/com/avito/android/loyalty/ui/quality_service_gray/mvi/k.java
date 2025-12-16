package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rX.AbstractC47609c;

/* compiled from: QualityServiceGrayFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f184139a;

    /* renamed from: b, reason: collision with root package name */
    public final d f184140b;

    /* renamed from: c, reason: collision with root package name */
    public final m f184141c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f184142d;

    /* renamed from: e, reason: collision with root package name */
    public final h f184143e;

    public k(f fVar, d dVar, m mVar, Provider provider, h hVar) {
        this.f184139a = fVar;
        this.f184140b = dVar;
        this.f184141c = mVar;
        this.f184142d = provider;
        this.f184143e = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f184139a.get();
        c cVar = (c) this.f184140b.get();
        this.f184141c.getClass();
        l lVar = new l();
        ScreenPerformanceTracker screenPerformanceTracker = this.f184142d.get();
        this.f184143e.getClass();
        return new j("QualityServiceGray", AbstractC47609c.d.f429866b, new i(eVar, cVar, screenPerformanceTracker, lVar, new g()));
    }
}
