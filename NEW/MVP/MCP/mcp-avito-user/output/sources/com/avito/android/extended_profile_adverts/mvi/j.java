package com.avito.android.extended_profile_adverts.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileAdvertsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f150943a;

    /* renamed from: b, reason: collision with root package name */
    public final e f150944b;

    /* renamed from: c, reason: collision with root package name */
    public final l f150945c;

    /* renamed from: d, reason: collision with root package name */
    public final o f150946d;

    public j(g gVar, e eVar, l lVar, o oVar) {
        this.f150943a = gVar;
        this.f150944b = eVar;
        this.f150945c = lVar;
        this.f150946d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f150943a.get();
        d dVar = (d) this.f150944b.get();
        this.f150945c.getClass();
        k kVar = new k();
        n nVar = (n) this.f150946d.get();
        pA.d.f428241j.getClass();
        return new i("ProfileAdverts", pA.d.f428242k, new h(fVar, dVar, nVar, kVar));
    }
}
