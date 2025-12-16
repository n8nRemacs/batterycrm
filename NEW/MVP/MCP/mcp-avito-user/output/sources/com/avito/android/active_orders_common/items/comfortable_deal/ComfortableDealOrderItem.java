package com.avito.android.active_orders_common.items.comfortable_deal;

import Y61.k;
import Y61.l;
import com.avito.android.active_orders_common.items.common.ActiveOrderItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ComfortableDealItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/comfortable_deal/ComfortableDealOrderItem;", "Lcom/avito/android/active_orders_common/items/common/ActiveOrderItem;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ComfortableDealOrderItem extends ActiveOrderItem {

    /* compiled from: ComfortableDealItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    BannerPayload E3();

    @l
    Image H1();

    boolean b4();

    @k
    DeepLink getDeepLink();

    @l
    AttributedText getDescription();

    @k
    DeepLink getOnShowDeeplink();

    @l
    String getTitle();

    @l
    String u2();

    @l
    Image v0();
}
