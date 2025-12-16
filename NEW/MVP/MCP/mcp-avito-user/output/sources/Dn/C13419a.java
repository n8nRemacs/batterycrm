package Dn;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api3CartItemsUpdatePostResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LDn/a;", "", "", "", "LDn/f;", "bundleInfo", "LDn/b;", "discountOnDelivery", "", "itemsQuantity", "Lcom/avito/android/deep_linking/links/DeepLink;", "onAddItemDeepLink", "<init>", "(Ljava/util/Map;LDn/b;JLcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "LDn/b;", "b", "()LDn/b;", "J", "c", "()J", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13419a {

    @com.google.gson.annotations.c("bundleInfo")
    @l
    private final Map<String, f> bundleInfo;

    @com.google.gson.annotations.c("discountOnDelivery")
    @l
    private final C13420b discountOnDelivery;

    @com.google.gson.annotations.c("itemsQuantity")
    private final long itemsQuantity;

    @com.google.gson.annotations.c("onAddItemDeepLink")
    @k
    private final DeepLink onAddItemDeepLink;

    public C13419a(@l Map<String, f> map, @l C13420b c13420b, long j12, @k DeepLink deepLink) {
        this.bundleInfo = map;
        this.discountOnDelivery = c13420b;
        this.itemsQuantity = j12;
        this.onAddItemDeepLink = deepLink;
    }

    @l
    public final Map<String, f> a() {
        return this.bundleInfo;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C13420b getDiscountOnDelivery() {
        return this.discountOnDelivery;
    }

    /* renamed from: c, reason: from getter */
    public final long getItemsQuantity() {
        return this.itemsQuantity;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DeepLink getOnAddItemDeepLink() {
        return this.onAddItemDeepLink;
    }
}
