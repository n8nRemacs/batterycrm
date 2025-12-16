package com.avito.android.similar_adverts.mvi;

import Ow0.c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SimilarAdvertsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f283975a;

    /* renamed from: b, reason: collision with root package name */
    public final c f283976b;

    /* renamed from: c, reason: collision with root package name */
    public final m f283977c;

    public k(h hVar, c cVar, m mVar) {
        this.f283975a = hVar;
        this.f283976b = cVar;
        this.f283977c = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f283975a.get();
        b bVar = (b) this.f283976b.get();
        this.f283977c.getClass();
        return new j("SimilarAdverts", c.d.f12732a, new i(dVar, bVar, new l()));
    }
}
