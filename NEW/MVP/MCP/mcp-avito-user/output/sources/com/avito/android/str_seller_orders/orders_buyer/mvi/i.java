package com.avito.android.str_seller_orders.orders_buyer.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.StrOrdersBuyerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import pz0.InterfaceC47172c;

/* compiled from: StrOrdersBuyerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "Lpz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements t<StrOrdersBuyerInternalAction, InterfaceC47172c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47172c b(StrOrdersBuyerInternalAction strOrdersBuyerInternalAction) {
        StrOrdersBuyerInternalAction strOrdersBuyerInternalAction2 = strOrdersBuyerInternalAction;
        if (strOrdersBuyerInternalAction2 instanceof StrOrdersBuyerInternalAction.CloseScreen) {
            return InterfaceC47172c.a.f428928a;
        }
        if (strOrdersBuyerInternalAction2 instanceof StrOrdersBuyerInternalAction.OpenDeeplink) {
            return new InterfaceC47172c.b(((StrOrdersBuyerInternalAction.OpenDeeplink) strOrdersBuyerInternalAction2).f289086b);
        }
        return null;
    }
}
