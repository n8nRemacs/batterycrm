package com.avito.android.evidence_request.mvi.evidence_request.mvi;

import Yz.InterfaceC18350b;
import com.avito.android.arch.mvi.t;
import com.avito.android.evidence_request.mvi.evidence_request.mvi.entity.EvidenceRequestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EvidenceRequestOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/evidence_request/mvi/evidence_request/mvi/entity/EvidenceRequestInternalAction;", "LYz/b;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements t<EvidenceRequestInternalAction, InterfaceC18350b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC18350b b(EvidenceRequestInternalAction evidenceRequestInternalAction) {
        EvidenceRequestInternalAction evidenceRequestInternalAction2 = evidenceRequestInternalAction;
        if (evidenceRequestInternalAction2 instanceof EvidenceRequestInternalAction.OpenScreen) {
            return new InterfaceC18350b.a(((EvidenceRequestInternalAction.OpenScreen) evidenceRequestInternalAction2).f149151b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
