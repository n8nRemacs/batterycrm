package com.avito.android.cpx_promo.delayedstart.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartContent;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartInternalAction;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpxPromoDelayedStartReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartState;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements u<CpxPromoDelayedStartInternalAction, CpxPromoDelayedStartState> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final CpxPromoDelayedStartState a(CpxPromoDelayedStartInternalAction cpxPromoDelayedStartInternalAction, CpxPromoDelayedStartState cpxPromoDelayedStartState) {
        CpxPromoDelayedStartInternalAction cpxPromoDelayedStartInternalAction2 = cpxPromoDelayedStartInternalAction;
        CpxPromoDelayedStartState cpxPromoDelayedStartState2 = cpxPromoDelayedStartState;
        if (!(cpxPromoDelayedStartInternalAction2 instanceof CpxPromoDelayedStartInternalAction.ShowContent)) {
            return cpxPromoDelayedStartState2;
        }
        CpxPromoDelayedStartContent cpxPromoDelayedStartContent = ((CpxPromoDelayedStartInternalAction.ShowContent) cpxPromoDelayedStartInternalAction2).f126863b;
        return new CpxPromoDelayedStartState(cpxPromoDelayedStartContent.getTitle(), cpxPromoDelayedStartContent.getDescription(), cpxPromoDelayedStartContent.getButton());
    }
}
