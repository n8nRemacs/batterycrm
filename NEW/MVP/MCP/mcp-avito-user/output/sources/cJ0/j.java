package Cj0;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.autoteka.generated.api.get_step_products_v_3.ProductItemDiscountsItem;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlotKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b$\u0010\u0018¨\u0006%"}, d2 = {"LCj0/j;", "", "LCj0/k;", "analyticsData", "", "discount", "", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/ProductItemDiscountsItem;", "discounts", DeliverySummarySlotKt.ORIGINAL_PRICE, "price", "slug", "LCj0/l;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "subtitle", "title", "unitPrice", "<init>", "(LCj0/k;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCj0/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LCj0/k;", "a", "()LCj0/k;", "Ljava/lang/String;", "getDiscount", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "d", "e", "LCj0/l;", "f", "()LCj0/l;", "g", "h", "i", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class j {

    @com.google.gson.annotations.c("analyticsData")
    @Y61.l
    private final k analyticsData;

    @com.google.gson.annotations.c("discount")
    @Y61.l
    private final String discount;

    @com.google.gson.annotations.c("discounts")
    @Y61.l
    private final List<ProductItemDiscountsItem> discounts;

    @com.google.gson.annotations.c(DeliverySummarySlotKt.ORIGINAL_PRICE)
    @Y61.l
    private final String originalPrice;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final String price;

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final l style;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("unitPrice")
    @Y61.l
    private final String unitPrice;

    public j(@Y61.l k kVar, @Y61.l String str, @Y61.l List<ProductItemDiscountsItem> list, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l l lVar, @Y61.l String str5, @Y61.k String str6, @Y61.l String str7) {
        this.analyticsData = kVar;
        this.discount = str;
        this.discounts = list;
        this.originalPrice = str2;
        this.price = str3;
        this.slug = str4;
        this.style = lVar;
        this.subtitle = str5;
        this.title = str6;
        this.unitPrice = str7;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final k getAnalyticsData() {
        return this.analyticsData;
    }

    @Y61.l
    public final List<ProductItemDiscountsItem> b() {
        return this.discounts;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final l getStyle() {
        return this.style;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getUnitPrice() {
        return this.unitPrice;
    }
}
