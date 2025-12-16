package fW0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LfW0/b;", "", "", "maxViews", "maxContacts", "maxActive", "maxSpendings", "maxClickPackages", "maxJobContacts", "maxCalls", "maxSoldItems", "maxOrderedItems", "", "LfW0/c;", "items", "<init>", "(FFFFFFFFFLjava/util/List;)V", "F", "getMaxViews", "()F", "getMaxContacts", "getMaxActive", "getMaxSpendings", "getMaxClickPackages", "getMaxJobContacts", "getMaxCalls", "getMaxSoldItems", "getMaxOrderedItems", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40349b {

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<C40350c> items;

    @com.google.gson.annotations.c("maxActive")
    private final float maxActive;

    @com.google.gson.annotations.c("maxCalls")
    private final float maxCalls;

    @com.google.gson.annotations.c("maxClickPackages")
    private final float maxClickPackages;

    @com.google.gson.annotations.c("maxContacts")
    private final float maxContacts;

    @com.google.gson.annotations.c("maxJobContacts")
    private final float maxJobContacts;

    @com.google.gson.annotations.c("maxOrderedItems")
    private final float maxOrderedItems;

    @com.google.gson.annotations.c("maxSoldItems")
    private final float maxSoldItems;

    @com.google.gson.annotations.c("maxSpendings")
    private final float maxSpendings;

    @com.google.gson.annotations.c("maxViews")
    private final float maxViews;

    public C40349b(float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f22, @Y61.k List<C40350c> list) {
        this.maxViews = f12;
        this.maxContacts = f13;
        this.maxActive = f14;
        this.maxSpendings = f15;
        this.maxClickPackages = f16;
        this.maxJobContacts = f17;
        this.maxCalls = f18;
        this.maxSoldItems = f19;
        this.maxOrderedItems = f22;
        this.items = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40349b)) {
            return false;
        }
        C40349b c40349b = (C40349b) obj;
        return Float.compare(this.maxViews, c40349b.maxViews) == 0 && Float.compare(this.maxContacts, c40349b.maxContacts) == 0 && Float.compare(this.maxActive, c40349b.maxActive) == 0 && Float.compare(this.maxSpendings, c40349b.maxSpendings) == 0 && Float.compare(this.maxClickPackages, c40349b.maxClickPackages) == 0 && Float.compare(this.maxJobContacts, c40349b.maxJobContacts) == 0 && Float.compare(this.maxCalls, c40349b.maxCalls) == 0 && Float.compare(this.maxSoldItems, c40349b.maxSoldItems) == 0 && Float.compare(this.maxOrderedItems, c40349b.maxOrderedItems) == 0 && L.f(this.items, c40349b.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + androidx.appcompat.app.r.d(this.maxOrderedItems, androidx.appcompat.app.r.d(this.maxSoldItems, androidx.appcompat.app.r.d(this.maxCalls, androidx.appcompat.app.r.d(this.maxJobContacts, androidx.appcompat.app.r.d(this.maxClickPackages, androidx.appcompat.app.r.d(this.maxSpendings, androidx.appcompat.app.r.d(this.maxActive, androidx.appcompat.app.r.d(this.maxContacts, Float.hashCode(this.maxViews) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Chart(maxViews=");
        sb2.append(this.maxViews);
        sb2.append(", maxContacts=");
        sb2.append(this.maxContacts);
        sb2.append(", maxActive=");
        sb2.append(this.maxActive);
        sb2.append(", maxSpendings=");
        sb2.append(this.maxSpendings);
        sb2.append(", maxClickPackages=");
        sb2.append(this.maxClickPackages);
        sb2.append(", maxJobContacts=");
        sb2.append(this.maxJobContacts);
        sb2.append(", maxCalls=");
        sb2.append(this.maxCalls);
        sb2.append(", maxSoldItems=");
        sb2.append(this.maxSoldItems);
        sb2.append(", maxOrderedItems=");
        sb2.append(this.maxOrderedItems);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }
}
