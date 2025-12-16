package com.avito.android.evidence_request.mvi.proof_types.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProofTypesInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "OpenDetailsScreen", "Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesInternalAction$Back;", "Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesInternalAction$OpenDetailsScreen;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ProofTypesInternalAction extends n {

    /* compiled from: ProofTypesInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesInternalAction$Back;", "Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesInternalAction;", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Back implements ProofTypesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f149187b = new Back();

        private Back() {
        }
    }

    /* compiled from: ProofTypesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesInternalAction$OpenDetailsScreen;", "Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesInternalAction;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDetailsScreen implements ProofTypesInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f149188b;

        public OpenDetailsScreen(@k String str) {
            this.f149188b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDetailsScreen) && L.f(this.f149188b, ((OpenDetailsScreen) obj).f149188b);
        }

        public final int hashCode() {
            return this.f149188b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDetailsScreen(screenId="), this.f149188b, ')');
        }
    }
}
