package com.avito.android.mortgage.pre_approval.form.mvi;

import Q00.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PreApprovalFormEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "LQ00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements t<PreApprovalFormInternalAction, Q00.b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Q00.b b(PreApprovalFormInternalAction preApprovalFormInternalAction) {
        Q00.b eVar;
        PreApprovalFormInternalAction preApprovalFormInternalAction2 = preApprovalFormInternalAction;
        if (preApprovalFormInternalAction2 instanceof PreApprovalFormInternalAction.CloseFlow) {
            return b.a.f13415a;
        }
        if (preApprovalFormInternalAction2 instanceof PreApprovalFormInternalAction.OpenAuthorization) {
            return b.c.f13417a;
        }
        if (preApprovalFormInternalAction2 instanceof PreApprovalFormInternalAction.NextScreen) {
            eVar = new b.d(((PreApprovalFormInternalAction.NextScreen) preApprovalFormInternalAction2).f201921b);
        } else {
            if (!(preApprovalFormInternalAction2 instanceof PreApprovalFormInternalAction.SelectOptionsClick)) {
                if (preApprovalFormInternalAction2 instanceof PreApprovalFormInternalAction.UpdateValidationResult ? true : preApprovalFormInternalAction2 instanceof PreApprovalFormInternalAction.PreviousStep) {
                    return b.C0880b.f13416a;
                }
                return null;
            }
            eVar = new b.e(((PreApprovalFormInternalAction.SelectOptionsClick) preApprovalFormInternalAction2).f201925b);
        }
        return eVar;
    }
}
