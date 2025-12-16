package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import WK.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacFinishedFeedbackScreenEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/e;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "LWK/b;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements t<IacFinishedFeedbackScreenInternalAction, WK.b> {
    @Inject
    public e() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final WK.b b(IacFinishedFeedbackScreenInternalAction iacFinishedFeedbackScreenInternalAction) {
        IacFinishedFeedbackScreenInternalAction iacFinishedFeedbackScreenInternalAction2 = iacFinishedFeedbackScreenInternalAction;
        if (iacFinishedFeedbackScreenInternalAction2 instanceof IacFinishedFeedbackScreenInternalAction.SendDisplayBottomSheetEvent) {
            return b.C1263b.f17860a;
        }
        if (iacFinishedFeedbackScreenInternalAction2 instanceof IacFinishedFeedbackScreenInternalAction.SendCloseScreenEvent) {
            return new b.a(((IacFinishedFeedbackScreenInternalAction.SendCloseScreenEvent) iacFinishedFeedbackScreenInternalAction2).f166682b);
        }
        if (iacFinishedFeedbackScreenInternalAction2 instanceof IacFinishedFeedbackScreenInternalAction.UpdateState) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
