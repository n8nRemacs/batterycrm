package JZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.PreApprovalScoreStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalScore.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"LJZ/o;", "", "Lcom/avito/android/mortgage/api/model/PreApprovalScoreStatus;", "status", "", "title", "subtitle", "", "LJZ/p;", "points", "LJZ/g;", "expandableBlock", "actionText", "<init>", "(Lcom/avito/android/mortgage/api/model/PreApprovalScoreStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LJZ/g;Ljava/lang/String;)V", "Lcom/avito/android/mortgage/api/model/PreApprovalScoreStatus;", "e", "()Lcom/avito/android/mortgage/api/model/PreApprovalScoreStatus;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "f", "Ljava/util/List;", "d", "()Ljava/util/List;", "LJZ/g;", "c", "()LJZ/g;", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class o {

    @com.google.gson.annotations.c("actionText")
    @Y61.k
    private final String actionText;

    @com.google.gson.annotations.c("expandableBlock")
    @Y61.l
    private final g expandableBlock;

    @com.google.gson.annotations.c("points")
    @Y61.l
    private final List<p> points;

    @com.google.gson.annotations.c("status")
    @Y61.k
    private final PreApprovalScoreStatus status;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public o(@Y61.k PreApprovalScoreStatus preApprovalScoreStatus, @Y61.k String str, @Y61.l String str2, @Y61.l List<p> list, @Y61.l g gVar, @Y61.k String str3) {
        this.status = preApprovalScoreStatus;
        this.title = str;
        this.subtitle = str2;
        this.points = list;
        this.expandableBlock = gVar;
        this.actionText = str3;
    }

    public static o a(o oVar, g gVar) {
        return new o(oVar.status, oVar.title, oVar.subtitle, oVar.points, gVar, oVar.actionText);
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final g getExpandableBlock() {
        return this.expandableBlock;
    }

    @Y61.l
    public final List<p> d() {
        return this.points;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final PreApprovalScoreStatus getStatus() {
        return this.status;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.status == oVar.status && L.f(this.title, oVar.title) && L.f(this.subtitle, oVar.subtitle) && L.f(this.points, oVar.points) && L.f(this.expandableBlock, oVar.expandableBlock) && L.f(this.actionText, oVar.actionText);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(this.status.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        List<p> list = this.points;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.expandableBlock;
        return this.actionText.hashCode() + ((iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreApprovalScore(status=");
        sb2.append(this.status);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", points=");
        sb2.append(this.points);
        sb2.append(", expandableBlock=");
        sb2.append(this.expandableBlock);
        sb2.append(", actionText=");
        return C22026a.c(sb2, this.actionText, ')');
    }
}
