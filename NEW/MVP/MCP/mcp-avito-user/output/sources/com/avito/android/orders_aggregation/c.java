package com.avito.android.orders_aggregation;

import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrdersAggregationIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/c;", "Lcom/avito/android/orders_aggregation/OrdersAggregationIntentFactory;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements OrdersAggregationIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f210207a;

    @Inject
    public c(@Y61.k L l12) {
        this.f210207a = l12;
    }

    @Override // com.avito.android.orders_aggregation.OrdersAggregationIntentFactory
    @Y61.k
    public final Intent a(@Y61.l String str, @Y61.l OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData, @Y61.l NavigationTabSetItem navigationTabSetItem) {
        return this.f210207a.d(new OrdersAggregationFragmentData(str, generalOrdersData, navigationTabSetItem));
    }
}
