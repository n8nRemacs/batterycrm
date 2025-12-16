package com.avito.android.recommendation_items_loader_impl.screen.mvi;

import Mi0.C14495d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecommendationLoaderFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f252335a;

    /* renamed from: b, reason: collision with root package name */
    public final k f252336b;

    /* renamed from: c, reason: collision with root package name */
    public final m f252337c;

    public i(f fVar, k kVar, m mVar) {
        this.f252335a = fVar;
        this.f252336b = kVar;
        this.f252337c = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f252335a.get();
        this.f252336b.getClass();
        j jVar = new j();
        this.f252337c.getClass();
        return new h("RecommendationLoader", new C14495d(true), new g(eVar, new l(), jVar));
    }
}
