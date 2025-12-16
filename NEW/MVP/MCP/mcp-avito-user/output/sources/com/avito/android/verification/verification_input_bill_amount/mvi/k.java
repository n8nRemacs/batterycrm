package com.avito.android.verification.verification_input_bill_amount.mvi;

import UM0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.verification.verification_input_bill_amount.mvi.entity.InputBillAmountInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InputBillAmountOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/verification/verification_input_bill_amount/mvi/entity/InputBillAmountInternalAction;", "LUM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements t<InputBillAmountInternalAction, UM0.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final UM0.b b(InputBillAmountInternalAction inputBillAmountInternalAction) {
        InputBillAmountInternalAction inputBillAmountInternalAction2 = inputBillAmountInternalAction;
        if (inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.ShowErrorToast) {
            return new b.C1119b(((InputBillAmountInternalAction.ShowErrorToast) inputBillAmountInternalAction2).f325573b);
        }
        if (inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.FinishActivity) {
            return b.a.f16357a;
        }
        if (inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.Loading ? true : inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.Loaded ? true : inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.Error ? true : inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.InputValidationFailed ? true : inputBillAmountInternalAction2 instanceof InputBillAmountInternalAction.SetButtonLoading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
