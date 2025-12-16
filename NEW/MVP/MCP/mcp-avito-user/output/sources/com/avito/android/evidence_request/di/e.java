package com.avito.android.evidence_request.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EvidenceRequestModule_ProvideDetailsProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<com.avito.android.evidence_request.details.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.evidence_request.i> f148614a;

    public e(Provider<com.avito.android.evidence_request.i> provider) {
        this.f148614a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.evidence_request.i iVar = this.f148614a.get();
        d.f148613a.getClass();
        return iVar;
    }
}
