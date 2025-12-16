package com.avito.android.evidence_request.details.di;

import com.avito.android.evidence_request.details.EvidenceDetailsFragment;
import com.avito.android.photo_list_view.s;

/* compiled from: EvidenceDetailsItemsModule_ProvideRemoveFileListenerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<s.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f148415a;

    public p(dagger.internal.l lVar) {
        this.f148415a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.f148415a.f393949a;
        f.f148378a.getClass();
        return evidenceDetailsFragment;
    }
}
