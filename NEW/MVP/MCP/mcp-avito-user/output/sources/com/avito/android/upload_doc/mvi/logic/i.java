package com.avito.android.upload_doc.mvi.logic;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigUploadDocFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f306964a;

    /* renamed from: b, reason: collision with root package name */
    public final d f306965b;

    /* renamed from: c, reason: collision with root package name */
    public final k f306966c;

    /* renamed from: d, reason: collision with root package name */
    public final m f306967d;

    public i(f fVar, d dVar, k kVar, m mVar) {
        this.f306964a = fVar;
        this.f306965b = dVar;
        this.f306966c = kVar;
        this.f306967d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f306964a.get();
        b bVar = (b) this.f306965b.get();
        this.f306966c.getClass();
        j jVar = new j();
        this.f306967d.getClass();
        return new h("GigUploadDocFlow", OG0.e.f12146a, new g(eVar, bVar, new l(), jVar));
    }
}
