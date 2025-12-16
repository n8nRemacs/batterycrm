package com.avito.android.orders_aggregation_core;

import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.orders_aggregation_core.deeplink.OrdersAggregationLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrdersAggregationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders_aggregation_core/b;", "Lev/a;", "Lcom/avito/android/orders_aggregation_core/deeplink/OrdersAggregationLink;", "_avito_orders-aggregation-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC40161a<OrdersAggregationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f210374f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final OrdersAggregationIntentFactory f210375g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f210376h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f210377i;

    @Inject
    public b(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k OrdersAggregationIntentFactory ordersAggregationIntentFactory, @Y61.k C25719a c25719a, @Y61.k com.avito.android.navigation.a aVar) {
        this.f210374f = interfaceC4053a;
        this.f210375g = ordersAggregationIntentFactory;
        this.f210376h = c25719a;
        this.f210377i = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OrdersAggregationLink ordersAggregationLink = (OrdersAggregationLink) deepLink;
        this.f210376h.a(ordersAggregationLink, this, AuthSource.f92674I, new a(this, ordersAggregationLink));
    }
}
