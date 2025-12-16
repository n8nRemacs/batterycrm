package com.avito.android.auto_evidence_request.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoEvidenceRequestModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f95061a;

    public g(u uVar) {
        this.f95061a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f95061a.get();
        f.f95060a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
