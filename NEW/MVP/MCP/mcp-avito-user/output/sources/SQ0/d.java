package Sq0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerPromotionCondition.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"LSq0/d;", "", "LSq0/a;", "discount", "LSq0/b;", "promotionCondition", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(ILcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "I", "b", "()I", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c("actions")
    @l
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c("discount")
    private final int discount;

    @com.google.gson.annotations.c("promotionCondition")
    @k
    private final AttributedText promotionCondition;

    public /* synthetic */ d(int i12, AttributedText attributedText, List list, C42822w c42822w) {
        this(i12, attributedText, list);
    }

    @l
    public final List<BeduinAction> a() {
        return this.actions;
    }

    /* renamed from: b, reason: from getter */
    public final int getDiscount() {
        return this.discount;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getPromotionCondition() {
        return this.promotionCondition;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.discount == dVar.discount && L.f(this.promotionCondition, dVar.promotionCondition) && L.f(this.actions, dVar.actions);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(Integer.hashCode(this.discount) * 31, 31, this.promotionCondition);
        List<BeduinAction> list = this.actions;
        return iB2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerPromotionCondition(discount=");
        sb2.append((Object) C15214a.b(this.discount));
        sb2.append(", promotionCondition=");
        sb2.append((Object) b.a(this.promotionCondition));
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(int i12, AttributedText attributedText, List<? extends BeduinAction> list) {
        this.discount = i12;
        this.promotionCondition = attributedText;
        this.actions = list;
    }
}
