package com.avito.android.evidence_request.mvi.evidence_request.mvi;

import com.avito.android.evidence_request.mvi.evidence_request.mvi.entity.EvidenceRequestState;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f149149a;

    /* renamed from: b, reason: collision with root package name */
    public final g f149150b;

    public e(b bVar, g gVar) {
        this.f149149a = bVar;
        this.f149150b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f149149a.get();
        this.f149150b.getClass();
        f fVar = new f();
        EvidenceRequestState.f149152c.getClass();
        return new d("EvidenceRequest", EvidenceRequestState.f149153d, new c(aVar, fVar));
    }
}
