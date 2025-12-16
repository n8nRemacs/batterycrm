package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import Fz0.InterfaceC13859b;
import com.avito.android.arch.mvi.t;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerOrdersRangeOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "LFz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<StrSellerOrdersRangeInternalAction, InterfaceC13859b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13859b b(StrSellerOrdersRangeInternalAction strSellerOrdersRangeInternalAction) {
        StrSellerOrdersRangeInternalAction strSellerOrdersRangeInternalAction2 = strSellerOrdersRangeInternalAction;
        if (strSellerOrdersRangeInternalAction2 instanceof StrSellerOrdersRangeInternalAction.HandleDeeplink) {
            return new InterfaceC13859b.C0319b(((StrSellerOrdersRangeInternalAction.HandleDeeplink) strSellerOrdersRangeInternalAction2).f290273b);
        }
        if (strSellerOrdersRangeInternalAction2 instanceof StrSellerOrdersRangeInternalAction.CloseScreen) {
            return InterfaceC13859b.a.f6113a;
        }
        return null;
    }
}
