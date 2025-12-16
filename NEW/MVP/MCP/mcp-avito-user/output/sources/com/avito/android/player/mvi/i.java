package com.avito.android.player.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.player.mvi.entity.PlayerMviState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PlayerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f220194a;

    /* renamed from: b, reason: collision with root package name */
    public final b f220195b;

    /* renamed from: c, reason: collision with root package name */
    public final k f220196c;

    /* renamed from: d, reason: collision with root package name */
    public final m f220197d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f220198e;

    public i(f fVar, b bVar, k kVar, m mVar, Provider provider) {
        this.f220194a = fVar;
        this.f220195b = bVar;
        this.f220196c = kVar;
        this.f220197d = mVar;
        this.f220198e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f220194a.get();
        this.f220195b.getClass();
        a aVar = new a();
        j jVar = (j) this.f220196c.get();
        l lVar = (l) this.f220197d.get();
        return new h("Player", PlayerMviState.Initial.f220184b, new g(eVar, aVar, this.f220198e.get(), lVar, jVar));
    }
}
