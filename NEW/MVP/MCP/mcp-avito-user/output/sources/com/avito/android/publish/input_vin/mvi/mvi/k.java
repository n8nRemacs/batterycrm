package com.avito.android.publish.input_vin.mvi.mvi;

import dagger.internal.x;
import dagger.internal.y;
import ne0.C44387d;

/* compiled from: InputVinMviFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f236703a;

    /* renamed from: b, reason: collision with root package name */
    public final b f236704b;

    /* renamed from: c, reason: collision with root package name */
    public final m f236705c;

    /* renamed from: d, reason: collision with root package name */
    public final o f236706d;

    public k(h hVar, b bVar, m mVar, o oVar) {
        this.f236703a = hVar;
        this.f236704b = bVar;
        this.f236705c = mVar;
        this.f236706d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f236703a.get();
        a aVar = (a) this.f236704b.get();
        this.f236705c.getClass();
        l lVar = new l();
        this.f236706d.getClass();
        n nVar = new n();
        C44387d.f415260f.getClass();
        return new j("InputVinMvi", C44387d.f415261g, new i(fVar, aVar, nVar, lVar));
    }
}
