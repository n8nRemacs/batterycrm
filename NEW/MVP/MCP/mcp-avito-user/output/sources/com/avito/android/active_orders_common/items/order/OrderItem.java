package com.avito.android.active_orders_common.items.order;

import com.avito.android.active_orders_common.items.common.ActiveOrderItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: OrderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/order/OrderItem;", "Lcom/avito/android/active_orders_common/items/common/ActiveOrderItem;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface OrderItem extends ActiveOrderItem {

    /* compiled from: OrderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    /* renamed from: getAttentionBadgeText */
    String getF68372h();

    @Y61.l
    /* renamed from: getDeepLink */
    DeepLink getF68370f();

    @Y61.l
    /* renamed from: getDescription */
    AttributedText getF68368d();

    @Y61.l
    /* renamed from: getImage */
    Image getF68369e();

    @Y61.l
    /* renamed from: getTitle */
    String getF68367c();

    /* renamed from: x4 */
    boolean getF68371g();
}
