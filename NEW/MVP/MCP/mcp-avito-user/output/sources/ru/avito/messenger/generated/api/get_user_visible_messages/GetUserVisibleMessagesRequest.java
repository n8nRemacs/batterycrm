package ru.avito.messenger.generated.api.get_user_visible_messages;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetUserVisibleMessagesRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest;", "", "", "channelId", "", "limit", "offsetTimestamp", "Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest$Order;", "order", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest$Order;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "Ljava/lang/Long;", "getLimit", "()Ljava/lang/Long;", "getOffsetTimestamp", "Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest$Order;", "getOrder", "()Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest$Order;", "Order", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetUserVisibleMessagesRequest {

    @c("channelId")
    @k
    private final String channelId;

    @c("limit")
    @l
    private final Long limit;

    @c("offsetTimestamp")
    @l
    private final Long offsetTimestamp;

    @c("order")
    @l
    private final Order order;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetUserVisibleMessagesRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest$Order;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Order {

        @c("0")
        public static final Order Int0;

        @c("1")
        public static final Order Int1;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Order[] f431063c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f431064d;

        /* renamed from: b, reason: collision with root package name */
        public final int f431065b;

        static {
            Order order = new Order("Int0", 0, 0);
            Int0 = order;
            Order order2 = new Order("Int1", 1, 1);
            Int1 = order2;
            Order[] orderArr = {order, order2};
            f431063c = orderArr;
            f431064d = kotlin.enums.c.a(orderArr);
        }

        private Order(String str, int i12, int i13) {
            this.f431065b = i13;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f431063c.clone();
        }
    }

    public GetUserVisibleMessagesRequest(@k String str, @l Long l12, @l Long l13, @l Order order) {
        this.channelId = str;
        this.limit = l12;
        this.offsetTimestamp = l13;
        this.order = order;
    }
}
