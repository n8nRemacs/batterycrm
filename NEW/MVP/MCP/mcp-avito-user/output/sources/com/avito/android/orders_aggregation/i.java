package com.avito.android.orders_aggregation;

import android.content.SharedPreferences;
import com.avito.android.orders_aggregation.OrdersAggregationTabShownStatusStorage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrdersAggregationTabShownStatusStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/i;", "Lcom/avito/android/orders_aggregation/OrdersAggregationTabShownStatusStorage;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements OrdersAggregationTabShownStatusStorage {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f210263a;

    @Inject
    public i(@Y61.k SharedPreferences sharedPreferences) {
        this.f210263a = sharedPreferences;
    }

    @Override // com.avito.android.orders_aggregation.OrdersAggregationTabShownStatusStorage
    public final boolean a() {
        OrdersAggregationTabShownStatusStorage.Tab[] tabArr = OrdersAggregationTabShownStatusStorage.Tab.f210201b;
        return this.f210263a.getBoolean("SERVICES_ORDER", false);
    }

    @Override // com.avito.android.orders_aggregation.OrdersAggregationTabShownStatusStorage
    public final void b() {
        OrdersAggregationTabShownStatusStorage.Tab[] tabArr = OrdersAggregationTabShownStatusStorage.Tab.f210201b;
        SharedPreferences.Editor editorEdit = this.f210263a.edit();
        editorEdit.putBoolean("SERVICES_ORDER", true);
        editorEdit.apply();
    }
}
