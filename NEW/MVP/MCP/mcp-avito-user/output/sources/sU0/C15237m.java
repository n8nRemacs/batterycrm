package Su0;

import com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersFsActionsV3;
import kotlin.Metadata;

/* compiled from: OrdersApi2Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"LSu0/m;", "", "LSu0/n;", "button", "LSu0/o;", "calendarLink", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3;", "fsActions", "", "subtitle", "title", "<init>", "(LSu0/n;LSu0/o;Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3;Ljava/lang/String;Ljava/lang/String;)V", "LSu0/n;", "a", "()LSu0/n;", "LSu0/o;", "b", "()LSu0/o;", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3;", "c", "()Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersFsActionsV3;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Su0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15237m {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final C15238n button;

    @com.google.gson.annotations.c("calendarLink")
    @Y61.l
    private final C15239o calendarLink;

    @com.google.gson.annotations.c("fsActions")
    @Y61.l
    private final OrdersFsActionsV3 fsActions;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public C15237m(@Y61.l C15238n c15238n, @Y61.l C15239o c15239o, @Y61.l OrdersFsActionsV3 ordersFsActionsV3, @Y61.l String str, @Y61.l String str2) {
        this.button = c15238n;
        this.calendarLink = c15239o;
        this.fsActions = ordersFsActionsV3;
        this.subtitle = str;
        this.title = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C15238n getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C15239o getCalendarLink() {
        return this.calendarLink;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final OrdersFsActionsV3 getFsActions() {
        return this.fsActions;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
