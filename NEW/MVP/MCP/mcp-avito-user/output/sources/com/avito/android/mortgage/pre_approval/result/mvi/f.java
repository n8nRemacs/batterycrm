package com.avito.android.mortgage.pre_approval.result.mvi;

import W00.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.deeplink.MortgageApplicationLink;
import com.avito.android.mortgage.pre_approval.result.mvi.entity.PreApprovalResultInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PreApprovalResultEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultInternalAction;", "LW00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements t<PreApprovalResultInternalAction, W00.c> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final W00.c b(PreApprovalResultInternalAction preApprovalResultInternalAction) {
        PreApprovalResultInternalAction preApprovalResultInternalAction2 = preApprovalResultInternalAction;
        if (preApprovalResultInternalAction2 instanceof PreApprovalResultInternalAction.GetApplicationLoadingFailed) {
            return new c.C1220c(((PreApprovalResultInternalAction.GetApplicationLoadingFailed) preApprovalResultInternalAction2).f202123b);
        }
        if (preApprovalResultInternalAction2 instanceof PreApprovalResultInternalAction.CloseFlow) {
            return c.a.f17545a;
        }
        if (preApprovalResultInternalAction2 instanceof PreApprovalResultInternalAction.GetApplicationLoadingCompleted) {
            return new c.b(new MortgageApplicationLink(((PreApprovalResultInternalAction.GetApplicationLoadingCompleted) preApprovalResultInternalAction2).f202122b));
        }
        return null;
    }
}
