package com.avito.android.publish.vinsuggest.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VinSuggestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f245775a;

    /* renamed from: b, reason: collision with root package name */
    public final b f245776b;

    /* renamed from: c, reason: collision with root package name */
    public final i f245777c;

    /* renamed from: d, reason: collision with root package name */
    public final k f245778d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f245775a = dVar;
        this.f245776b = bVar;
        this.f245777c = iVar;
        this.f245778d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f245775a.get();
        this.f245776b.getClass();
        a aVar = new a();
        this.f245777c.getClass();
        h hVar = new h();
        this.f245778d.getClass();
        j jVar = new j();
        If0.d.f8474a.getClass();
        return new f("VinSuggest", If0.d.f8475b, new e(cVar, aVar, jVar, hVar));
    }
}
