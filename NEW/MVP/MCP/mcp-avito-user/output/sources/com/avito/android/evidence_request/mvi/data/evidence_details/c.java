package com.avito.android.evidence_request.mvi.data.evidence_details;

import Y61.k;
import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.remote.K;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EvidenceValidationFormRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/data/evidence_details/c;", "Lcom/avito/android/evidence_request/mvi/data/evidence_details/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final K f148642a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AppealId f148643b;

    @Inject
    public c(@k K k12, @k AppealId appealId) {
        this.f148642a = k12;
        this.f148643b = appealId;
    }

    @Override // com.avito.android.evidence_request.mvi.data.evidence_details.a
    @k
    public final O a() {
        return this.f148642a.c(this.f148643b.f148725d.f253042b).r(b.f148641b);
    }
}
