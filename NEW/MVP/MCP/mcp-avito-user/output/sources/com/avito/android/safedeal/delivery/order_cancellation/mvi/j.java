package com.avito.android.safedeal.delivery.order_cancellation.mvi;

import Hn0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.safedeal.delivery.order_cancellation.mvi.entity.RdsOrderCancellationReasonsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RdsOrderCancellationReasonsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "LHn0/c;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements u<RdsOrderCancellationReasonsInternalAction, Hn0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Hn0.c a(RdsOrderCancellationReasonsInternalAction rdsOrderCancellationReasonsInternalAction, Hn0.c cVar) {
        Hn0.c cVar2;
        RdsOrderCancellationReasonsInternalAction rdsOrderCancellationReasonsInternalAction2 = rdsOrderCancellationReasonsInternalAction;
        Hn0.c cVar3 = cVar;
        if (rdsOrderCancellationReasonsInternalAction2 instanceof RdsOrderCancellationReasonsInternalAction.LoadingStarted) {
            return new Hn0.c(c.a.C0439c.f7708a);
        }
        if (rdsOrderCancellationReasonsInternalAction2 instanceof RdsOrderCancellationReasonsInternalAction.Loaded) {
            RdsOrderCancellationReasonsInternalAction.Loaded loaded = (RdsOrderCancellationReasonsInternalAction.Loaded) rdsOrderCancellationReasonsInternalAction2;
            cVar2 = new Hn0.c(new c.a.C0438a(loaded.f256384b, loaded.f256385c, loaded.f256386d));
        } else {
            if (!(rdsOrderCancellationReasonsInternalAction2 instanceof RdsOrderCancellationReasonsInternalAction.LoadedError)) {
                return cVar3;
            }
            cVar2 = new Hn0.c(new c.a.b(((RdsOrderCancellationReasonsInternalAction.LoadedError) rdsOrderCancellationReasonsInternalAction2).f256387b));
        }
        return cVar2;
    }
}
