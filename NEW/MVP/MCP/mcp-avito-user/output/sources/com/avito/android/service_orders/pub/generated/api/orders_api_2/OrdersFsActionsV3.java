package com.avito.android.service_orders.pub.generated.api.orders_api_2;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: OrdersApi2Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3;", "", "", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3ActionsItem;", "actions", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Id;", "id", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Type;", "type", "<init>", "(Ljava/util/List;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Id;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Type;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Id;", "getId", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Id;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Type;", "getType", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Type;", "Id", "Type", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrdersFsActionsV3 {

    @c("actions")
    @k
    private final List<OrdersFsActionsV3ActionsItem> actions;

    @c("id")
    @k
    private final Id id;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FsActions", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Id {

        @c("fsActions")
        public static final Id FsActions;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Id[] f279688b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f279689c;

        static {
            Id id2 = new Id("FsActions", 0, "fsActions");
            FsActions = id2;
            Id[] idArr = {id2};
            f279688b = idArr;
            f279689c = kotlin.enums.c.a(idArr);
        }

        private Id(String str, int i12, String str2) {
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) f279688b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FsActions", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("fsActions")
        public static final Type FsActions;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f279690b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f279691c;

        static {
            Type type = new Type("FsActions", 0, "fsActions");
            FsActions = type;
            Type[] typeArr = {type};
            f279690b = typeArr;
            f279691c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f279690b.clone();
        }
    }

    public OrdersFsActionsV3(@k List<OrdersFsActionsV3ActionsItem> list, @k Id id2, @k Type type) {
        this.actions = list;
        this.id = id2;
        this.type = type;
    }

    @k
    public final List<OrdersFsActionsV3ActionsItem> a() {
        return this.actions;
    }
}
