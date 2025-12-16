package com.avito.android.mortgage.verification_flow.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.verification_flow.mvi.entity.VerificationFlowInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import s10.InterfaceC47958b;

/* compiled from: VerificationFlowEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/verification_flow/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/verification_flow/mvi/entity/VerificationFlowInternalAction;", "Ls10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements t<VerificationFlowInternalAction, InterfaceC47958b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47958b b(VerificationFlowInternalAction verificationFlowInternalAction) {
        InterfaceC47958b.C12606b c12606b;
        VerificationFlowInternalAction verificationFlowInternalAction2 = verificationFlowInternalAction;
        if (verificationFlowInternalAction2 instanceof VerificationFlowInternalAction.BackClick) {
            return InterfaceC47958b.a.f437289a;
        }
        if (verificationFlowInternalAction2 instanceof VerificationFlowInternalAction.PrimaryActionClicked) {
            c12606b = new InterfaceC47958b.C12606b(((VerificationFlowInternalAction.PrimaryActionClicked) verificationFlowInternalAction2).f203917b);
        } else {
            if (!(verificationFlowInternalAction2 instanceof VerificationFlowInternalAction.SecondaryActionClicked)) {
                return null;
            }
            c12606b = new InterfaceC47958b.C12606b(((VerificationFlowInternalAction.SecondaryActionClicked) verificationFlowInternalAction2).f203918b);
        }
        return c12606b;
    }
}
