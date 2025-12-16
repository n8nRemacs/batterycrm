package com.avito.android.comfortable_deal.end_deal.mvi;

import Hp.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EndDealOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "LHp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements t<EndDealInternalAction, Hp.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Hp.b b(EndDealInternalAction endDealInternalAction) {
        EndDealInternalAction endDealInternalAction2 = endDealInternalAction;
        if (endDealInternalAction2 instanceof EndDealInternalAction.OpenCalendarClicked) {
            return new b.C0441b(((EndDealInternalAction.OpenCalendarClicked) endDealInternalAction2).f122319b);
        }
        if (endDealInternalAction2 instanceof EndDealInternalAction.Close) {
            return new b.a(((EndDealInternalAction.Close) endDealInternalAction2).f122311b);
        }
        if (endDealInternalAction2 instanceof EndDealInternalAction.SubmitFormFinished) {
            return new b.a(new EndDealResult(StagesTransitionResultStrategy.f122959b, null));
        }
        if (endDealInternalAction2 instanceof EndDealInternalAction.SubmitFormError) {
            return new b.d(com.avito.android.printable_text.b.c(R.string.comfortable_deal_end_deal_submit_error, new Serializable[0]));
        }
        if (endDealInternalAction2 instanceof EndDealInternalAction.UpdateChipValue) {
            EndDealInternalAction.UpdateChipValue updateChipValue = (EndDealInternalAction.UpdateChipValue) endDealInternalAction2;
            if (L.f(updateChipValue.f122328c, "sold_type_other") && !updateChipValue.f122329d) {
                return new b.e(com.avito.android.printable_text.b.c(R.string.end_deal_other, new Serializable[0]));
            }
        } else if (endDealInternalAction2 instanceof EndDealInternalAction.OpenDeeplink) {
            EndDealInternalAction.OpenDeeplink openDeeplink = (EndDealInternalAction.OpenDeeplink) endDealInternalAction2;
            return new b.c(openDeeplink.f122320b, openDeeplink.f122321c);
        }
        return null;
    }
}
