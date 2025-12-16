package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.remote.model.SubscribeResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RecommendationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/b;", "", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.adapter.recommendation.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30576b {

    /* compiled from: RecommendationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_sellers.adapter.recommendation.b$a */
    public static final class a {
    }

    @Y61.l
    Object a(@Y61.k String str, boolean z12, @Y61.l SubscriptionSource subscriptionSource, @Y61.k Continuation<? super G0> continuation);

    @Y61.l
    Object c(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource, @Y61.k Continuation<? super SubscribeResult> continuation);

    @Y61.l
    Object d(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource, @Y61.k Continuation<? super G0> continuation);
}
