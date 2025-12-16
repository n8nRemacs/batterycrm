package JZ;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.ConfirmCloseContent;
import com.avito.android.mortgage.api.model.LegalRequirements;
import com.avito.android.mortgage.api.model.MortgageTerms;
import com.avito.android.mortgage.api.model.MortgageVerificationFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationMetaInfo.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"LJZ/d;", "", "Lcom/avito/android/mortgage/api/model/MortgageTerms;", "mortgageTerms", "LJZ/n;", "selectedAppeal", "LJZ/r;", "stepDetails", "Lcom/avito/android/mortgage/api/model/ConfirmCloseContent;", "confirmCloseContent", "Lcom/avito/android/mortgage/api/model/LegalRequirements;", "legalRequirements", "Lcom/avito/android/deep_linking/links/DeepLink;", "openOnFirstLoad", "Lcom/avito/android/mortgage/api/model/MortgageVerificationFlow;", "verificationFlow", "LJZ/a;", "analytics", "<init>", "(Lcom/avito/android/mortgage/api/model/MortgageTerms;LJZ/n;LJZ/r;Lcom/avito/android/mortgage/api/model/ConfirmCloseContent;Lcom/avito/android/mortgage/api/model/LegalRequirements;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/mortgage/api/model/MortgageVerificationFlow;LJZ/a;)V", "Lcom/avito/android/mortgage/api/model/MortgageTerms;", "d", "()Lcom/avito/android/mortgage/api/model/MortgageTerms;", "LJZ/n;", "f", "()LJZ/n;", "LJZ/r;", "g", "()LJZ/r;", "Lcom/avito/android/mortgage/api/model/ConfirmCloseContent;", "b", "()Lcom/avito/android/mortgage/api/model/ConfirmCloseContent;", "Lcom/avito/android/mortgage/api/model/LegalRequirements;", "c", "()Lcom/avito/android/mortgage/api/model/LegalRequirements;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/mortgage/api/model/MortgageVerificationFlow;", "h", "()Lcom/avito/android/mortgage/api/model/MortgageVerificationFlow;", "LJZ/a;", "a", "()LJZ/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c("analytics")
    @Y61.k
    private final a analytics;

    @com.google.gson.annotations.c("closingConfirm")
    @Y61.l
    private final ConfirmCloseContent confirmCloseContent;

    @com.google.gson.annotations.c("legalRequirements")
    @Y61.l
    private final LegalRequirements legalRequirements;

    @com.google.gson.annotations.c("mortgageTerms")
    @Y61.l
    private final MortgageTerms mortgageTerms;

    @com.google.gson.annotations.c("openOnFirstLoad")
    @Y61.l
    private final DeepLink openOnFirstLoad;

    @com.google.gson.annotations.c("selectedAppeal")
    @Y61.l
    private final n selectedAppeal;

    @com.google.gson.annotations.c("stepsDetails")
    @Y61.l
    private final r stepDetails;

    @com.google.gson.annotations.c("verificationFlow")
    @Y61.l
    private final MortgageVerificationFlow verificationFlow;

    public d(@Y61.l MortgageTerms mortgageTerms, @Y61.l n nVar, @Y61.l r rVar, @Y61.l ConfirmCloseContent confirmCloseContent, @Y61.l LegalRequirements legalRequirements, @Y61.l DeepLink deepLink, @Y61.l MortgageVerificationFlow mortgageVerificationFlow, @Y61.k a aVar) {
        this.mortgageTerms = mortgageTerms;
        this.selectedAppeal = nVar;
        this.stepDetails = rVar;
        this.confirmCloseContent = confirmCloseContent;
        this.legalRequirements = legalRequirements;
        this.openOnFirstLoad = deepLink;
        this.verificationFlow = mortgageVerificationFlow;
        this.analytics = aVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final a getAnalytics() {
        return this.analytics;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final ConfirmCloseContent getConfirmCloseContent() {
        return this.confirmCloseContent;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final LegalRequirements getLegalRequirements() {
        return this.legalRequirements;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final MortgageTerms getMortgageTerms() {
        return this.mortgageTerms;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final DeepLink getOpenOnFirstLoad() {
        return this.openOnFirstLoad;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.mortgageTerms, dVar.mortgageTerms) && L.f(this.selectedAppeal, dVar.selectedAppeal) && L.f(this.stepDetails, dVar.stepDetails) && L.f(this.confirmCloseContent, dVar.confirmCloseContent) && L.f(this.legalRequirements, dVar.legalRequirements) && L.f(this.openOnFirstLoad, dVar.openOnFirstLoad) && L.f(this.verificationFlow, dVar.verificationFlow) && L.f(this.analytics, dVar.analytics);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final n getSelectedAppeal() {
        return this.selectedAppeal;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final r getStepDetails() {
        return this.stepDetails;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final MortgageVerificationFlow getVerificationFlow() {
        return this.verificationFlow;
    }

    public final int hashCode() {
        MortgageTerms mortgageTerms = this.mortgageTerms;
        int iHashCode = (mortgageTerms == null ? 0 : mortgageTerms.hashCode()) * 31;
        n nVar = this.selectedAppeal;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        r rVar = this.stepDetails;
        int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        ConfirmCloseContent confirmCloseContent = this.confirmCloseContent;
        int iHashCode4 = (iHashCode3 + (confirmCloseContent == null ? 0 : confirmCloseContent.hashCode())) * 31;
        LegalRequirements legalRequirements = this.legalRequirements;
        int iHashCode5 = (iHashCode4 + (legalRequirements == null ? 0 : legalRequirements.hashCode())) * 31;
        DeepLink deepLink = this.openOnFirstLoad;
        int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        MortgageVerificationFlow mortgageVerificationFlow = this.verificationFlow;
        return this.analytics.hashCode() + ((iHashCode6 + (mortgageVerificationFlow != null ? mortgageVerificationFlow.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ApplicationMetaInfo(mortgageTerms=" + this.mortgageTerms + ", selectedAppeal=" + this.selectedAppeal + ", stepDetails=" + this.stepDetails + ", confirmCloseContent=" + this.confirmCloseContent + ", legalRequirements=" + this.legalRequirements + ", openOnFirstLoad=" + this.openOnFirstLoad + ", verificationFlow=" + this.verificationFlow + ", analytics=" + this.analytics + ')';
    }
}
