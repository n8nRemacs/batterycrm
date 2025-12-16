package Su0;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.service_orders.pub.generated.api.orders_api_2.OrdersResponseV3SuccessTabsItemListItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: OrdersApi2Response.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LSu0/l;", "", "", "Lcom/avito/android/service_orders/pub/generated/api/orders_api_2/OrdersResponseV3SuccessTabsItemListItem;", "list", "", "loadMoreUrl", "LSu0/m;", ChannelContext.Item.PLACEHOLDER, "LSu0/p;", "scheduleSelection", "LSu0/r;", NotificationOpenAtTab.TAB, "<init>", "(Ljava/util/List;Ljava/lang/String;LSu0/m;LSu0/p;LSu0/r;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LSu0/m;", "c", "()LSu0/m;", "LSu0/p;", "d", "()LSu0/p;", "LSu0/r;", "e", "()LSu0/r;", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Su0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15236l {

    @com.google.gson.annotations.c("list")
    @Y61.k
    private final List<OrdersResponseV3SuccessTabsItemListItem> list;

    @com.google.gson.annotations.c("loadMoreUrl")
    @Y61.l
    private final String loadMoreUrl;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @Y61.l
    private final C15237m placeholder;

    @com.google.gson.annotations.c("scheduleSelection")
    @Y61.l
    private final C15240p scheduleSelection;

    @com.google.gson.annotations.c(NotificationOpenAtTab.TAB)
    @Y61.l
    private final r tab;

    /* JADX WARN: Multi-variable type inference failed */
    public C15236l(@Y61.k List<? extends OrdersResponseV3SuccessTabsItemListItem> list, @Y61.l String str, @Y61.l C15237m c15237m, @Y61.l C15240p c15240p, @Y61.l r rVar) {
        this.list = list;
        this.loadMoreUrl = str;
        this.placeholder = c15237m;
        this.scheduleSelection = c15240p;
        this.tab = rVar;
    }

    @Y61.k
    public final List<OrdersResponseV3SuccessTabsItemListItem> a() {
        return this.list;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getLoadMoreUrl() {
        return this.loadMoreUrl;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final C15237m getPlaceholder() {
        return this.placeholder;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C15240p getScheduleSelection() {
        return this.scheduleSelection;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final r getTab() {
        return this.tab;
    }
}
