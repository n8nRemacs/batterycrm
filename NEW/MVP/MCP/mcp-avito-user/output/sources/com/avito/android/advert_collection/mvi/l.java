package com.avito.android.advert_collection.mvi;

import com.avito.android.advert_collection.mvi.entity.AdvertCollectionState;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f81674a;

    /* renamed from: b, reason: collision with root package name */
    public final g f81675b;

    /* renamed from: c, reason: collision with root package name */
    public final q f81676c;

    /* renamed from: d, reason: collision with root package name */
    public final n f81677d;

    /* renamed from: e, reason: collision with root package name */
    public final u f81678e;

    public l(i iVar, g gVar, q qVar, n nVar, u uVar) {
        this.f81674a = iVar;
        this.f81675b = gVar;
        this.f81676c = qVar;
        this.f81677d = nVar;
        this.f81678e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f81674a.get();
        e eVar = (e) this.f81675b.get();
        o oVar = (o) this.f81676c.get();
        m mVar = (m) this.f81677d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f81678e.get();
        AdvertCollectionState.f81613h.getClass();
        return new k("AdvertCollection", AdvertCollectionState.f81614i, new j(hVar, eVar, screenPerformanceTracker, oVar, mVar));
    }
}
