package com.avito.android.evidence_request.details.di;

import android.content.res.Resources;
import com.avito.android.evidence_request.details.EvidenceDetailsFragment;

/* compiled from: EvidenceDetailsModule_ProvideResourcesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148423a;

    public u(dagger.internal.l lVar) {
        this.f148423a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.f148423a.f393949a;
        s.f148418a.getClass();
        return evidenceDetailsFragment.getResources();
    }
}
