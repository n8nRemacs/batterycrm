package com.avito.android.cpx_promo.delayedstart.mvi;

import androidx.compose.runtime.internal.P;
import bs.InterfaceC25699b;
import com.avito.android.arch.mvi.t;
import com.avito.android.cpx_promo.delayedstart.mvi.entity.CpxPromoDelayedStartInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpxPromoDelayedStartOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cpx_promo/delayedstart/mvi/entity/CpxPromoDelayedStartInternalAction;", "Lbs/b;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements t<CpxPromoDelayedStartInternalAction, InterfaceC25699b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25699b b(CpxPromoDelayedStartInternalAction cpxPromoDelayedStartInternalAction) {
        CpxPromoDelayedStartInternalAction cpxPromoDelayedStartInternalAction2 = cpxPromoDelayedStartInternalAction;
        if (cpxPromoDelayedStartInternalAction2 instanceof CpxPromoDelayedStartInternalAction.OpenDeeplink) {
            return new InterfaceC25699b.C2020b(((CpxPromoDelayedStartInternalAction.OpenDeeplink) cpxPromoDelayedStartInternalAction2).f126862b);
        }
        if (cpxPromoDelayedStartInternalAction2 instanceof CpxPromoDelayedStartInternalAction.Close) {
            return InterfaceC25699b.a.f57495a;
        }
        return null;
    }
}
