package com.avito.android.orders.badge_counter;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrdersBadgeState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders/badge_counter/OrdersBadgeState;", "", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrdersBadgeState {

    /* renamed from: b, reason: collision with root package name */
    public static final OrdersBadgeState f209935b;

    /* renamed from: c, reason: collision with root package name */
    public static final OrdersBadgeState f209936c;

    /* renamed from: d, reason: collision with root package name */
    public static final OrdersBadgeState f209937d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OrdersBadgeState[] f209938e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f209939f;

    static {
        OrdersBadgeState ordersBadgeState = new OrdersBadgeState("Initial", 0);
        f209935b = ordersBadgeState;
        OrdersBadgeState ordersBadgeState2 = new OrdersBadgeState("View", 1);
        f209936c = ordersBadgeState2;
        OrdersBadgeState ordersBadgeState3 = new OrdersBadgeState("Gone", 2);
        f209937d = ordersBadgeState3;
        OrdersBadgeState[] ordersBadgeStateArr = {ordersBadgeState, ordersBadgeState2, ordersBadgeState3};
        f209938e = ordersBadgeStateArr;
        f209939f = kotlin.enums.c.a(ordersBadgeStateArr);
    }

    public OrdersBadgeState() {
        throw null;
    }

    public static OrdersBadgeState valueOf(String str) {
        return (OrdersBadgeState) Enum.valueOf(OrdersBadgeState.class, str);
    }

    public static OrdersBadgeState[] values() {
        return (OrdersBadgeState[]) f209938e.clone();
    }
}
