package com.avito.android.advert_collection_adding.mvi;

import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionAddingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f81912a;

    /* renamed from: b, reason: collision with root package name */
    public final f f81913b;

    /* renamed from: c, reason: collision with root package name */
    public final m f81914c;

    /* renamed from: d, reason: collision with root package name */
    public final o f81915d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f81916e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f81912a = hVar;
        this.f81913b = fVar;
        this.f81914c = mVar;
        this.f81915d = oVar;
        this.f81916e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f81912a.get();
        e eVar = (e) this.f81913b.get();
        this.f81914c.getClass();
        l lVar = new l();
        n nVar = (n) this.f81915d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f81916e.get();
        AdvertCollectionAddingState.f81890b.getClass();
        return new j("AdvertCollectionAdding", AdvertCollectionAddingState.f81891c, new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}
