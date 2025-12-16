package com.avito.android.imv_cars_details.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f170004a;

    /* renamed from: b, reason: collision with root package name */
    public final k f170005b;

    /* renamed from: c, reason: collision with root package name */
    public final m f170006c;

    public i(f fVar, k kVar, m mVar) {
        this.f170004a = fVar;
        this.f170005b = kVar;
        this.f170006c = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f170004a.get();
        this.f170005b.getClass();
        j jVar = new j();
        l lVar = (l) this.f170006c.get();
        WM.c.f17883e.getClass();
        return new h("ImvCarsDetails", WM.c.f17884f, new g(eVar, jVar, lVar));
    }
}
