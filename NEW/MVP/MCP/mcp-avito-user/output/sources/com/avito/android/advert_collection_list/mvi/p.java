package com.avito.android.advert_collection_list.mvi;

import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final m f82291a;

    /* renamed from: b, reason: collision with root package name */
    public final i f82292b;

    /* renamed from: c, reason: collision with root package name */
    public final r f82293c;

    /* renamed from: d, reason: collision with root package name */
    public final t f82294d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f82295e;

    public p(m mVar, i iVar, r rVar, t tVar, Provider provider) {
        this.f82291a = mVar;
        this.f82292b = iVar;
        this.f82293c = rVar;
        this.f82294d = tVar;
        this.f82295e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f82291a.get();
        g gVar = (g) this.f82292b.get();
        q qVar = (q) this.f82293c.get();
        this.f82294d.getClass();
        s sVar = new s();
        ScreenPerformanceTracker screenPerformanceTracker = this.f82295e.get();
        AdvertCollectionListState.f82217e.getClass();
        return new o("AdvertCollectionList", AdvertCollectionListState.f82218f, new n(kVar, gVar, screenPerformanceTracker, sVar, qVar));
    }
}
