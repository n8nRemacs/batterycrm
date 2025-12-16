package com.avito.android.advert_details_items.sellerprofile.subscription;

import Y61.k;
import Y61.l;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import kotlin.Metadata;

/* compiled from: SellerSubscriptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/subscription/SellerSubscriptionItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface SellerSubscriptionItem extends PersistableSpannedItem {

    /* compiled from: SellerSubscriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    SellerSubscriptionState O4();

    @k
    String o4();

    @l
    SellerNotificationsState q4();

    @k
    SellerSubscriptionItem s3(@l SellerSubscriptionState sellerSubscriptionState, @l SellerNotificationsState sellerNotificationsState);
}
