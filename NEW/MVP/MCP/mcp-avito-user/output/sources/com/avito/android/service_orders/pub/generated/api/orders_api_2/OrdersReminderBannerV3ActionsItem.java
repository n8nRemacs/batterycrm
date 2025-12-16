package com.avito.android.service_orders.pub.generated.api.orders_api_2;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: OrdersApi2Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersReminderBannerV3ActionsItem;", "", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersReminderBannerV3ActionsItem$AddAction;", "addAction", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersReminderBannerV3ActionsItem$AddAction;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersReminderBannerV3ActionsItem$AddAction;", "getAddAction", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersReminderBannerV3ActionsItem$AddAction;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "AddAction", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrdersReminderBannerV3ActionsItem {

    @c("addAction")
    @l
    private final AddAction addAction;

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersApi2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersReminderBannerV3ActionsItem$AddAction;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "OpenBottomSheet", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AddAction {

        @c("openBottomSheet")
        public static final AddAction OpenBottomSheet;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AddAction[] f279697b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f279698c;

        static {
            AddAction addAction = new AddAction("OpenBottomSheet", 0, "openBottomSheet");
            OpenBottomSheet = addAction;
            AddAction[] addActionArr = {addAction};
            f279697b = addActionArr;
            f279698c = kotlin.enums.c.a(addActionArr);
        }

        private AddAction(String str, int i12, String str2) {
        }

        public static AddAction valueOf(String str) {
            return (AddAction) Enum.valueOf(AddAction.class, str);
        }

        public static AddAction[] values() {
            return (AddAction[]) f279697b.clone();
        }
    }

    public OrdersReminderBannerV3ActionsItem(@l AddAction addAction, @k String str, @k DeepLink deepLink, @k String str2) {
        this.addAction = addAction;
        this.title = str;
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
