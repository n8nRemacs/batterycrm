package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacFinishedFeedbackScreenReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements u<IacFinishedFeedbackScreenInternalAction, IacFinishedFeedbackScreenState> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final IacFinishedFeedbackScreenState a(IacFinishedFeedbackScreenInternalAction iacFinishedFeedbackScreenInternalAction, IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState) {
        IacFinishedFeedbackScreenInternalAction iacFinishedFeedbackScreenInternalAction2 = iacFinishedFeedbackScreenInternalAction;
        IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState2 = iacFinishedFeedbackScreenState;
        if ((iacFinishedFeedbackScreenInternalAction2 instanceof IacFinishedFeedbackScreenInternalAction.SendDisplayBottomSheetEvent) || (iacFinishedFeedbackScreenInternalAction2 instanceof IacFinishedFeedbackScreenInternalAction.SendCloseScreenEvent)) {
            return iacFinishedFeedbackScreenState2;
        }
        if (!(iacFinishedFeedbackScreenInternalAction2 instanceof IacFinishedFeedbackScreenInternalAction.UpdateState)) {
            throw new NoWhenBranchMatchedException();
        }
        IacFinishedFeedbackScreenInternalAction.UpdateState updateState = (IacFinishedFeedbackScreenInternalAction.UpdateState) iacFinishedFeedbackScreenInternalAction2;
        Integer selectedRating = updateState.f166684b;
        if (selectedRating == null) {
            selectedRating = iacFinishedFeedbackScreenState2.getSelectedRating();
        }
        Integer num = selectedRating;
        Boolean bool = updateState.f166685c;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : iacFinishedFeedbackScreenState2.isRatingClickable();
        Integer selectedProblemIndex = updateState.f166686d;
        if (selectedProblemIndex == null) {
            selectedProblemIndex = iacFinishedFeedbackScreenState2.getSelectedProblemIndex();
        }
        return IacFinishedFeedbackScreenState.copy$default(iacFinishedFeedbackScreenState2, num, zBooleanValue, selectedProblemIndex, null, 8, null);
    }
}
