package com.avito.android.historical_suggests.suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;
import vI.C49218c;

/* compiled from: HistoricalSuggestsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f162144a;

    /* renamed from: b, reason: collision with root package name */
    public final i f162145b;

    /* renamed from: c, reason: collision with root package name */
    public final k f162146c;

    public g(d dVar, i iVar, k kVar) {
        this.f162144a = dVar;
        this.f162145b = iVar;
        this.f162146c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f162144a.get();
        h hVar = (h) this.f162145b.get();
        this.f162146c.getClass();
        j jVar = new j();
        C49218c.f440658h.getClass();
        return new f("HistoricalSuggests", C49218c.f440659i, new e(cVar, jVar, hVar));
    }
}
