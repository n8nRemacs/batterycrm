package com.avito.android.orders.feature.beduin_orders_list.mvi;

import Z40.b;
import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinOrdersOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/u;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "LZ40/b;", "<init>", "()V", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements com.avito.android.arch.mvi.t<BeduinOrdersInternalAction, Z40.b> {
    @Inject
    public u() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Z40.b b(BeduinOrdersInternalAction beduinOrdersInternalAction) {
        BeduinOrdersInternalAction beduinOrdersInternalAction2 = beduinOrdersInternalAction;
        if (beduinOrdersInternalAction2 instanceof BeduinOrdersInternalAction.RefreshScreenFailed) {
            return new b.a(((BeduinOrdersInternalAction.RefreshScreenFailed) beduinOrdersInternalAction2).f210105b);
        }
        return null;
    }
}
