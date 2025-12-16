package com.avito.android.advert.item.sellersubscription;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import io.reactivex.rxjava3.internal.operators.observable.T;
import kotlin.Metadata;

/* compiled from: SellerSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/j;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/b;", "Lcom/avito/android/r0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface j extends InterfaceC30576b, InterfaceC34162r0 {
    @Y61.k
    C41986s0 b(@Y61.k String str, boolean z12, @Y61.l SubscriptionSource subscriptionSource);

    @Y61.k
    T e(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource);

    @Y61.k
    C41986s0 l(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource);
}
