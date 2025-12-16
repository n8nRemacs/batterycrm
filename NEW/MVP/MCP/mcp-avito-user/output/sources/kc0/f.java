package KC0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoResult.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LKC0/f;", "", "", "title", "Lcom/avito/android/remote/model/ButtonAction;", "conditionsButton", "", "LKC0/n;", "monthResultItems", "LKC0/o;", "overviewBlock", "LKC0/s;", "servicesBlock", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;LKC0/o;LKC0/s;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/ButtonAction;", "getConditionsButton", "()Lcom/avito/android/remote/model/ButtonAction;", "Ljava/util/List;", "getMonthResultItems", "()Ljava/util/List;", "LKC0/o;", "getOverviewBlock", "()LKC0/o;", "LKC0/s;", "getServicesBlock", "()LKC0/s;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("conditionsButton")
    @Y61.l
    private final ButtonAction conditionsButton;

    @com.google.gson.annotations.c("monthResultItems")
    @Y61.k
    private final List<n> monthResultItems;

    @com.google.gson.annotations.c("overviewBlock")
    @Y61.k
    private final o overviewBlock;

    @com.google.gson.annotations.c("servicesBlock")
    @Y61.k
    private final s servicesBlock;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public f(@Y61.k String str, @Y61.l ButtonAction buttonAction, @Y61.k List<n> list, @Y61.k o oVar, @Y61.k s sVar) {
        this.title = str;
        this.conditionsButton = buttonAction;
        this.monthResultItems = list;
        this.overviewBlock = oVar;
        this.servicesBlock = sVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.title, fVar.title) && L.f(this.conditionsButton, fVar.conditionsButton) && L.f(this.monthResultItems, fVar.monthResultItems) && L.f(this.overviewBlock, fVar.overviewBlock) && L.f(this.servicesBlock, fVar.servicesBlock);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        ButtonAction buttonAction = this.conditionsButton;
        return this.servicesBlock.hashCode() + ((this.overviewBlock.hashCode() + H.e((iHashCode + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31, 31, this.monthResultItems)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "CptInfoResult(title=" + this.title + ", conditionsButton=" + this.conditionsButton + ", monthResultItems=" + this.monthResultItems + ", overviewBlock=" + this.overviewBlock + ", servicesBlock=" + this.servicesBlock + ')';
    }

    public f(String str, ButtonAction buttonAction, List list, o oVar, s sVar, int i12, C42822w c42822w) {
        this(str, buttonAction, (i12 & 4) != 0 ? C42784z0.f406748b : list, oVar, sVar);
    }
}
