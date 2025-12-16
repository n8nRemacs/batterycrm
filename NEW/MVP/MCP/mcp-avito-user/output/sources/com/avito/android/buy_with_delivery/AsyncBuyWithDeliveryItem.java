package com.avito.android.buy_with_delivery;

import Y61.k;
import com.avito.android.constructor_advert.ui.serp.constructor.BuyWithDeliveryLoadingState;
import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;

/* compiled from: AsyncBuyWithDeliveryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/buy_with_delivery/AsyncBuyWithDeliveryItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AsyncBuyWithDeliveryItem extends ParcelableItem {

    /* compiled from: AsyncBuyWithDeliveryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    BuyWithDeliveryLoadingState getBuyWithDeliveryLoadingState();
}
