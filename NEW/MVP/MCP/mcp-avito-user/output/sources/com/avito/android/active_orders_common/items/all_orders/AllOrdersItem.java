package com.avito.android.active_orders_common.items.all_orders;

import Y61.l;
import com.avito.android.active_orders_common.items.common.ActiveOrderItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AllOrdersItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/all_orders/AllOrdersItem;", "Lcom/avito/android/active_orders_common/items/common/ActiveOrderItem;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AllOrdersItem extends ActiveOrderItem {

    /* compiled from: AllOrdersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    /* renamed from: getDeeplink */
    DeepLink getF68297d();

    @l
    /* renamed from: getIcon */
    Icon getF68298e();

    @l
    /* renamed from: getTitle */
    String getF68296c();
}
