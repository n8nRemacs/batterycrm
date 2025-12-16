package com.avito.android.barcode.presentation.mvi;

import com.avito.android.barcode.presentation.mvi.entity.BarcodeState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BarcodeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f98747a;

    /* renamed from: b, reason: collision with root package name */
    public final c f98748b;

    /* renamed from: c, reason: collision with root package name */
    public final j f98749c;

    /* renamed from: d, reason: collision with root package name */
    public final l f98750d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f98747a = eVar;
        this.f98748b = cVar;
        this.f98749c = jVar;
        this.f98750d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f98747a.get();
        b bVar = (b) this.f98748b.get();
        this.f98749c.getClass();
        i iVar = new i();
        this.f98750d.getClass();
        return new g("Barcode", BarcodeState.Loading.f98741b, new f(dVar, bVar, new k(), iVar));
    }
}
