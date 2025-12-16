package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi;

import U50.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.entity.SelectVerticalInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectVerticalOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "LU50/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements t<SelectVerticalInternalAction, U50.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final U50.b b(SelectVerticalInternalAction selectVerticalInternalAction) {
        SelectVerticalInternalAction selectVerticalInternalAction2 = selectVerticalInternalAction;
        if (selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.Navigate) {
            return new b.a(((SelectVerticalInternalAction.Navigate) selectVerticalInternalAction2).f211959b);
        }
        if (selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.OpenDeepLink) {
            return new b.C1101b(((SelectVerticalInternalAction.OpenDeepLink) selectVerticalInternalAction2).f211960b);
        }
        if (selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.OpenVerticalDisablingInfoBottomSheet) {
            return new b.c(((SelectVerticalInternalAction.OpenVerticalDisablingInfoBottomSheet) selectVerticalInternalAction2).f211961b);
        }
        if (selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.ActionError) {
            return new b.d(((SelectVerticalInternalAction.ActionError) selectVerticalInternalAction2).f211954b);
        }
        if (selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.ShowToast) {
            return new b.e();
        }
        if (selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.ProfileConstructorLoaded ? true : selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.ProfileConstructorLoading ? true : selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.ProfileConstructorLoadingError ? true : selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.SelectVertical ? true : selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.EmptySelectError ? true : selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.FinishActionInProgress ? true : selectVerticalInternalAction2 instanceof SelectVerticalInternalAction.StartActionProgress) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
