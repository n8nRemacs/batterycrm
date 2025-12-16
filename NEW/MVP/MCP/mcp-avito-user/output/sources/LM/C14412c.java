package Lm;

import Pm.C14806a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import vn.C49355b;

/* compiled from: UpdatedCartItems.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LLm/c;", "", "", "", "LPm/a;", "bundleInfo", "", "itemsQuantity", "Lcom/avito/android/deep_linking/links/DeepLink;", "onAddItemDeepLink", "Lvn/b;", "discountOnDelivery", "<init>", "(Ljava/util/Map;ILcom/avito/android/deep_linking/links/DeepLink;Lvn/b;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "I", "c", "()I", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lvn/b;", "b", "()Lvn/b;", "_avito-discouraged_avito-api_cart"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14412c {

    @com.google.gson.annotations.c("bundleInfo")
    @l
    private final Map<String, C14806a> bundleInfo;

    @com.google.gson.annotations.c("discountOnDelivery")
    @l
    private final C49355b discountOnDelivery;

    @com.google.gson.annotations.c("itemsQuantity")
    private final int itemsQuantity;

    @com.google.gson.annotations.c("onAddItemDeepLink")
    @l
    private final DeepLink onAddItemDeepLink;

    public C14412c(@l Map<String, C14806a> map, int i12, @l DeepLink deepLink, @l C49355b c49355b) {
        this.bundleInfo = map;
        this.itemsQuantity = i12;
        this.onAddItemDeepLink = deepLink;
        this.discountOnDelivery = c49355b;
    }

    @l
    public final Map<String, C14806a> a() {
        return this.bundleInfo;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C49355b getDiscountOnDelivery() {
        return this.discountOnDelivery;
    }

    /* renamed from: c, reason: from getter */
    public final int getItemsQuantity() {
        return this.itemsQuantity;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DeepLink getOnAddItemDeepLink() {
        return this.onAddItemDeepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14412c)) {
            return false;
        }
        C14412c c14412c = (C14412c) obj;
        return L.f(this.bundleInfo, c14412c.bundleInfo) && this.itemsQuantity == c14412c.itemsQuantity && L.f(this.onAddItemDeepLink, c14412c.onAddItemDeepLink) && L.f(this.discountOnDelivery, c14412c.discountOnDelivery);
    }

    public final int hashCode() {
        Map<String, C14806a> map = this.bundleInfo;
        int iE2 = r.e(this.itemsQuantity, (map == null ? 0 : map.hashCode()) * 31, 31);
        DeepLink deepLink = this.onAddItemDeepLink;
        int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        C49355b c49355b = this.discountOnDelivery;
        return iHashCode + (c49355b != null ? c49355b.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UpdatedCartItems(bundleInfo=" + this.bundleInfo + ", itemsQuantity=" + this.itemsQuantity + ", onAddItemDeepLink=" + this.onAddItemDeepLink + ", discountOnDelivery=" + this.discountOnDelivery + ')';
    }
}
