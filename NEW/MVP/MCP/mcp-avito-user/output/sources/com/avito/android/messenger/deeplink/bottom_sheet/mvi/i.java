package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BottomSheetInputFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f195491a;

    /* renamed from: b, reason: collision with root package name */
    public final k f195492b;

    /* renamed from: c, reason: collision with root package name */
    public final m f195493c;

    public i(f fVar, k kVar, m mVar) {
        this.f195491a = fVar;
        this.f195492b = kVar;
        this.f195493c = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f195491a.get();
        this.f195492b.getClass();
        j jVar = new j();
        this.f195493c.getClass();
        l lVar = new l();
        VY.c.f17191d.getClass();
        return new h("BottomSheetInput", VY.c.f17192e, new g(dVar, lVar, jVar));
    }
}
