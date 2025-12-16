package com.avito.android.safedeal.delivery.order_cancellation.mvi;

import Hn0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.mvi.entity.RdsOrderCancellationReasonsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RdsOrderCancellationReasonsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "LHn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements t<RdsOrderCancellationReasonsInternalAction, Hn0.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Hn0.b b(RdsOrderCancellationReasonsInternalAction rdsOrderCancellationReasonsInternalAction) {
        RdsOrderCancellationReasonsInternalAction rdsOrderCancellationReasonsInternalAction2 = rdsOrderCancellationReasonsInternalAction;
        if (rdsOrderCancellationReasonsInternalAction2 instanceof RdsOrderCancellationReasonsInternalAction.ReasonClick) {
            RdsOrderCancellationReasonsInternalAction.ReasonClick reasonClick = (RdsOrderCancellationReasonsInternalAction.ReasonClick) rdsOrderCancellationReasonsInternalAction2;
            ReasonRds reasonRds = reasonClick.f256388b;
            return reasonRds != null ? new b.C0437b(reasonRds, reasonClick.f256389c) : b.c.f7702a;
        }
        if (rdsOrderCancellationReasonsInternalAction2 instanceof RdsOrderCancellationReasonsInternalAction.CloseScreen) {
            return b.a.f7699a;
        }
        return null;
    }
}
