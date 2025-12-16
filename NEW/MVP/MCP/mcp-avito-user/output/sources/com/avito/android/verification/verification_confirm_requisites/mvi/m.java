package com.avito.android.verification.verification_confirm_requisites.mvi;

import LM0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.verification.verification_confirm_requisites.mvi.entity.ConfirmRequisitesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConfirmRequisitesOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/verification/verification_confirm_requisites/mvi/entity/ConfirmRequisitesInternalAction;", "LLM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements t<ConfirmRequisitesInternalAction, LM0.b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final LM0.b b(ConfirmRequisitesInternalAction confirmRequisitesInternalAction) {
        ConfirmRequisitesInternalAction confirmRequisitesInternalAction2 = confirmRequisitesInternalAction;
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.ShowErrorToast) {
            return new b.d(((ConfirmRequisitesInternalAction.ShowErrorToast) confirmRequisitesInternalAction2).f324980b);
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.OpenBottomSheet) {
            return new b.c(((ConfirmRequisitesInternalAction.OpenBottomSheet) confirmRequisitesInternalAction2).f324977b);
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.NavigateBack) {
            return b.C0612b.f9932a;
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.FinishActivity) {
            return b.a.f9931a;
        }
        if (confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.Loading ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.Loaded ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.InputValidationFailed ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.Error ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.UpdateListState ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.BottomSheetItemSelect ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.SetButtonLoading ? true : confirmRequisitesInternalAction2 instanceof ConfirmRequisitesInternalAction.DoNothing) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
