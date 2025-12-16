package com.avito.android.auto_evidence_request.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoEvidenceRequestModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f95065a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f95066b;

    public i(u uVar, Provider provider) {
        this.f95065a = uVar;
        this.f95066b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f95065a.get();
        com.avito.konveyor.a aVar2 = this.f95066b.get();
        f.f95060a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
