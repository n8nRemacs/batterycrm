package com.avito.android.evidence_request.details.di;

import com.avito.android.evidence_request.details.EvidenceDetailsFragment;

/* compiled from: EvidenceDetailsItemsModule_ProvideFilesListRouterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<com.avito.android.photo_list_view.x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148389a;

    public j(dagger.internal.l lVar) {
        this.f148389a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.f148389a.f393949a;
        f.f148378a.getClass();
        return evidenceDetailsFragment;
    }
}
