package com.avito.android.screens.bbip_private_v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipPrivateV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f261104a;

    /* renamed from: b, reason: collision with root package name */
    public final d f261105b;

    /* renamed from: c, reason: collision with root package name */
    public final k f261106c;

    /* renamed from: d, reason: collision with root package name */
    public final n f261107d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f261108e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f261104a = fVar;
        this.f261105b = dVar;
        this.f261106c = kVar;
        this.f261107d = nVar;
        this.f261108e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f261104a.get();
        a aVar = (a) this.f261105b.get();
        this.f261106c.getClass();
        j jVar = new j();
        l lVar = (l) this.f261107d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f261108e.get();
        BbipPrivateV2State.f261013s.getClass();
        return new h("BbipPrivateV2", BbipPrivateV2State.f261014t, new g(eVar, aVar, screenPerformanceTracker, lVar, jVar));
    }
}
