package dX;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.remote.model.quality_service.GradeColor;
import com.avito.android.loyalty.remote.model.quality_service.QualityServiceGradeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceResult.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"LdX/r;", "", "Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "gradeColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "criteriaDeeplink", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo;", "gradeInfo", "LdX/p;", "limitations", "LdX/i;", "benefits", "LdX/k;", "faq", "", "", "alertSlugs", "LdX/q;", Constants.REFERRER_API_META, "<init>", "(Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo;LdX/p;LdX/i;LdX/k;Ljava/util/List;LdX/q;)V", "Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "e", "()Lcom/avito/android/loyalty/remote/model/quality_service/GradeColor;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo;", "f", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo;", "LdX/p;", "g", "()LdX/p;", "LdX/i;", "b", "()LdX/i;", "LdX/k;", "d", "()LdX/k;", "Ljava/util/List;", "a", "()Ljava/util/List;", "LdX/q;", "h", "()LdX/q;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class r {

    @com.google.gson.annotations.c("alertSlugs")
    @Y61.l
    private final List<String> alertSlugs;

    @com.google.gson.annotations.c("benefits")
    @Y61.l
    private final i benefits;

    @com.google.gson.annotations.c("criteriaDeeplink")
    @Y61.k
    private final DeepLink criteriaDeeplink;

    @com.google.gson.annotations.c("faq")
    @Y61.l
    private final k faq;

    @com.google.gson.annotations.c("gradeColor")
    @Y61.l
    private final GradeColor gradeColor;

    @com.google.gson.annotations.c("gradeInfo")
    @Y61.l
    private final QualityServiceGradeInfo gradeInfo;

    @com.google.gson.annotations.c("limitations")
    @Y61.l
    private final p limitations;

    @com.google.gson.annotations.c(Constants.REFERRER_API_META)
    @Y61.l
    private final q meta;

    public r(@Y61.l GradeColor gradeColor, @Y61.k DeepLink deepLink, @Y61.l QualityServiceGradeInfo qualityServiceGradeInfo, @Y61.l p pVar, @Y61.l i iVar, @Y61.l k kVar, @Y61.l List<String> list, @Y61.l q qVar) {
        this.gradeColor = gradeColor;
        this.criteriaDeeplink = deepLink;
        this.gradeInfo = qualityServiceGradeInfo;
        this.limitations = pVar;
        this.benefits = iVar;
        this.faq = kVar;
        this.alertSlugs = list;
        this.meta = qVar;
    }

    @Y61.l
    public final List<String> a() {
        return this.alertSlugs;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final i getBenefits() {
        return this.benefits;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final DeepLink getCriteriaDeeplink() {
        return this.criteriaDeeplink;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final k getFaq() {
        return this.faq;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final GradeColor getGradeColor() {
        return this.gradeColor;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.gradeColor == rVar.gradeColor && L.f(this.criteriaDeeplink, rVar.criteriaDeeplink) && L.f(this.gradeInfo, rVar.gradeInfo) && L.f(this.limitations, rVar.limitations) && L.f(this.benefits, rVar.benefits) && L.f(this.faq, rVar.faq) && L.f(this.alertSlugs, rVar.alertSlugs) && L.f(this.meta, rVar.meta);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final QualityServiceGradeInfo getGradeInfo() {
        return this.gradeInfo;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final p getLimitations() {
        return this.limitations;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final q getMeta() {
        return this.meta;
    }

    public final int hashCode() {
        GradeColor gradeColor = this.gradeColor;
        int iE2 = com.avito.android.actions_sheet.a.e(this.criteriaDeeplink, (gradeColor == null ? 0 : gradeColor.hashCode()) * 31, 31);
        QualityServiceGradeInfo qualityServiceGradeInfo = this.gradeInfo;
        int iHashCode = (iE2 + (qualityServiceGradeInfo == null ? 0 : qualityServiceGradeInfo.hashCode())) * 31;
        p pVar = this.limitations;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        i iVar = this.benefits;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k kVar = this.faq;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<String> list = this.alertSlugs;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        q qVar = this.meta;
        return iHashCode5 + (qVar != null ? qVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "QualityServiceResult(gradeColor=" + this.gradeColor + ", criteriaDeeplink=" + this.criteriaDeeplink + ", gradeInfo=" + this.gradeInfo + ", limitations=" + this.limitations + ", benefits=" + this.benefits + ", faq=" + this.faq + ", alertSlugs=" + this.alertSlugs + ", meta=" + this.meta + ')';
    }
}
