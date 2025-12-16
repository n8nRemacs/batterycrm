package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import fh0.C40423b;
import javax.inject.Provider;

/* compiled from: RatingFormSelectItemFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f249104a;

    /* renamed from: b, reason: collision with root package name */
    public final d f249105b;

    /* renamed from: c, reason: collision with root package name */
    public final k f249106c;

    /* renamed from: d, reason: collision with root package name */
    public final m f249107d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f249108e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f249104a = fVar;
        this.f249105b = dVar;
        this.f249106c = kVar;
        this.f249107d = mVar;
        this.f249108e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f249104a.get();
        a aVar = (a) this.f249105b.get();
        this.f249106c.getClass();
        j jVar = new j();
        l lVar = (l) this.f249107d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f249108e.get();
        C40423b.f396047i.getClass();
        return new h("RatingFormSelectItem", C40423b.f396048j, new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
