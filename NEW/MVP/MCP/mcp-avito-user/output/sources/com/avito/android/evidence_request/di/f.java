package com.avito.android.evidence_request.di;

import androidx.view.InterfaceC23487e;
import com.avito.android.evidence_request.EvidenceRequestActivity;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceRequestModule_ProvideRegistryOwnerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<InterfaceC23487e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f148615a;

    public f(l lVar) {
        this.f148615a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        EvidenceRequestActivity evidenceRequestActivity = (EvidenceRequestActivity) this.f148615a.f393949a;
        d.f148613a.getClass();
        return evidenceRequestActivity;
    }
}
