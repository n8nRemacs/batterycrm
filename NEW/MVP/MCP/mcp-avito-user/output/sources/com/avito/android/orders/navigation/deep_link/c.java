package com.avito.android.orders.navigation.deep_link;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.orders.OrdersLink;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrdersLinkDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders/navigation/deep_link/c;", "Lev/b;", "Lcom/avito/android/orders/OrdersLink;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC40162b<OrdersLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrdersAggregationIntentFactory f210178d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f210179e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f210180f;

    @Inject
    public c(@k OrdersAggregationIntentFactory ordersAggregationIntentFactory, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar) {
        this.f210178d = ordersAggregationIntentFactory;
        this.f210179e = interfaceC4053a;
        this.f210180f = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        OrdersLink ordersLink = (OrdersLink) deepLink;
        String str2 = ordersLink.f209933b;
        this.f210179e.R(this.f210178d.a(str2, new OrdersAggregationIntentFactory.GeneralOrdersData(str2, ordersLink.f209934c), this.f210180f.a()), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
