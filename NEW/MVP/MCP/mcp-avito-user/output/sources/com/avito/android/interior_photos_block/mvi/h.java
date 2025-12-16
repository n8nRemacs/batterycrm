package com.avito.android.interior_photos_block.mvi;

import dagger.internal.x;
import dagger.internal.y;
import iO.C41325d;

/* compiled from: InteriorPhotosBlockFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f173068a;

    /* renamed from: b, reason: collision with root package name */
    public final c f173069b;

    /* renamed from: c, reason: collision with root package name */
    public final j f173070c;

    public h(e eVar, c cVar, j jVar) {
        this.f173068a = eVar;
        this.f173069b = cVar;
        this.f173070c = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f173068a.get();
        b bVar = (b) this.f173069b.get();
        this.f173070c.getClass();
        i iVar = new i();
        C41325d.f398511c.getClass();
        return new g("InteriorPhotosBlock", C41325d.f398512d, new f(dVar, bVar, iVar));
    }
}
