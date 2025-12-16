package com.avito.android.order.feature.mvi;

import P40.b;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrderOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/order/feature/mvi/x;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "LP40/b;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x implements com.avito.android.arch.mvi.t<OrderInternalAction, P40.b> {
    @Inject
    public x() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final P40.b b(OrderInternalAction orderInternalAction) {
        String str;
        OrderInternalAction orderInternalAction2 = orderInternalAction;
        if (orderInternalAction2 instanceof OrderInternalAction.ExecuteRequestFailed) {
            return new b.a(((OrderInternalAction.ExecuteRequestFailed) orderInternalAction2).f209628b);
        }
        if (!(orderInternalAction2 instanceof OrderInternalAction.UniversalMapSelectFailure) || (str = ((OrderInternalAction.UniversalMapSelectFailure) orderInternalAction2).f209634b) == null) {
            return null;
        }
        return new b.C0830b(str);
    }
}
