package Dn;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3CartItemsUpdatePostRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"LDn/d;", "", "", "context", "", "isBundle", "", "LDn/e;", "items", "", "needDiscountOnDelivery", "withComplementary", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Long;", "getNeedDiscountOnDelivery", "()Ljava/lang/Long;", "getWithComplementary", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    @com.google.gson.annotations.c("isBundle")
    @l
    private final Boolean isBundle;

    @com.google.gson.annotations.c("items")
    @k
    private final List<e> items;

    @com.google.gson.annotations.c("needDiscountOnDelivery")
    @l
    private final Long needDiscountOnDelivery;

    @com.google.gson.annotations.c("withComplementary")
    @l
    private final Boolean withComplementary;

    public d(@l String str, @l Boolean bool, @k List<e> list, @l Long l12, @l Boolean bool2) {
        this.context = str;
        this.isBundle = bool;
        this.items = list;
        this.needDiscountOnDelivery = l12;
        this.withComplementary = bool2;
    }
}
