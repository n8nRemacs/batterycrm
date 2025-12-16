package com.avito.android.advert.cpo_program.autotekacpoprogram.mvi;

import com.avito.android.remote.model.autotekateaser.CpoDescription;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaCpoProgramFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f68860a;

    /* renamed from: b, reason: collision with root package name */
    public final h f68861b;

    /* renamed from: c, reason: collision with root package name */
    public final l f68862c;

    public f(c cVar, h hVar, l lVar) {
        this.f68860a = cVar;
        this.f68861b = hVar;
        this.f68862c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f68860a.getClass();
        b bVar = new b();
        this.f68861b.getClass();
        g gVar = new g();
        CpoDescription cpoDescription = (CpoDescription) this.f68862c.f393949a;
        X3.d.f18572c.getClass();
        return new e("AutotekaCpoProgram", new X3.d(cpoDescription), new d(bVar, gVar));
    }
}
