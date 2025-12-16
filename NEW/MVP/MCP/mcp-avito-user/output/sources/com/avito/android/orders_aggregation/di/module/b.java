package com.avito.android.orders_aggregation.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.orders_aggregation.OrdersAggregationFragment;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import h31.d;
import kotlin.Metadata;
import n50.InterfaceC44195a;

/* compiled from: OrdersAggregationComponent.kt */
@B
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/orders_aggregation/di/module/b;", "Lcom/avito/android/orders_aggregation_core/f;", "Lcom/avito/android/di/h;", "Ln50/a;", "a", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface b extends com.avito.android.orders_aggregation_core.f, InterfaceC29971h, InterfaceC44195a {

    /* compiled from: OrdersAggregationComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/di/module/b$a;", "", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @Y61.k
        a a(@Y61.k C28478k c28478k);

        @h31.b
        @Y61.k
        a b(@Y61.k OrdersAggregationFragment ordersAggregationFragment);

        @Y61.k
        b build();

        @h31.b
        @Y61.k
        a c(@Y61.l @m String str);

        @h31.b
        @Y61.k
        a d(@Y61.l OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData);

        @Y61.k
        a e(@Y61.k c cVar);
    }

    void pf(@Y61.k OrdersAggregationFragment ordersAggregationFragment);
}
