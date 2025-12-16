package com.avito.android.evidence_request.details.di;

import androidx.view.P0;
import com.avito.android.evidence_request.details.EvidenceDetailsFragment;

/* compiled from: EvidenceDetailsModule_ProvideViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<com.avito.android.evidence_request.details.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148424a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f148425b;

    public v(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f148424a = lVar;
        this.f148425b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.f148424a.f393949a;
        P0.c cVar = (P0.c) this.f148425b.get();
        s.f148418a.getClass();
        return (com.avito.android.evidence_request.details.h) new P0(evidenceDetailsFragment, cVar).a(com.avito.android.evidence_request.details.h.class);
    }
}
