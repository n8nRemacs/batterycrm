package com.avito.android.mortgage.selected_appeal.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.selected_appeal.mvi.entity.SelectedAppealInternalAction;
import javax.inject.Inject;
import k10.C42473c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectedAppealReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealInternalAction;", "Lk10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements u<SelectedAppealInternalAction, C42473c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C42473c a(SelectedAppealInternalAction selectedAppealInternalAction, C42473c c42473c) {
        SelectedAppealInternalAction selectedAppealInternalAction2 = selectedAppealInternalAction;
        C42473c c42473c2 = c42473c;
        if (selectedAppealInternalAction2 instanceof SelectedAppealInternalAction.UnselectAppealLoadingStarted) {
            return C42473c.a(c42473c2, true);
        }
        if (selectedAppealInternalAction2 instanceof SelectedAppealInternalAction.UnselectAppealLoadingCompleted) {
            return C42473c.a(c42473c2, false);
        }
        if (selectedAppealInternalAction2 instanceof SelectedAppealInternalAction.UnselectAppealLoadingFailed) {
            return C42473c.a(c42473c2, false);
        }
        if (selectedAppealInternalAction2 instanceof SelectedAppealInternalAction.Dismiss) {
            return c42473c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
