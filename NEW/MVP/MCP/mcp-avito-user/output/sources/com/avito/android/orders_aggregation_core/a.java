package com.avito.android.orders_aggregation_core;

import Ju.AbstractC14250d;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.orders_aggregation_core.deeplink.OrdersAggregationLink;
import com.avito.android.orders_aggregation_core.deeplink.OrdersAggregationSettings;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrdersAggregationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f210372l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OrdersAggregationLink f210373m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, OrdersAggregationLink ordersAggregationLink) {
        super(0);
        this.f210372l = bVar;
        this.f210373m = ordersAggregationLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        OrdersAggregationSettings.GeneralSettings general;
        OrdersAggregationSettings.GeneralSettings general2;
        b bVar = this.f210372l;
        OrdersAggregationLink ordersAggregationLink = this.f210373m;
        String str = ordersAggregationLink.f210383b;
        OrdersAggregationSettings ordersAggregationSettings = ordersAggregationLink.f210384c;
        String str2 = null;
        String str3 = (ordersAggregationSettings == null || (general2 = ordersAggregationSettings.getGeneral()) == null) ? null : general2.f210385b;
        if (ordersAggregationSettings != null && (general = ordersAggregationSettings.getGeneral()) != null) {
            str2 = general.f210386c;
        }
        OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData = new OrdersAggregationIntentFactory.GeneralOrdersData(str3, str2);
        NavigationTabSetItem navigationTabSetItemA = bVar.f210377i.a();
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = NavigationTab.f106974j;
        }
        bVar.f210374f.R(bVar.f210375g.a(str, generalOrdersData, navigationTabSetItemA), com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
