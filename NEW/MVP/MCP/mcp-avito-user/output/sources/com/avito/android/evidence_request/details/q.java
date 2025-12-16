package com.avito.android.evidence_request.details;

import com.avito.android.evidence_request.details.h;
import com.avito.android.remote.model.confirmation.EvidenceConfirmationResult;
import kotlin.Metadata;

/* compiled from: EvidenceDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f148554b;

    public q(h hVar) {
        this.f148554b = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        h hVar = this.f148554b;
        hVar.f148509Y.setValue(new h.c.C4349c(((EvidenceConfirmationResult) obj).getMessage()));
    }
}
