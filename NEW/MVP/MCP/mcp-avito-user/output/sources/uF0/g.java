package uF0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: Api1TravelSearchFavoritesItemsPostResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"LuF0/g;", "", "", "current", "discountPercent", "", "hasDiscount", "priceWithoutDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getDiscountPercent", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "c", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    @com.google.gson.annotations.c("current")
    @l
    private final String current;

    @com.google.gson.annotations.c("discountPercent")
    @l
    private final String discountPercent;

    @com.google.gson.annotations.c("hasDiscount")
    @l
    private final Boolean hasDiscount;

    @com.google.gson.annotations.c("priceWithoutDiscount")
    @l
    private final String priceWithoutDiscount;

    public g(@l String str, @l String str2, @l Boolean bool, @l String str3) {
        this.current = str;
        this.discountPercent = str2;
        this.hasDiscount = bool;
        this.priceWithoutDiscount = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCurrent() {
        return this.current;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPriceWithoutDiscount() {
        return this.priceWithoutDiscount;
    }
}
