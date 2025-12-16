package com.avito.android.evidence_request.mvi.evidence_details.di;

import com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsFragment;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceDetailsModule_ProvideFilesListRouterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<com.avito.android.photo_list_view.x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148939a;

    public i(dagger.internal.l lVar) {
        this.f148939a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.f148939a.f393949a;
        d.f148929a.getClass();
        return evidenceDetailsFragment;
    }
}
