package com.avito.android.comfortable_deal.submitting.success.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.submitting.success.mvi.entity.SubmittingSuccessInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rq.InterfaceC47709b;

/* compiled from: SubmittingSuccessOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction;", "Lrq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements t<SubmittingSuccessInternalAction, InterfaceC47709b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47709b b(SubmittingSuccessInternalAction submittingSuccessInternalAction) {
        SubmittingSuccessInternalAction submittingSuccessInternalAction2 = submittingSuccessInternalAction;
        if (submittingSuccessInternalAction2 instanceof SubmittingSuccessInternalAction.OpenDeepLink) {
            return new InterfaceC47709b.a(((SubmittingSuccessInternalAction.OpenDeepLink) submittingSuccessInternalAction2).f123422b);
        }
        if (submittingSuccessInternalAction2 instanceof SubmittingSuccessInternalAction.ContentLoaded) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
