package com.avito.android.evidence_request.mvi.evidence_request.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.evidence_request.mvi.domain.evidence_request.EvidenceContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceRequestInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "OpenScreen", "Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestInternalAction$OpenScreen;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EvidenceRequestInternalAction extends n {

    /* compiled from: EvidenceRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestInternalAction$OpenScreen;", "Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements EvidenceRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EvidenceContent f149151b;

        public OpenScreen(@k EvidenceContent evidenceContent) {
            this.f149151b = evidenceContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenScreen) && L.f(this.f149151b, ((OpenScreen) obj).f149151b);
        }

        public final int hashCode() {
            return this.f149151b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(data=" + this.f149151b + ')';
        }
    }
}
