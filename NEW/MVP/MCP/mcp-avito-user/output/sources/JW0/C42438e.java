package jw0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Ljw0/e;", "", "", "discount", "id", "priceWithDiscount", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.ATTRIBUTE_TYPE, "totalPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "d", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "f", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jw0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42438e {

    @com.google.gson.annotations.c("discount")
    @Y61.l
    private final String discount;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("priceWithDiscount")
    @Y61.l
    private final String priceWithDiscount;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final String text;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @Y61.k
    private final DeepLink tooltip;

    @com.google.gson.annotations.c("totalPrice")
    @Y61.k
    private final String totalPrice;

    public C42438e(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k DeepLink deepLink, @Y61.k String str5) {
        this.discount = str;
        this.id = str2;
        this.priceWithDiscount = str3;
        this.text = str4;
        this.tooltip = deepLink;
        this.totalPrice = str5;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getDiscount() {
        return this.discount;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getPriceWithDiscount() {
        return this.priceWithDiscount;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final DeepLink getTooltip() {
        return this.tooltip;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }
}
