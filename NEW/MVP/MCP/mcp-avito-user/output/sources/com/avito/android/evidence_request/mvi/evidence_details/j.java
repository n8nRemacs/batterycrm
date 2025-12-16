package com.avito.android.evidence_request.mvi.evidence_details;

import com.avito.android.evidence_request.mvi.evidence_details.mvi.r;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.s;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceDetailsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final s f149008a;

    public j(s sVar) {
        this.f149008a = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((r) this.f149008a.get(), null, 2, null);
    }
}
