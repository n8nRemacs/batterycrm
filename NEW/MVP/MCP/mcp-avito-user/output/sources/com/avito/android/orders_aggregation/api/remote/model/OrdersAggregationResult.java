package com.avito.android.orders_aggregation.api.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OrdersAggregationResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult;", "", "", "title", "Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;", "activeTab", "", "Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab;", "tabs", "<init>", "(Ljava/lang/String;Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;", "a", "()Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Tab", "_avito-discouraged_avito-network_orders-aggregation"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrdersAggregationResult {

    @c("activeTab")
    @l
    private final Tab.Type activeTab;

    @c("tabs")
    @k
    private final List<Tab> tabs;

    @c("title")
    @k
    private final String title;

    /* compiled from: OrdersAggregationResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab;", "", "Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;", "type", "", "title", "", "counter", "<init>", "(Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;", "c", "()Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "Type", "_avito-discouraged_avito-network_orders-aggregation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tab {

        @c("counter")
        @l
        private final Integer counter;

        @c("title")
        @k
        private final String title;

        @c("type")
        @l
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrdersAggregationResult.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "GOODS", "ORDERS_SERVICES", "_avito-discouraged_avito-network_orders-aggregation"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("goods_orders")
            public static final Type GOODS;

            @c("services_orders")
            public static final Type ORDERS_SERVICES;

            /* renamed from: c, reason: collision with root package name */
            @k
            public static final a f210203c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f210204d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f210205e;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f210206b;

            /* compiled from: OrdersAggregationResult.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation/api/remote/model/OrdersAggregationResult$Tab$Type$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_orders-aggregation"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                public a() {
                }
            }

            static {
                Type type = new Type("GOODS", 0, "goods_orders");
                GOODS = type;
                Type type2 = new Type("ORDERS_SERVICES", 1, "services_orders");
                ORDERS_SERVICES = type2;
                Type[] typeArr = {type, type2};
                f210204d = typeArr;
                f210205e = kotlin.enums.c.a(typeArr);
                f210203c = new a(null);
            }

            private Type(String str, int i12, String str2) {
                this.f210206b = str2;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f210204d.clone();
            }
        }

        public Tab(@l Type type, @k String str, @l Integer num) {
            this.type = type;
            this.title = str;
            this.counter = num;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Integer getCounter() {
            return this.counter;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Type getType() {
            return this.type;
        }
    }

    public OrdersAggregationResult(@k String str, @l Tab.Type type, @k List<Tab> list) {
        this.title = str;
        this.activeTab = type;
        this.tabs = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Tab.Type getActiveTab() {
        return this.activeTab;
    }

    @k
    public final List<Tab> b() {
        return this.tabs;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
