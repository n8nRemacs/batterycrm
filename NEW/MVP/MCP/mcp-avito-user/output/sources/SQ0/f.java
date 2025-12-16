package Sq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerPromotions.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b'\u0010\u0019R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b,\u0010\u0019R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b-\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"LSq0/f;", "", "", "xHash", "title", "LSq0/a;", "discountPercents", "LSq0/b;", "promotionCondition", "", "itemsOffset", "", "isLastItems", "topFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "LSq0/c;", "mainComponents", "bottomFormId", "bottomComponents", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/remote/model/text/AttributedText;JLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "g", "I", "c", "()I", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "d", "()J", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "i", "Ljava/util/List;", "h", "()Ljava/util/List;", "e", "b", "a", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @com.google.gson.annotations.c("bottomFormId")
    @k
    private final String bottomFormId;

    @com.google.gson.annotations.c("discount")
    private final int discountPercents;

    @com.google.gson.annotations.c("isLastItems")
    @l
    private final Boolean isLastItems;

    @com.google.gson.annotations.c("itemsOffset")
    private final long itemsOffset;

    @com.google.gson.annotations.c("mainComponents")
    @k
    private final List<c> mainComponents;

    @com.google.gson.annotations.c("promotionCondition")
    @k
    private final AttributedText promotionCondition;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @com.google.gson.annotations.c("topFormId")
    @k
    private final String topFormId;

    @com.google.gson.annotations.c("xHash")
    @l
    private final String xHash;

    public /* synthetic */ f(String str, String str2, int i12, AttributedText attributedText, long j12, Boolean bool, String str3, List list, List list2, String str4, List list3, C42822w c42822w) {
        this(str, str2, i12, attributedText, j12, bool, str3, list, list2, str4, list3);
    }

    @l
    public final List<BeduinModel> a() {
        return this.bottomComponents;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    /* renamed from: c, reason: from getter */
    public final int getDiscountPercents() {
        return this.discountPercents;
    }

    /* renamed from: d, reason: from getter */
    public final long getItemsOffset() {
        return this.itemsOffset;
    }

    @k
    public final List<c> e() {
        return this.mainComponents;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.xHash, fVar.xHash) && L.f(this.title, fVar.title) && this.discountPercents == fVar.discountPercents && L.f(this.promotionCondition, fVar.promotionCondition) && this.itemsOffset == fVar.itemsOffset && L.f(this.isLastItems, fVar.isLastItems) && L.f(this.topFormId, fVar.topFormId) && L.f(this.topComponents, fVar.topComponents) && L.f(this.mainComponents, fVar.mainComponents) && L.f(this.bottomFormId, fVar.bottomFormId) && L.f(this.bottomComponents, fVar.bottomComponents);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final AttributedText getPromotionCondition() {
        return this.promotionCondition;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<BeduinModel> h() {
        return this.topComponents;
    }

    public final int hashCode() {
        String str = this.xHash;
        int iG2 = r.g(com.avito.android.actions_sheet.a.b(r.e(this.discountPercents, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31), 31, this.promotionCondition), 31, this.itemsOffset);
        Boolean bool = this.isLastItems;
        int iD2 = H.d((iG2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.topFormId);
        List<BeduinModel> list = this.topComponents;
        int iD3 = H.d(H.e((iD2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.mainComponents), 31, this.bottomFormId);
        List<BeduinModel> list2 = this.bottomComponents;
        return iD3 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final Boolean getIsLastItems() {
        return this.isLastItems;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerPromotions(xHash=");
        sb2.append(this.xHash);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", discountPercents=");
        sb2.append((Object) C15214a.b(this.discountPercents));
        sb2.append(", promotionCondition=");
        sb2.append((Object) b.a(this.promotionCondition));
        sb2.append(", itemsOffset=");
        sb2.append(this.itemsOffset);
        sb2.append(", isLastItems=");
        sb2.append(this.isLastItems);
        sb2.append(", topFormId=");
        sb2.append(this.topFormId);
        sb2.append(", topComponents=");
        sb2.append(this.topComponents);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", bottomComponents=");
        return H.p(sb2, this.bottomComponents, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(String str, String str2, int i12, AttributedText attributedText, long j12, Boolean bool, String str3, List<? extends BeduinModel> list, List<? extends c> list2, String str4, List<? extends BeduinModel> list3) {
        this.xHash = str;
        this.title = str2;
        this.discountPercents = i12;
        this.promotionCondition = attributedText;
        this.itemsOffset = j12;
        this.isLastItems = bool;
        this.topFormId = str3;
        this.topComponents = list;
        this.mainComponents = list2;
        this.bottomFormId = str4;
        this.bottomComponents = list3;
    }
}
