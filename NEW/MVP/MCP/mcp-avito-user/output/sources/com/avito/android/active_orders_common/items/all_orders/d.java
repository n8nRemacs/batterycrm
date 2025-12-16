package com.avito.android.active_orders_common.items.all_orders;

import com.avito.android.R;
import com.avito.android.activeOrders.ItemContent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AllOrdersItemMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/active_orders_common/items/all_orders/d;", "Lcom/avito/android/active_orders_common/items/all_orders/c;", "<init>", "()V", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.c
    @Y61.k
    public final AllOrdersItemImpl a(@Y61.k ItemContent itemContent, int i12) {
        return new AllOrdersItemImpl(String.valueOf(i12), itemContent.getTitle(), itemContent.getOnTapDeepLink(), new Icon(Integer.valueOf(R.attr.ic_arrowRight16), Integer.valueOf(R.attr.black)));
    }
}
