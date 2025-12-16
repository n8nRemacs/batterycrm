package com.avito.android.auto_select.confirmation_dialog.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.auto_select.confirmation_dialog.mvi.entity.AutoSelectConfirmationBottomSheetInternalAction;
import com.avito.android.auto_select.confirmation_dialog.mvi.entity.AutoSelectConfirmationBottomSheetState;
import com.avito.android.deep_linking.links.AutoSelectContactConfirmation;
import com.avito.android.deep_linking.links.Button;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AutoSelectConfirmationBottomSheetReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetInternalAction;", "Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetState;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<AutoSelectConfirmationBottomSheetInternalAction, AutoSelectConfirmationBottomSheetState> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AutoSelectConfirmationBottomSheetState a(AutoSelectConfirmationBottomSheetInternalAction autoSelectConfirmationBottomSheetInternalAction, AutoSelectConfirmationBottomSheetState autoSelectConfirmationBottomSheetState) {
        AutoSelectConfirmationBottomSheetInternalAction autoSelectConfirmationBottomSheetInternalAction2 = autoSelectConfirmationBottomSheetInternalAction;
        AutoSelectConfirmationBottomSheetState autoSelectConfirmationBottomSheetState2 = autoSelectConfirmationBottomSheetState;
        if (!(autoSelectConfirmationBottomSheetInternalAction2 instanceof AutoSelectConfirmationBottomSheetInternalAction.ContentLoaded)) {
            if (autoSelectConfirmationBottomSheetInternalAction2 instanceof AutoSelectConfirmationBottomSheetInternalAction.DeeplinkClicked) {
                return autoSelectConfirmationBottomSheetState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        AutoSelectContactConfirmation autoSelectContactConfirmation = ((AutoSelectConfirmationBottomSheetInternalAction.ContentLoaded) autoSelectConfirmationBottomSheetInternalAction2).f95901b;
        String title = autoSelectContactConfirmation.getTitle();
        AttributedText text = autoSelectContactConfirmation.getText();
        Button button = autoSelectContactConfirmation.getButton();
        return new AutoSelectConfirmationBottomSheetState(title, text, button != null ? new AutoSelectConfirmationBottomSheetState.Button(button.getText(), button.getUri()) : null);
    }
}
