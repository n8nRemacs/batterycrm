package com.avito.android.str_seller_orders.orders_buyer.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: StrOrdersBuyerOrderClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/analytics/StrOrdersBuyerOrderClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FromType", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersBuyerOrderClickEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f288921b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrOrdersBuyerOrderClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/analytics/StrOrdersBuyerOrderClickEvent$FromType;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ FromType[] f288922b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f288923c;

        static {
            FromType[] fromTypeArr = {new FromType()};
            f288922b = fromTypeArr;
            f288923c = c.a(fromTypeArr);
        }

        public static FromType valueOf(String str) {
            return (FromType) Enum.valueOf(FromType.class, str);
        }

        public static FromType[] values() {
            return (FromType[]) f288922b.clone();
        }
    }

    public StrOrdersBuyerOrderClickEvent() {
        FromType[] fromTypeArr = FromType.f288922b;
        this.f288921b = new ParametrizedClickStreamEvent(8099, 4, Collections.singletonMap("from_page", "order_list"), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f288921b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f288921b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f288921b.f90248c;
    }
}
