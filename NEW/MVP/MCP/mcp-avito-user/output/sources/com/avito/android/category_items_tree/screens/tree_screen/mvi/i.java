package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import bo.C25686c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TreeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f117173a;

    /* renamed from: b, reason: collision with root package name */
    public final k f117174b;

    /* renamed from: c, reason: collision with root package name */
    public final m f117175c;

    /* renamed from: d, reason: collision with root package name */
    public final d f117176d;

    public i(f fVar, k kVar, m mVar, d dVar) {
        this.f117173a = fVar;
        this.f117174b = kVar;
        this.f117175c = mVar;
        this.f117176d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f117173a.get();
        this.f117174b.getClass();
        j jVar = new j();
        this.f117175c.getClass();
        l lVar = new l();
        b bVar = (b) this.f117176d.get();
        C25686c.f57445f.getClass();
        return new h("TreeFeature", C25686c.f57446g, new g(eVar, lVar, bVar, jVar));
    }
}
