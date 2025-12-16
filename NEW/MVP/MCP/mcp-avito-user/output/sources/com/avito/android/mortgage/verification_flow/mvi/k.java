package com.avito.android.mortgage.verification_flow.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.api.model.MortgageVerificationFlow;
import com.avito.android.mortgage.verification_flow.mvi.entity.VerificationFlowInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import s10.C47959c;

/* compiled from: VerificationFlowReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "Ls10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<VerificationFlowInternalAction, C47959c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r10.c f203930b;

    @Inject
    public k(@Y61.k r10.c cVar) {
        this.f203930b = cVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C47959c a(VerificationFlowInternalAction verificationFlowInternalAction, C47959c c47959c) {
        VerificationFlowInternalAction verificationFlowInternalAction2 = verificationFlowInternalAction;
        C47959c c47959c2 = c47959c;
        if (verificationFlowInternalAction2 instanceof VerificationFlowInternalAction.Init) {
            MortgageVerificationFlow mortgageVerificationFlow = ((VerificationFlowInternalAction.Init) verificationFlowInternalAction2).f203916b.f203901c;
            c47959c2 = new C47959c(mortgageVerificationFlow.getImageUrl(), mortgageVerificationFlow.getTitle(), mortgageVerificationFlow.getDescription(), mortgageVerificationFlow.getPrimaryAction(), mortgageVerificationFlow.getSecondaryAction());
        }
        this.f203930b.a(verificationFlowInternalAction2);
        return c47959c2;
    }
}
