package hz0;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_seller_orders.generated.api.api_2_str_seller_orders_list_post.BookingButtonV3;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lhz0/b;", "", "", "active", "", "bookingId", "", "Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_list_post/BookingButtonV3;", "buttons", "Lhz0/o;", "buyerInfo", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lhz0/r;", "estateInfo", "hasAction", "subtitle", "title", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lhz0/o;Lcom/avito/android/deep_linking/links/DeepLink;Lhz0/r;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lhz0/o;", "d", "()Lhz0/o;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lhz0/r;", "f", "()Lhz0/r;", "g", "h", "i", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41198b {

    @com.google.gson.annotations.c("active")
    @Y61.l
    private final Boolean active;

    @com.google.gson.annotations.c("bookingId")
    @Y61.l
    private final String bookingId;

    @com.google.gson.annotations.c("buttons")
    @Y61.l
    private final List<BookingButtonV3> buttons;

    @com.google.gson.annotations.c("buyerInfo")
    @Y61.l
    private final o buyerInfo;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("estateInfo")
    @Y61.l
    private final r estateInfo;

    @com.google.gson.annotations.c("hasAction")
    @Y61.l
    private final Boolean hasAction;

    @com.google.gson.annotations.c("subtitle")
    @Y61.k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public C41198b(@Y61.l Boolean bool, @Y61.l String str, @Y61.l List<BookingButtonV3> list, @Y61.l o oVar, @Y61.l DeepLink deepLink, @Y61.l r rVar, @Y61.l Boolean bool2, @Y61.k String str2, @Y61.l String str3) {
        this.active = bool;
        this.bookingId = str;
        this.buttons = list;
        this.buyerInfo = oVar;
        this.deeplink = deepLink;
        this.estateInfo = rVar;
        this.hasAction = bool2;
        this.subtitle = str2;
        this.title = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    @Y61.l
    public final List<BookingButtonV3> c() {
        return this.buttons;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final o getBuyerInfo() {
        return this.buyerInfo;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final r getEstateInfo() {
        return this.estateInfo;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Boolean getHasAction() {
        return this.hasAction;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
