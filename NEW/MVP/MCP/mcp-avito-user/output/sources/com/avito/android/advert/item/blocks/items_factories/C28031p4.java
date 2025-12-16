package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.sellerprofile.AdvertDetailsSellerProfileItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSeller;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.SellerSubscriptionInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertDetailsSellerProfileItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/p4;", "Lcom/avito/android/advert/item/blocks/items_factories/o4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.p4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28031p4 implements InterfaceC28024o4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.sellerprofile.E f74003a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74004b;

    @Inject
    public C28031p4(@Y61.k com.avito.android.advert_details_items.sellerprofile.E e12, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74003a = e12;
        this.f74004b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28024o4
    @Y61.l
    public final AdvertDetailsSellerProfileItem a(@Y61.k AdvertDetails advertDetails, @Y61.k AdvertDetailsStyle advertDetailsStyle, boolean z12) {
        SellerSubscriptionState sellerSubscriptionState;
        SellerNotificationsState sellerNotificationsState;
        String str;
        AdvertSeller seller = advertDetails.getSeller();
        SellerNotificationsState sellerNotificationsState2 = null;
        if (seller == null || advertDetails.isReserved()) {
            return null;
        }
        ShowSellersProfileSource showSellersProfileSource = com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68638g.f68647c;
        if (showSellersProfileSource != null) {
            this.f74003a.Na(showSellersProfileSource);
        }
        if (z12) {
            String userKey = seller.getUserKey();
            String str2 = userKey != null ? userKey : "";
            SellerSubscriptionInfo subscriptionInfo = seller.getSubscriptionInfo();
            Boolean isSubscribed = subscriptionInfo != null ? subscriptionInfo.getIsSubscribed() : null;
            Boolean bool = Boolean.TRUE;
            SellerSubscriptionState sellerSubscriptionState2 = kotlin.jvm.internal.L.f(isSubscribed, bool) ? SellerSubscriptionState.f85639b : kotlin.jvm.internal.L.f(isSubscribed, Boolean.FALSE) ? SellerSubscriptionState.f85640c : null;
            SellerSubscriptionInfo subscriptionInfo2 = seller.getSubscriptionInfo();
            Boolean isNotificationsActivated = subscriptionInfo2 != null ? subscriptionInfo2.getIsNotificationsActivated() : null;
            if (isNotificationsActivated != null) {
                if (isNotificationsActivated.equals(bool)) {
                    sellerNotificationsState2 = SellerNotificationsState.f85635b;
                } else {
                    if (!isNotificationsActivated.equals(Boolean.FALSE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sellerNotificationsState2 = SellerNotificationsState.f85636c;
                }
            }
            sellerNotificationsState = sellerNotificationsState2;
            str = str2;
            sellerSubscriptionState = sellerSubscriptionState2;
        } else {
            sellerSubscriptionState = null;
            sellerNotificationsState = null;
            str = "";
        }
        return new AdvertDetailsSellerProfileItem(0L, null, this.f74004b.a(), str, sellerSubscriptionState, sellerNotificationsState, Boolean.valueOf(kotlin.jvm.internal.L.f(advertDetails.getCategoryId(), CategoryIds.AUTO.MOTO.getId()) || kotlin.jvm.internal.L.f(advertDetails.getCategoryId(), CategoryIds.AUTO.WATER.getId())), null, null, 387, null);
    }
}
