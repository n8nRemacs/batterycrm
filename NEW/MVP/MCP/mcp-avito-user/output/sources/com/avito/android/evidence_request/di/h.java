package com.avito.android.evidence_request.di;

import androidx.view.P0;
import com.avito.android.evidence_request.EvidenceRequestActivity;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceRequestModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<com.avito.android.evidence_request.i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f148617a;

    /* renamed from: b, reason: collision with root package name */
    public final u f148618b;

    public h(l lVar, u uVar) {
        this.f148617a = lVar;
        this.f148618b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceRequestActivity evidenceRequestActivity = (EvidenceRequestActivity) this.f148617a.f393949a;
        P0.c cVar = (P0.c) this.f148618b.get();
        d.f148613a.getClass();
        return (com.avito.android.evidence_request.i) new P0(evidenceRequestActivity, cVar).a(com.avito.android.evidence_request.i.class);
    }
}
