package com.avito.android.extended_profile_map.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileMapFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f151303a;

    /* renamed from: b, reason: collision with root package name */
    public final f f151304b;

    /* renamed from: c, reason: collision with root package name */
    public final m f151305c;

    /* renamed from: d, reason: collision with root package name */
    public final o f151306d;

    public k(h hVar, f fVar, m mVar, o oVar) {
        this.f151303a = hVar;
        this.f151304b = fVar;
        this.f151305c = mVar;
        this.f151306d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f151303a.get();
        d dVar = (d) this.f151304b.get();
        this.f151305c.getClass();
        l lVar = new l();
        n nVar = (n) this.f151306d.get();
        AA.d.f182g.getClass();
        return new j("ExtendedProfileMap", AA.d.f183h, new i(gVar, dVar, nVar, lVar));
    }
}
