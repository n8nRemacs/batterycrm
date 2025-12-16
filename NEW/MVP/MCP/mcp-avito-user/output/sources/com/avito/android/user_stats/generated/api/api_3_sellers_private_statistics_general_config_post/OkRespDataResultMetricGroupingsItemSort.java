package com.avito.android.user_stats.generated.api.api_3_sellers_private_statistics_general_config_post;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort;", "", "", "metric", "Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort$Order;", "order", "<init>", "(Ljava/lang/String;Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort$Order;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort$Order;", "b", "()Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort$Order;", "Order", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OkRespDataResultMetricGroupingsItemSort {

    @c("metric")
    @l
    private final String metric;

    @c("order")
    @l
    private final Order order;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_3_sellers_private_statistics_general_config_post/OkRespDataResultMetricGroupingsItemSort$Order;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Asc", "Desc", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Order {

        @c("asc")
        public static final Order Asc;

        @c("desc")
        public static final Order Desc;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Order[] f318296c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f318297d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f318298b;

        static {
            Order order = new Order("Asc", 0, "asc");
            Asc = order;
            Order order2 = new Order("Desc", 1, "desc");
            Desc = order2;
            Order[] orderArr = {order, order2};
            f318296c = orderArr;
            f318297d = kotlin.enums.c.a(orderArr);
        }

        private Order(String str, int i12, String str2) {
            this.f318298b = str2;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f318296c.clone();
        }
    }

    public OkRespDataResultMetricGroupingsItemSort(@l String str, @l Order order) {
        this.metric = str;
        this.order = order;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getMetric() {
        return this.metric;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Order getOrder() {
        return this.order;
    }
}
