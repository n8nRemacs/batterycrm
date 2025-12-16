package com.avito.android.sx_address.entry.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressEntryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f292968a;

    /* renamed from: b, reason: collision with root package name */
    public final b f292969b;

    /* renamed from: c, reason: collision with root package name */
    public final i f292970c;

    /* renamed from: d, reason: collision with root package name */
    public final k f292971d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f292968a = dVar;
        this.f292969b = bVar;
        this.f292970c = iVar;
        this.f292971d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f292968a.get();
        a aVar = (a) this.f292969b.get();
        this.f292970c.getClass();
        h hVar = new h();
        j jVar = (j) this.f292971d.get();
        DA0.d.f3087f.getClass();
        return new f("SxAddressEntry", DA0.d.f3088g, new e(cVar, aVar, jVar, hVar));
    }
}
