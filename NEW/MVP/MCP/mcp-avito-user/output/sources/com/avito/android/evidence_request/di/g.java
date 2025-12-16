package com.avito.android.evidence_request.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceRequestModule_ProvideScreenProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<com.avito.android.evidence_request.reasons.c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f148616a;

    public g(u uVar) {
        this.f148616a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.evidence_request.i iVar = (com.avito.android.evidence_request.i) this.f148616a.get();
        d.f148613a.getClass();
        return iVar;
    }
}
