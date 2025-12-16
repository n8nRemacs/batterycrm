package com.avito.android.evidence_request.mvi.evidence_details.di;

import android.content.res.Resources;
import com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsFragment;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceDetailsModule_ProvideResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class s implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148977a;

    public s(dagger.internal.l lVar) {
        this.f148977a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.f148977a.f393949a;
        d.f148929a.getClass();
        return evidenceDetailsFragment.getResources();
    }
}
