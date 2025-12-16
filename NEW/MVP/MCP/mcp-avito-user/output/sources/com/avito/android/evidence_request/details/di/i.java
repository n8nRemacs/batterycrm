package com.avito.android.evidence_request.details.di;

import Rz.InterfaceC15097a;
import com.avito.android.evidence_request.details.EvidenceDetailsFragment;

/* compiled from: EvidenceDetailsItemsModule_ProvideFileMaxSizeValidatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<InterfaceC15097a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148388a;

    public i(dagger.internal.l lVar) {
        this.f148388a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.f148388a.f393949a;
        f.f148378a.getClass();
        com.avito.android.evidence_request.details.h hVar = evidenceDetailsFragment.f148227n0;
        if (hVar == null) {
            hVar = null;
        }
        dagger.internal.t.d(hVar);
        return hVar;
    }
}
