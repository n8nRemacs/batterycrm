package com.avito.android.orders_aggregation;

import com.avito.android.orders_aggregation.api.remote.model.OrdersAggregationResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: OrdersAggregationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/f;", "", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f {
    @Y61.l
    Object a(@Y61.k Continuation<? super TypedResult<OrdersAggregationResult>> continuation);
}
