package com.avito.android.active_orders_common.items.order;

import com.avito.android.activeOrders.ItemContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderItemMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/active_orders_common/items/order/d;", "Lcom/avito/android/active_orders_common/items/order/c;", "<init>", "()V", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.active_orders_common.items.order.c
    @Y61.k
    public final OrderItemImpl a(@Y61.k ItemContent itemContent, int i12) {
        String strValueOf = String.valueOf(i12);
        String title = itemContent.getTitle();
        AttributedText subtitle = itemContent.getSubtitle();
        Image image = itemContent.getImage();
        DeepLink onTapDeepLink = itemContent.getOnTapDeepLink();
        Boolean isMultipleItems = itemContent.getIsMultipleItems();
        return new OrderItemImpl(strValueOf, title, subtitle, image, onTapDeepLink, isMultipleItems != null ? isMultipleItems.booleanValue() : false, itemContent.getAttentionBadgeText());
    }
}
