package iz0;

import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_seller_orders.generated.api.api_2_str_seller_orders_range_get.BookingButtonV3;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersRangeGetResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Liz0/b;", "", "", "active", "", "bookingId", "", "Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_range_get/BookingButtonV3;", "buttons", "Liz0/h;", "buyerInfo", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Liz0/k;", "estateInfo", "hasAction", "subtitle", "title", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Liz0/h;Lcom/avito/android/deep_linking/links/DeepLink;Liz0/k;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Liz0/h;", "d", "()Liz0/h;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Liz0/k;", "f", "()Liz0/k;", "g", "h", "i", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42142b {

    @com.google.gson.annotations.c("active")
    @l
    private final Boolean active;

    @com.google.gson.annotations.c("bookingId")
    @l
    private final String bookingId;

    @com.google.gson.annotations.c("buttons")
    @l
    private final List<BookingButtonV3> buttons;

    @com.google.gson.annotations.c("buyerInfo")
    @l
    private final h buyerInfo;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("estateInfo")
    @l
    private final k estateInfo;

    @com.google.gson.annotations.c("hasAction")
    @l
    private final Boolean hasAction;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C42142b(@l Boolean bool, @l String str, @l List<BookingButtonV3> list, @l h hVar, @l DeepLink deepLink, @l k kVar, @l Boolean bool2, @Y61.k String str2, @l String str3) {
        this.active = bool;
        this.bookingId = str;
        this.buttons = list;
        this.buyerInfo = hVar;
        this.deeplink = deepLink;
        this.estateInfo = kVar;
        this.hasAction = bool2;
        this.subtitle = str2;
        this.title = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    @l
    public final List<BookingButtonV3> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final h getBuyerInfo() {
        return this.buyerInfo;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final k getEstateInfo() {
        return this.estateInfo;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getHasAction() {
        return this.hasAction;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
