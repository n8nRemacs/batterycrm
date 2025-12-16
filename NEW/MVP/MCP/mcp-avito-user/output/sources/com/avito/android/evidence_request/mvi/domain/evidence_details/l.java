package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceFormParameters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/l;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<ParameterSlot> f148707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30389i f148708b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k List<? extends ParameterSlot> list, @Y61.k C30389i c30389i) {
        this.f148707a = list;
        this.f148708b = c30389i;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f148707a, lVar.f148707a) && L.f(this.f148708b, lVar.f148708b);
    }

    public final int hashCode() {
        return this.f148708b.hashCode() + (this.f148707a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "EvidenceFormParameters(slots=" + this.f148707a + ", filesConstraints=" + this.f148708b + ')';
    }
}
