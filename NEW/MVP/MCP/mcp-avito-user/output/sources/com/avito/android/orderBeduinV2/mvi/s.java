package com.avito.android.orderBeduinV2.mvi;

import U40.b;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "LU40/b;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements com.avito.android.arch.mvi.t<OrderInternalAction, U40.b> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final U40.b b(OrderInternalAction orderInternalAction) {
        OrderInternalAction orderInternalAction2 = orderInternalAction;
        if (orderInternalAction2 instanceof OrderInternalAction.ContentLoaded) {
            return new b.C1097b(((OrderInternalAction.ContentLoaded) orderInternalAction2).f209874b);
        }
        if (orderInternalAction2 instanceof OrderInternalAction.HandleBeduinEvent) {
            return new b.a(((OrderInternalAction.HandleBeduinEvent) orderInternalAction2).f209876b);
        }
        return null;
    }
}
