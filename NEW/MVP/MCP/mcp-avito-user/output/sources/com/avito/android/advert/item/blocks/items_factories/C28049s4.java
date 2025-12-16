package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.sellersubscription.AdvertDetailsSellerSubscriptionItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSeller;
import com.avito.android.remote.model.SellerSubscriptionInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertDetailsSellerSubscriptionItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/s4;", "Lcom/avito/android/advert/item/blocks/items_factories/r4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.s4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28049s4 implements InterfaceC28043r4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74025a;

    @Inject
    public C28049s4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74025a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28043r4
    @Y61.l
    public final AdvertDetailsSellerSubscriptionItem a(@Y61.k AdvertDetails advertDetails) {
        String userKey;
        SellerSubscriptionInfo subscriptionInfo;
        AdvertSeller seller = advertDetails.getSeller();
        SellerNotificationsState sellerNotificationsState = null;
        if (seller == null || (userKey = seller.getUserKey()) == null || (subscriptionInfo = seller.getSubscriptionInfo()) == null) {
            return null;
        }
        int iA2 = this.f74025a.a();
        Boolean isSubscribed = subscriptionInfo.getIsSubscribed();
        Boolean bool = Boolean.FALSE;
        SellerSubscriptionState sellerSubscriptionState = kotlin.jvm.internal.L.f(isSubscribed, bool) ? SellerSubscriptionState.f85640c : SellerSubscriptionState.f85639b;
        Boolean isNotificationsActivated = subscriptionInfo.getIsNotificationsActivated();
        if (isNotificationsActivated != null) {
            if (isNotificationsActivated.equals(Boolean.TRUE)) {
                sellerNotificationsState = SellerNotificationsState.f85635b;
            } else {
                if (!isNotificationsActivated.equals(bool)) {
                    throw new NoWhenBranchMatchedException();
                }
                sellerNotificationsState = SellerNotificationsState.f85636c;
            }
        }
        return new AdvertDetailsSellerSubscriptionItem(iA2, userKey, sellerSubscriptionState, sellerNotificationsState);
    }
}
