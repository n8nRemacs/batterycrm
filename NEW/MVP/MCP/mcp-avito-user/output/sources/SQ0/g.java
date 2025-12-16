package Sq0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerPromotionsItems.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSq0/g;", "", "", "itemsOffset", "", "isLastItems", "", "LSq0/c;", "items", "<init>", "(JLjava/lang/Boolean;Ljava/util/List;)V", "J", "b", "()J", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("isLastItems")
    @l
    private final Boolean isLastItems;

    @com.google.gson.annotations.c("items")
    @k
    private final List<c> items;

    @com.google.gson.annotations.c("itemsOffset")
    private final long itemsOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public g(long j12, @l Boolean bool, @k List<? extends c> list) {
        this.itemsOffset = j12;
        this.isLastItems = bool;
        this.items = list;
    }

    @k
    public final List<c> a() {
        return this.items;
    }

    /* renamed from: b, reason: from getter */
    public final long getItemsOffset() {
        return this.itemsOffset;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsLastItems() {
        return this.isLastItems;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.itemsOffset == gVar.itemsOffset && L.f(this.isLastItems, gVar.isLastItems) && L.f(this.items, gVar.items);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.itemsOffset) * 31;
        Boolean bool = this.isLastItems;
        return this.items.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerPromotionsItems(itemsOffset=");
        sb2.append(this.itemsOffset);
        sb2.append(", isLastItems=");
        sb2.append(this.isLastItems);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    public /* synthetic */ g(long j12, Boolean bool, List list, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? Boolean.FALSE : bool, list);
    }
}
