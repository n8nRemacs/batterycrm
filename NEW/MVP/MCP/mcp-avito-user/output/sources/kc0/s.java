package KC0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoResult.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"LKC0/s;", "", "", "title", "LKC0/t;", TooltipAttribute.ATTRIBUTE_TYPE, "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "LKC0/r;", "serviceItems", "hint", "<init>", "(Ljava/lang/String;LKC0/t;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "LKC0/t;", "getTooltip", "()LKC0/t;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getServiceItems", "()Ljava/util/List;", "getHint", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class s {

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("hint")
    @Y61.l
    private final AttributedText hint;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<r> serviceItems;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @Y61.l
    private final t tooltip;

    public s(@Y61.k String str, @Y61.l t tVar, @Y61.l AttributedText attributedText, @Y61.k List<r> list, @Y61.l AttributedText attributedText2) {
        this.title = str;
        this.tooltip = tVar;
        this.description = attributedText;
        this.serviceItems = list;
        this.hint = attributedText2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.title, sVar.title) && L.f(this.tooltip, sVar.tooltip) && L.f(this.description, sVar.description) && L.f(this.serviceItems, sVar.serviceItems) && L.f(this.hint, sVar.hint);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        t tVar = this.tooltip;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iE2 = H.e((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.serviceItems);
        AttributedText attributedText2 = this.hint;
        return iE2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesBlock(title=");
        sb2.append(this.title);
        sb2.append(", tooltip=");
        sb2.append(this.tooltip);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", serviceItems=");
        sb2.append(this.serviceItems);
        sb2.append(", hint=");
        return com.avito.android.actions_sheet.a.w(sb2, this.hint, ')');
    }

    public s(String str, t tVar, AttributedText attributedText, List list, AttributedText attributedText2, int i12, C42822w c42822w) {
        this(str, tVar, attributedText, (i12 & 8) != 0 ? C42784z0.f406748b : list, attributedText2);
    }
}
