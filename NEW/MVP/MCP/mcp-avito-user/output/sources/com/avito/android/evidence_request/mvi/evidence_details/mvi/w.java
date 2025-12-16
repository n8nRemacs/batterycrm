package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30384d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceDetailsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f149103a;

    public w(dagger.internal.u uVar) {
        this.f149103a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v((InterfaceC30384d) this.f149103a.get());
    }
}
