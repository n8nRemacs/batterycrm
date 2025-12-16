package com.avito.android.remote.early_access.generated.api.order_status_v_2;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: OrderStatusV2Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/OrderStatusV2Response;", "", "", Constants.DEEPLINK, "message", "Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/OrderStatusV2Response$OrderStatus;", "orderStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/OrderStatusV2Response$OrderStatus;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getMessage", "Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/OrderStatusV2Response$OrderStatus;", "b", "()Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/OrderStatusV2Response$OrderStatus;", "OrderStatus", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OrderStatusV2Response {

    @c(Constants.DEEPLINK)
    @l
    private final String deeplink;

    @c("message")
    @l
    private final String message;

    @c("orderStatus")
    @k
    private final OrderStatus orderStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderStatusV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/early_access/generated/api/order_status_v_2/OrderStatusV2Response$OrderStatus;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Create", "Wait", "Cancel", "Paid", "Duplicate", "Failed", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrderStatus {

        @c("cancel")
        public static final OrderStatus Cancel;

        @c("create")
        public static final OrderStatus Create;

        @c("duplicate")
        public static final OrderStatus Duplicate;

        @c(PaymentStateKt.PAYMENT_STATE_FAILED)
        public static final OrderStatus Failed;

        @c("paid")
        public static final OrderStatus Paid;

        @c("wait")
        public static final OrderStatus Wait;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ OrderStatus[] f253385b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253386c;

        static {
            OrderStatus orderStatus = new OrderStatus("Create", 0, "create");
            Create = orderStatus;
            OrderStatus orderStatus2 = new OrderStatus("Wait", 1, "wait");
            Wait = orderStatus2;
            OrderStatus orderStatus3 = new OrderStatus("Cancel", 2, "cancel");
            Cancel = orderStatus3;
            OrderStatus orderStatus4 = new OrderStatus("Paid", 3, "paid");
            Paid = orderStatus4;
            OrderStatus orderStatus5 = new OrderStatus("Duplicate", 4, "duplicate");
            Duplicate = orderStatus5;
            OrderStatus orderStatus6 = new OrderStatus("Failed", 5, PaymentStateKt.PAYMENT_STATE_FAILED);
            Failed = orderStatus6;
            OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3, orderStatus4, orderStatus5, orderStatus6};
            f253385b = orderStatusArr;
            f253386c = kotlin.enums.c.a(orderStatusArr);
        }

        private OrderStatus(String str, int i12, String str2) {
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) f253385b.clone();
        }
    }

    public OrderStatusV2Response(@l String str, @l String str2, @k OrderStatus orderStatus) {
        this.deeplink = str;
        this.message = str2;
        this.orderStatus = orderStatus;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final OrderStatus getOrderStatus() {
        return this.orderStatus;
    }
}
