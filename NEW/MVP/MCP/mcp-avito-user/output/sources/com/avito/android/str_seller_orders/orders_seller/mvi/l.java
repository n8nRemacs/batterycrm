package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import tz0.InterfaceC48746b;

/* compiled from: StrSellerOrdersOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Ltz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements t<StrSellerOrdersInternalAction, InterfaceC48746b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48746b b(StrSellerOrdersInternalAction strSellerOrdersInternalAction) {
        StrSellerOrdersInternalAction strSellerOrdersInternalAction2 = strSellerOrdersInternalAction;
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.OpenDeeplink) {
            return new InterfaceC48746b.C12698b(((StrSellerOrdersInternalAction.OpenDeeplink) strSellerOrdersInternalAction2).f289570b);
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.CloseScreen) {
            return InterfaceC48746b.a.f439712a;
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.OpenFilters) {
            return new InterfaceC48746b.c(((StrSellerOrdersInternalAction.OpenFilters) strSellerOrdersInternalAction2).f289571b);
        }
        return null;
    }
}
