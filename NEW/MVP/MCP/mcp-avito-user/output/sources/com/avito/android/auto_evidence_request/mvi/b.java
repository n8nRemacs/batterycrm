package com.avito.android.auto_evidence_request.mvi;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidenceRequestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f95254a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.auto_evidence_request.d> f95255b;

    /* renamed from: c, reason: collision with root package name */
    public final l f95256c;

    public b(l lVar, u uVar, Provider provider) {
        this.f95254a = uVar;
        this.f95255b = provider;
        this.f95256c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.auto_evidence_request.files.f) this.f95254a.get(), this.f95255b.get(), (String) this.f95256c.f393949a);
    }
}
