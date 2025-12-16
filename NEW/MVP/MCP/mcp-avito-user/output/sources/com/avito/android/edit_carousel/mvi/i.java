package com.avito.android.edit_carousel.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditCarouselFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f146522a;

    /* renamed from: b, reason: collision with root package name */
    public final d f146523b;

    /* renamed from: c, reason: collision with root package name */
    public final k f146524c;

    /* renamed from: d, reason: collision with root package name */
    public final m f146525d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f146526e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f146522a = fVar;
        this.f146523b = dVar;
        this.f146524c = kVar;
        this.f146525d = mVar;
        this.f146526e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f146522a.getClass();
        e eVar = new e();
        a aVar = (a) this.f146523b.get();
        this.f146524c.getClass();
        j jVar = new j();
        l lVar = (l) this.f146525d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f146526e.get();
        EditCarouselState.f146484g.getClass();
        return new h("EditCarousel", EditCarouselState.f146485h, new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
