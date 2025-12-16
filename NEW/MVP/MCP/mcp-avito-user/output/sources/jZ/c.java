package JZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.mortgage.api.model.ApplicationHeaderStyle;
import com.avito.android.mortgage.api.model.ApplicationHeaderType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationHeader.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LJZ/c;", "", "", "", "bankIconsUrlsMeta", "description", "details", "Lcom/avito/android/mortgage/api/model/ApplicationHeaderType;", "headerTypeMeta", "Lcom/avito/android/mortgage/api/model/ApplicationHeaderStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "currentStepIdx", "steps", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/ApplicationHeaderType;Lcom/avito/android/mortgage/api/model/ApplicationHeaderStyle;ILjava/util/List;)V", "Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/avito/android/mortgage/api/model/ApplicationHeaderType;", "Lcom/avito/android/mortgage/api/model/ApplicationHeaderStyle;", "g", "()Lcom/avito/android/mortgage/api/model/ApplicationHeaderStyle;", "I", "b", "()I", "f", "()Ljava/util/List;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("bankIcons")
    @Y61.l
    private final List<String> bankIconsUrlsMeta;

    @com.google.gson.annotations.c("currentStepIndex")
    private final int currentStepIdx;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final String description;

    @com.google.gson.annotations.c("details")
    @Y61.l
    private final String details;

    @com.google.gson.annotations.c("type")
    @Y61.l
    private final ApplicationHeaderType headerTypeMeta;

    @com.google.gson.annotations.c("steps")
    @Y61.k
    private final List<String> steps;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final ApplicationHeaderStyle style;

    public c(@Y61.l List<String> list, @Y61.k String str, @Y61.l String str2, @Y61.l ApplicationHeaderType applicationHeaderType, @Y61.l ApplicationHeaderStyle applicationHeaderStyle, int i12, @Y61.k List<String> list2) {
        this.bankIconsUrlsMeta = list;
        this.description = str;
        this.details = str2;
        this.headerTypeMeta = applicationHeaderType;
        this.style = applicationHeaderStyle;
        this.currentStepIdx = i12;
        this.steps = list2;
    }

    @Y61.k
    public final List<String> a() {
        List<String> list = this.bankIconsUrlsMeta;
        return list == null ? C42784z0.f406748b : list;
    }

    /* renamed from: b, reason: from getter */
    public final int getCurrentStepIdx() {
        return this.currentStepIdx;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @Y61.k
    public final ApplicationHeaderType e() {
        ApplicationHeaderType applicationHeaderType = this.headerTypeMeta;
        return applicationHeaderType == null ? ApplicationHeaderType.MORTGAGE : applicationHeaderType;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.bankIconsUrlsMeta, cVar.bankIconsUrlsMeta) && L.f(this.description, cVar.description) && L.f(this.details, cVar.details) && this.headerTypeMeta == cVar.headerTypeMeta && this.style == cVar.style && this.currentStepIdx == cVar.currentStepIdx && L.f(this.steps, cVar.steps);
    }

    @Y61.k
    public final List<String> f() {
        return this.steps;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final ApplicationHeaderStyle getStyle() {
        return this.style;
    }

    public final int hashCode() {
        List<String> list = this.bankIconsUrlsMeta;
        int iD2 = H.d((list == null ? 0 : list.hashCode()) * 31, 31, this.description);
        String str = this.details;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ApplicationHeaderType applicationHeaderType = this.headerTypeMeta;
        int iHashCode2 = (iHashCode + (applicationHeaderType == null ? 0 : applicationHeaderType.hashCode())) * 31;
        ApplicationHeaderStyle applicationHeaderStyle = this.style;
        return this.steps.hashCode() + androidx.appcompat.app.r.e(this.currentStepIdx, (iHashCode2 + (applicationHeaderStyle != null ? applicationHeaderStyle.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationHeader(bankIconsUrlsMeta=");
        sb2.append(this.bankIconsUrlsMeta);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", headerTypeMeta=");
        sb2.append(this.headerTypeMeta);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", currentStepIdx=");
        sb2.append(this.currentStepIdx);
        sb2.append(", steps=");
        return H.p(sb2, this.steps, ')');
    }
}
