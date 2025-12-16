package com.avito.android.service_orders.pub.generated.api.orders_api_2;

import Su0.C15225a;
import Su0.C15231g;
import Su0.C15232h;
import Su0.C15233i;
import Su0.C15234j;
import Su0.C15235k;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: OrdersApi2Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem;", "", "OrdersCalendarLinkV3", "OrdersFsActionsV3", "OrdersOrderItemV3", "OrdersReminderBannerV3", "OrdersStatusGroupNameV3", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersCalendarLinkV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersReminderBannerV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersStatusGroupNameV3;", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OrdersResponseV3SuccessTabsItemListItem {

    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersCalendarLinkV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem;", "", "title", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersCalendarLinkV3$Type;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersCalendarLinkV3$Type;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersCalendarLinkV3$Type;", "getType", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersCalendarLinkV3$Type;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "Type", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrdersCalendarLinkV3 implements OrdersResponseV3SuccessTabsItemListItem {

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        @c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrdersApi2Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersCalendarLinkV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CalendarLink", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("calendarLink")
            public static final Type CalendarLink;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f279699b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f279700c;

            static {
                Type type = new Type("CalendarLink", 0, "calendarLink");
                CalendarLink = type;
                Type[] typeArr = {type};
                f279699b = typeArr;
                f279700c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f279699b.clone();
            }
        }

        public OrdersCalendarLinkV3(@k String str, @k Type type, @k DeepLink deepLink, @k String str2) {
            this.title = str;
            this.type = type;
            this.uri = deepLink;
            this.url = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }
    }

    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem;", "", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3ActionsItem;", "actions", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Id;", "id", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Type;", "type", "<init>", "(Ljava/util/List;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Id;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Type;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Id;", "getId", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Id;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Type;", "getType", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Type;", "Id", "Type", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrdersFsActionsV3 implements OrdersResponseV3SuccessTabsItemListItem {

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
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FsActions", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Id {

            @c("fsActions")
            public static final Id FsActions;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Id[] f279702b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f279703c;

            static {
                Id id2 = new Id("FsActions", 0, "fsActions");
                FsActions = id2;
                Id[] idArr = {id2};
                f279702b = idArr;
                f279703c = kotlin.enums.c.a(idArr);
            }

            private Id(String str, int i12, String str2) {
            }

            public static Id valueOf(String str) {
                return (Id) Enum.valueOf(Id.class, str);
            }

            public static Id[] values() {
                return (Id[]) f279702b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrdersApi2Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersFsActionsV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FsActions", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("fsActions")
            public static final Type FsActions;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f279704b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f279705c;

            static {
                Type type = new Type("FsActions", 0, "fsActions");
                FsActions = type;
                Type[] typeArr = {type};
                f279704b = typeArr;
                f279705c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f279704b.clone();
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

    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u0018\u00002\u00020\u0001:\u0002BCB\u009b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b2\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b6\u0010$R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b7\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b>\u0010$R\u001a\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010?\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem;", "Lcom/avito/android/deep_linking/links/DeepLink;", "cardUri", "", "cardUrl", "commentText", "LSu0/g;", "confirmationButton", "LSu0/a;", "confirmationButtonAction", "LSu0/h;", "contacts", "", "LSu0/i;", "contactsList", "date", "Lcom/avito/android/remote/model/text/AttributedText;", "extendedStatus", "id", "LSu0/j;", "priceListValues", "LSu0/k;", "primaryButton", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Status;", "status", "statusText", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Type;", "type", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;LSu0/g;LSu0/a;LSu0/h;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;LSu0/k;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Status;Ljava/lang/String;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Type;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getCardUrl", "()Ljava/lang/String;", "b", "LSu0/g;", "c", "()LSu0/g;", "LSu0/a;", "getConfirmationButtonAction", "()LSu0/a;", "LSu0/h;", "getContacts", "()LSu0/h;", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "g", "h", "LSu0/k;", "getPrimaryButton", "()LSu0/k;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Status;", "i", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Status;", "j", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Type;", "getType", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Type;", "Status", "Type", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrdersOrderItemV3 implements OrdersResponseV3SuccessTabsItemListItem {

        @c("cardUri")
        @l
        private final DeepLink cardUri;

        @c("cardUrl")
        @l
        private final String cardUrl;

        @c("commentText")
        @l
        private final String commentText;

        @c("confirmationButton")
        @l
        private final C15231g confirmationButton;

        @c("confirmationButtonAction")
        @l
        private final C15225a confirmationButtonAction;

        @c("contacts")
        @k
        private final C15232h contacts;

        @c("contactsList")
        @l
        private final List<C15233i> contactsList;

        @c("date")
        @k
        private final String date;

        @c("extendedStatus")
        @l
        private final AttributedText extendedStatus;

        @c("id")
        @k
        private final String id;

        @c("priceListValues")
        @k
        private final List<C15234j> priceListValues;

        @c("primaryButton")
        @l
        private final C15235k primaryButton;

        @c("status")
        @k
        private final Status status;

        @c("statusText")
        @k
        private final String statusText;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrdersApi2Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "NeedConfirmation", "NeedConfirmationByClient", "Confirmed", "Canceled", "CanceledByClient", "Completed", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Status {

            @c(PaymentStateKt.PAYMENT_STATE_CANCELED)
            public static final Status Canceled;

            @c("canceledByClient")
            public static final Status CanceledByClient;

            @c("completed")
            public static final Status Completed;

            @c("confirmed")
            public static final Status Confirmed;

            @c("needConfirmation")
            public static final Status NeedConfirmation;

            @c("needConfirmationByClient")
            public static final Status NeedConfirmationByClient;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Status[] f279707b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f279708c;

            static {
                Status status = new Status("NeedConfirmation", 0, "needConfirmation");
                NeedConfirmation = status;
                Status status2 = new Status("NeedConfirmationByClient", 1, "needConfirmationByClient");
                NeedConfirmationByClient = status2;
                Status status3 = new Status("Confirmed", 2, "confirmed");
                Confirmed = status3;
                Status status4 = new Status("Canceled", 3, PaymentStateKt.PAYMENT_STATE_CANCELED);
                Canceled = status4;
                Status status5 = new Status("CanceledByClient", 4, "canceledByClient");
                CanceledByClient = status5;
                Status status6 = new Status("Completed", 5, "completed");
                Completed = status6;
                Status[] statusArr = {status, status2, status3, status4, status5, status6};
                f279707b = statusArr;
                f279708c = kotlin.enums.c.a(statusArr);
            }

            private Status(String str, int i12, String str2) {
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f279707b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrdersApi2Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersOrderItemV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "OrderItem", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("orderItem")
            public static final Type OrderItem;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f279709b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f279710c;

            static {
                Type type = new Type("OrderItem", 0, "orderItem");
                OrderItem = type;
                Type[] typeArr = {type};
                f279709b = typeArr;
                f279710c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f279709b.clone();
            }
        }

        public OrdersOrderItemV3(@l DeepLink deepLink, @l String str, @l String str2, @l C15231g c15231g, @l C15225a c15225a, @k C15232h c15232h, @l List<C15233i> list, @k String str3, @l AttributedText attributedText, @k String str4, @k List<C15234j> list2, @l C15235k c15235k, @k Status status, @k String str5, @k Type type) {
            this.cardUri = deepLink;
            this.cardUrl = str;
            this.commentText = str2;
            this.confirmationButton = c15231g;
            this.confirmationButtonAction = c15225a;
            this.contacts = c15232h;
            this.contactsList = list;
            this.date = str3;
            this.extendedStatus = attributedText;
            this.id = str4;
            this.priceListValues = list2;
            this.primaryButton = c15235k;
            this.status = status;
            this.statusText = str5;
            this.type = type;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final DeepLink getCardUri() {
            return this.cardUri;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getCommentText() {
            return this.commentText;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final C15231g getConfirmationButton() {
            return this.confirmationButton;
        }

        @l
        public final List<C15233i> d() {
            return this.contactsList;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final AttributedText getExtendedStatus() {
            return this.extendedStatus;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        public final List<C15234j> h() {
            return this.priceListValues;
        }

        @k
        /* renamed from: i, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        @k
        /* renamed from: j, reason: from getter */
        public final String getStatusText() {
            return this.statusText;
        }
    }

    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\u001fBG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersReminderBannerV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem;", "", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersReminderBannerV3ActionsItem;", "actions", "", "bannerType", "", "closeDayTimeGap", "preset", "text", "title", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersReminderBannerV3$Type;", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersReminderBannerV3$Type;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "d", "e", "f", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersReminderBannerV3$Type;", "getType", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersReminderBannerV3$Type;", "Type", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrdersReminderBannerV3 implements OrdersResponseV3SuccessTabsItemListItem {

        @c("actions")
        @k
        private final List<OrdersReminderBannerV3ActionsItem> actions;

        @c("bannerType")
        @k
        private final String bannerType;

        @c("closeDayTimeGap")
        @l
        private final Long closeDayTimeGap;

        @c("preset")
        @k
        private final String preset;

        @c("text")
        @k
        private final String text;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrdersApi2Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersReminderBannerV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ScheduleReminderBanner", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("scheduleReminderBanner")
            public static final Type ScheduleReminderBanner;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f279711b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f279712c;

            static {
                Type type = new Type("ScheduleReminderBanner", 0, "scheduleReminderBanner");
                ScheduleReminderBanner = type;
                Type[] typeArr = {type};
                f279711b = typeArr;
                f279712c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f279711b.clone();
            }
        }

        public OrdersReminderBannerV3(@k List<OrdersReminderBannerV3ActionsItem> list, @k String str, @l Long l12, @k String str2, @k String str3, @k String str4, @k Type type) {
            this.actions = list;
            this.bannerType = str;
            this.closeDayTimeGap = l12;
            this.preset = str2;
            this.text = str3;
            this.title = str4;
            this.type = type;
        }

        @k
        public final List<OrdersReminderBannerV3ActionsItem> a() {
            return this.actions;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getBannerType() {
            return this.bannerType;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Long getCloseDayTimeGap() {
            return this.closeDayTimeGap;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getPreset() {
            return this.preset;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersStatusGroupNameV3;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem;", "", "title", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersStatusGroupNameV3$Type;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersStatusGroupNameV3$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersStatusGroupNameV3$Type;", "getType", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersStatusGroupNameV3$Type;", "Type", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrdersStatusGroupNameV3 implements OrdersResponseV3SuccessTabsItemListItem {

        @c("title")
        @l
        private final String title;

        @c("type")
        @l
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OrdersApi2Response.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem$OrdersStatusGroupNameV3$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "StatusGroupName", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("statusGroupName")
            public static final Type StatusGroupName;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f279713b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f279714c;

            static {
                Type type = new Type("StatusGroupName", 0, "statusGroupName");
                StatusGroupName = type;
                Type[] typeArr = {type};
                f279713b = typeArr;
                f279714c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12, String str2) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f279713b.clone();
            }
        }

        public OrdersStatusGroupNameV3(@l String str, @l Type type) {
            this.title = str;
            this.type = type;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }
}
