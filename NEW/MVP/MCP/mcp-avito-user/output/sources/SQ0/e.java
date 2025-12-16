package Sq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerPromotionItemsUpdate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"LSq0/e;", "", "", "itemsQuantity", "LSq0/a;", "discountPercents", "LSq0/b;", "promotionCondition", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(IILcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "I", "c", "()I", "b", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("actions")
    @k
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c("discount")
    private final int discountPercents;

    @com.google.gson.annotations.c("itemsQuantity")
    private final int itemsQuantity;

    @com.google.gson.annotations.c("promotionCondition")
    @k
    private final AttributedText promotionCondition;

    public /* synthetic */ e(int i12, int i13, AttributedText attributedText, List list, C42822w c42822w) {
        this(i12, i13, attributedText, list);
    }

    @k
    public final List<BeduinAction> a() {
        return this.actions;
    }

    /* renamed from: b, reason: from getter */
    public final int getDiscountPercents() {
        return this.discountPercents;
    }

    /* renamed from: c, reason: from getter */
    public final int getItemsQuantity() {
        return this.itemsQuantity;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getPromotionCondition() {
        return this.promotionCondition;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.itemsQuantity == eVar.itemsQuantity && this.discountPercents == eVar.discountPercents && L.f(this.promotionCondition, eVar.promotionCondition) && L.f(this.actions, eVar.actions);
    }

    public final int hashCode() {
        return this.actions.hashCode() + com.avito.android.actions_sheet.a.b(r.e(this.discountPercents, Integer.hashCode(this.itemsQuantity) * 31, 31), 31, this.promotionCondition);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerPromotionItemsUpdate(itemsQuantity=");
        sb2.append(this.itemsQuantity);
        sb2.append(", discountPercents=");
        sb2.append((Object) C15214a.b(this.discountPercents));
        sb2.append(", promotionCondition=");
        sb2.append((Object) b.a(this.promotionCondition));
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(int i12, int i13, AttributedText attributedText, List<? extends BeduinAction> list) {
        this.itemsQuantity = i12;
        this.discountPercents = i13;
        this.promotionCondition = attributedText;
        this.actions = list;
    }
}
