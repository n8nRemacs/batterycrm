package com.avito.android.evidence_request.details.validation;

import com.avito.android.evidence_request.AppealId;
import com.avito.android.remote.K;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EvidenceValidationFormRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/validation/m;", "Lcom/avito/android/evidence_request/details/validation/k;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K f148580a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AppealId f148581b;

    @Inject
    public m(@Y61.k K k12, @Y61.k AppealId appealId) {
        this.f148580a = k12;
        this.f148581b = appealId;
    }

    @Override // com.avito.android.evidence_request.details.validation.k
    @Y61.k
    public final O a() {
        return this.f148580a.c(this.f148581b.f148208d.f253042b).r(l.f148579b);
    }
}
