package com.avito.android.evidence_request.mvi.proof_types.mvi;

import Zz.C19626c;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProofTypesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f149185a;

    /* renamed from: b, reason: collision with root package name */
    public final g f149186b;

    public e(b bVar, g gVar) {
        this.f149185a = bVar;
        this.f149186b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f149185a.getClass();
        a aVar = new a();
        this.f149186b.getClass();
        f fVar = new f();
        C19626c.f20619b.getClass();
        return new d("ProofTypes", C19626c.f20620c, new c(aVar, fVar));
    }
}
