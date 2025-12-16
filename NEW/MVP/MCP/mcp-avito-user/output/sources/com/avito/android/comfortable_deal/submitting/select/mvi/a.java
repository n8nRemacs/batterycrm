package com.avito.android.comfortable_deal.submitting.select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.submitting.select.mvi.entity.SubmittingSelectInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import pq.InterfaceC47128b;

/* compiled from: SubmittingSelectOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/a;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "Lpq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements t<SubmittingSelectInternalAction, InterfaceC47128b> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47128b b(SubmittingSelectInternalAction submittingSelectInternalAction) {
        InterfaceC47128b cVar;
        SubmittingSelectInternalAction submittingSelectInternalAction2 = submittingSelectInternalAction;
        if (submittingSelectInternalAction2.equals(SubmittingSelectInternalAction.NavigateBack.f123343b)) {
            return new InterfaceC47128b.a(false);
        }
        if (submittingSelectInternalAction2 instanceof SubmittingSelectInternalAction.NavigateNext) {
            DeepLink deepLink = ((SubmittingSelectInternalAction.NavigateNext) submittingSelectInternalAction2).f123344b;
            if (deepLink == null) {
                return new InterfaceC47128b.a(true);
            }
            cVar = new InterfaceC47128b.C12292b(deepLink);
        } else {
            if (!(submittingSelectInternalAction2 instanceof SubmittingSelectInternalAction.OpenBottomSheetWithDetails)) {
                return null;
            }
            cVar = new InterfaceC47128b.c(((SubmittingSelectInternalAction.OpenBottomSheetWithDetails) submittingSelectInternalAction2).f123345b);
        }
        return cVar;
    }
}
