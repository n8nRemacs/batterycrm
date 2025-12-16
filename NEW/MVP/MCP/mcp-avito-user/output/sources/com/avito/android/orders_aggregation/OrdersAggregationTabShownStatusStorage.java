package com.avito.android.orders_aggregation;

import kotlin.Metadata;

/* compiled from: OrdersAggregationTabShownStatusStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders_aggregation/OrdersAggregationTabShownStatusStorage;", "", "Tab", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OrdersAggregationTabShownStatusStorage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersAggregationTabShownStatusStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/OrdersAggregationTabShownStatusStorage$Tab;", "", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tab {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Tab[] f210201b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f210202c;

        static {
            Tab[] tabArr = {new Tab()};
            f210201b = tabArr;
            f210202c = kotlin.enums.c.a(tabArr);
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) f210201b.clone();
        }
    }

    boolean a();

    void b();
}
