package Bj0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.autoteka.generated.api.get_step_order_v_4.PriceDetailsV2PromocodeWidget;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetStepOrderV4Response.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LBj0/d;", "", "", "LBj0/e;", "discounts", "LBj0/f;", "dynamicDiscounts", "LBj0/g;", "price", "Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget;", "promocodeWidget", "LBj0/h;", "total", "<init>", "(Ljava/util/List;Ljava/util/List;LBj0/g;Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget;LBj0/h;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "LBj0/g;", "c", "()LBj0/g;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget;", "d", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget;", "LBj0/h;", "e", "()LBj0/h;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class d {

    @com.google.gson.annotations.c("discounts")
    @k
    private final List<e> discounts;

    @com.google.gson.annotations.c("dynamicDiscounts")
    @k
    private final List<f> dynamicDiscounts;

    @com.google.gson.annotations.c("price")
    @k
    private final g price;

    @com.google.gson.annotations.c("promocodeWidget")
    @l
    private final PriceDetailsV2PromocodeWidget promocodeWidget;

    @com.google.gson.annotations.c("total")
    @k
    private final h total;

    public d(@k List<e> list, @k List<f> list2, @k g gVar, @l PriceDetailsV2PromocodeWidget priceDetailsV2PromocodeWidget, @k h hVar) {
        this.discounts = list;
        this.dynamicDiscounts = list2;
        this.price = gVar;
        this.promocodeWidget = priceDetailsV2PromocodeWidget;
        this.total = hVar;
    }

    @k
    public final List<e> a() {
        return this.discounts;
    }

    @k
    public final List<f> b() {
        return this.dynamicDiscounts;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final g getPrice() {
        return this.price;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final PriceDetailsV2PromocodeWidget getPromocodeWidget() {
        return this.promocodeWidget;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final h getTotal() {
        return this.total;
    }
}
