package com.avito.android.str_seller_orders.orders.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.str_seller_orders.orders.mvi.entity.StrOrdersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mz0.InterfaceC44157b;

/* compiled from: StrOrdersOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "Lmz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements t<StrOrdersInternalAction, InterfaceC44157b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44157b b(StrOrdersInternalAction strOrdersInternalAction) {
        if (strOrdersInternalAction instanceof StrOrdersInternalAction.CloseScreen) {
            return InterfaceC44157b.a.f414838a;
        }
        return null;
    }
}
