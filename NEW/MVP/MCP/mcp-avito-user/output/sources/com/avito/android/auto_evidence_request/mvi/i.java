package com.avito.android.auto_evidence_request.mvi;

import Ce.C13296d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoEvidenceRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final d f95268a;

    /* renamed from: b, reason: collision with root package name */
    public final b f95269b;

    /* renamed from: c, reason: collision with root package name */
    public final f f95270c;

    /* renamed from: d, reason: collision with root package name */
    public final k f95271d;

    public i(d dVar, b bVar, f fVar, k kVar) {
        this.f95268a = dVar;
        this.f95269b = bVar;
        this.f95270c = fVar;
        this.f95271d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f95268a.get();
        a aVar = (a) this.f95269b.get();
        this.f95270c.getClass();
        e eVar = new e();
        this.f95271d.getClass();
        j jVar = new j();
        C13296d.f2563i.getClass();
        return new h("AutoEvidenceRequest", C13296d.f2564j, new g(cVar, aVar, jVar, eVar));
    }
}
