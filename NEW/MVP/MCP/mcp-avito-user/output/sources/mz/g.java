package MZ;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingCalculation.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b+\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b0\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b1\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b2\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b3\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b4\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b5\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b6\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b7\u0010%R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b8\u0010%R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"LMZ/g;", "", "LMZ/h;", "layout", "LNZ/c;", "regionId", "LNZ/f;", "purposeId", "LNZ/a;", "propertyCost", "landCost", "houseCost", "downPayment", "creditTerm", "LNZ/h;", "mortgageProgram", "borrowerAge", "occupation", "totalExperience", "currentExperience", "selfEmployedExperience", "businessAge", "proofOfIncome", "bankPayrollId", "bankSalaryId", "Lcom/avito/android/deep_linking/links/DeepLink;", "preApprovalDeeplink", "<init>", "(LMZ/h;LNZ/c;LNZ/f;LNZ/a;LNZ/a;LNZ/a;LNZ/a;LNZ/a;LNZ/h;LNZ/f;LNZ/f;LNZ/f;LNZ/f;LNZ/f;LNZ/f;LNZ/f;LNZ/f;LNZ/f;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LMZ/h;", "j", "()LMZ/h;", "LNZ/c;", "p", "()LNZ/c;", "LNZ/f;", "o", "()LNZ/f;", "LNZ/a;", "n", "()LNZ/a;", "i", "h", "g", "e", "LNZ/h;", "k", "()LNZ/h;", "c", "l", "r", "f", "q", "d", "m", "a", "b", "Lcom/avito/android/deep_linking/links/DeepLink;", "getPreApprovalDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("bankPayrollId")
    @Y61.l
    private final NZ.f bankPayrollId;

    @com.google.gson.annotations.c("bankSalaryId")
    @Y61.l
    private final NZ.f bankSalaryId;

    @com.google.gson.annotations.c("landingBorrowerAge")
    @Y61.l
    private final NZ.f borrowerAge;

    @com.google.gson.annotations.c("businessAge")
    @Y61.l
    private final NZ.f businessAge;

    @com.google.gson.annotations.c("creditTerm")
    @Y61.l
    private final NZ.a creditTerm;

    @com.google.gson.annotations.c("currentExperience")
    @Y61.l
    private final NZ.f currentExperience;

    @com.google.gson.annotations.c("downPayment")
    @Y61.l
    private final NZ.a downPayment;

    @com.google.gson.annotations.c("houseCost")
    @Y61.l
    private final NZ.a houseCost;

    @com.google.gson.annotations.c("landCost")
    @Y61.l
    private final NZ.a landCost;

    @com.google.gson.annotations.c("layout")
    @Y61.l
    private final h layout;

    @com.google.gson.annotations.c("mortgageProgram")
    @Y61.l
    private final NZ.h mortgageProgram;

    @com.google.gson.annotations.c("occupation")
    @Y61.l
    private final NZ.f occupation;

    @com.google.gson.annotations.c("preApprovalDeeplink")
    @Y61.l
    private final DeepLink preApprovalDeeplink;

    @com.google.gson.annotations.c("proofOfIncome")
    @Y61.l
    private final NZ.f proofOfIncome;

    @com.google.gson.annotations.c("propertyCost")
    @Y61.l
    private final NZ.a propertyCost;

    @com.google.gson.annotations.c("purposeId")
    @Y61.l
    private final NZ.f purposeId;

    @com.google.gson.annotations.c("regionId")
    @Y61.l
    private final NZ.c regionId;

    @com.google.gson.annotations.c("selfEmployedExperience")
    @Y61.l
    private final NZ.f selfEmployedExperience;

    @com.google.gson.annotations.c("totalExperience")
    @Y61.l
    private final NZ.f totalExperience;

    public g(@Y61.l h hVar, @Y61.l NZ.c cVar, @Y61.l NZ.f fVar, @Y61.l NZ.a aVar, @Y61.l NZ.a aVar2, @Y61.l NZ.a aVar3, @Y61.l NZ.a aVar4, @Y61.l NZ.a aVar5, @Y61.l NZ.h hVar2, @Y61.l NZ.f fVar2, @Y61.l NZ.f fVar3, @Y61.l NZ.f fVar4, @Y61.l NZ.f fVar5, @Y61.l NZ.f fVar6, @Y61.l NZ.f fVar7, @Y61.l NZ.f fVar8, @Y61.l NZ.f fVar9, @Y61.l NZ.f fVar10, @Y61.l DeepLink deepLink) {
        this.layout = hVar;
        this.regionId = cVar;
        this.purposeId = fVar;
        this.propertyCost = aVar;
        this.landCost = aVar2;
        this.houseCost = aVar3;
        this.downPayment = aVar4;
        this.creditTerm = aVar5;
        this.mortgageProgram = hVar2;
        this.borrowerAge = fVar2;
        this.occupation = fVar3;
        this.totalExperience = fVar4;
        this.currentExperience = fVar5;
        this.selfEmployedExperience = fVar6;
        this.businessAge = fVar7;
        this.proofOfIncome = fVar8;
        this.bankPayrollId = fVar9;
        this.bankSalaryId = fVar10;
        this.preApprovalDeeplink = deepLink;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final NZ.f getBankPayrollId() {
        return this.bankPayrollId;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final NZ.f getBankSalaryId() {
        return this.bankSalaryId;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final NZ.f getBorrowerAge() {
        return this.borrowerAge;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final NZ.f getBusinessAge() {
        return this.businessAge;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final NZ.a getCreditTerm() {
        return this.creditTerm;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.layout, gVar.layout) && L.f(this.regionId, gVar.regionId) && L.f(this.purposeId, gVar.purposeId) && L.f(this.propertyCost, gVar.propertyCost) && L.f(this.landCost, gVar.landCost) && L.f(this.houseCost, gVar.houseCost) && L.f(this.downPayment, gVar.downPayment) && L.f(this.creditTerm, gVar.creditTerm) && L.f(this.mortgageProgram, gVar.mortgageProgram) && L.f(this.borrowerAge, gVar.borrowerAge) && L.f(this.occupation, gVar.occupation) && L.f(this.totalExperience, gVar.totalExperience) && L.f(this.currentExperience, gVar.currentExperience) && L.f(this.selfEmployedExperience, gVar.selfEmployedExperience) && L.f(this.businessAge, gVar.businessAge) && L.f(this.proofOfIncome, gVar.proofOfIncome) && L.f(this.bankPayrollId, gVar.bankPayrollId) && L.f(this.bankSalaryId, gVar.bankSalaryId) && L.f(this.preApprovalDeeplink, gVar.preApprovalDeeplink);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final NZ.f getCurrentExperience() {
        return this.currentExperience;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final NZ.a getDownPayment() {
        return this.downPayment;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final NZ.a getHouseCost() {
        return this.houseCost;
    }

    public final int hashCode() {
        h hVar = this.layout;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        NZ.c cVar = this.regionId;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        NZ.f fVar = this.purposeId;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        NZ.a aVar = this.propertyCost;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        NZ.a aVar2 = this.landCost;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        NZ.a aVar3 = this.houseCost;
        int iHashCode6 = (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        NZ.a aVar4 = this.downPayment;
        int iHashCode7 = (iHashCode6 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        NZ.a aVar5 = this.creditTerm;
        int iHashCode8 = (iHashCode7 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        NZ.h hVar2 = this.mortgageProgram;
        int iHashCode9 = (iHashCode8 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        NZ.f fVar2 = this.borrowerAge;
        int iHashCode10 = (iHashCode9 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        NZ.f fVar3 = this.occupation;
        int iHashCode11 = (iHashCode10 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        NZ.f fVar4 = this.totalExperience;
        int iHashCode12 = (iHashCode11 + (fVar4 == null ? 0 : fVar4.hashCode())) * 31;
        NZ.f fVar5 = this.currentExperience;
        int iHashCode13 = (iHashCode12 + (fVar5 == null ? 0 : fVar5.hashCode())) * 31;
        NZ.f fVar6 = this.selfEmployedExperience;
        int iHashCode14 = (iHashCode13 + (fVar6 == null ? 0 : fVar6.hashCode())) * 31;
        NZ.f fVar7 = this.businessAge;
        int iHashCode15 = (iHashCode14 + (fVar7 == null ? 0 : fVar7.hashCode())) * 31;
        NZ.f fVar8 = this.proofOfIncome;
        int iHashCode16 = (iHashCode15 + (fVar8 == null ? 0 : fVar8.hashCode())) * 31;
        NZ.f fVar9 = this.bankPayrollId;
        int iHashCode17 = (iHashCode16 + (fVar9 == null ? 0 : fVar9.hashCode())) * 31;
        NZ.f fVar10 = this.bankSalaryId;
        int iHashCode18 = (iHashCode17 + (fVar10 == null ? 0 : fVar10.hashCode())) * 31;
        DeepLink deepLink = this.preApprovalDeeplink;
        return iHashCode18 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final NZ.a getLandCost() {
        return this.landCost;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final h getLayout() {
        return this.layout;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final NZ.h getMortgageProgram() {
        return this.mortgageProgram;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final NZ.f getOccupation() {
        return this.occupation;
    }

    @Y61.l
    /* renamed from: m, reason: from getter */
    public final NZ.f getProofOfIncome() {
        return this.proofOfIncome;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final NZ.a getPropertyCost() {
        return this.propertyCost;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final NZ.f getPurposeId() {
        return this.purposeId;
    }

    @Y61.l
    /* renamed from: p, reason: from getter */
    public final NZ.c getRegionId() {
        return this.regionId;
    }

    @Y61.l
    /* renamed from: q, reason: from getter */
    public final NZ.f getSelfEmployedExperience() {
        return this.selfEmployedExperience;
    }

    @Y61.l
    /* renamed from: r, reason: from getter */
    public final NZ.f getTotalExperience() {
        return this.totalExperience;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingCalculation(layout=");
        sb2.append(this.layout);
        sb2.append(", regionId=");
        sb2.append(this.regionId);
        sb2.append(", purposeId=");
        sb2.append(this.purposeId);
        sb2.append(", propertyCost=");
        sb2.append(this.propertyCost);
        sb2.append(", landCost=");
        sb2.append(this.landCost);
        sb2.append(", houseCost=");
        sb2.append(this.houseCost);
        sb2.append(", downPayment=");
        sb2.append(this.downPayment);
        sb2.append(", creditTerm=");
        sb2.append(this.creditTerm);
        sb2.append(", mortgageProgram=");
        sb2.append(this.mortgageProgram);
        sb2.append(", borrowerAge=");
        sb2.append(this.borrowerAge);
        sb2.append(", occupation=");
        sb2.append(this.occupation);
        sb2.append(", totalExperience=");
        sb2.append(this.totalExperience);
        sb2.append(", currentExperience=");
        sb2.append(this.currentExperience);
        sb2.append(", selfEmployedExperience=");
        sb2.append(this.selfEmployedExperience);
        sb2.append(", businessAge=");
        sb2.append(this.businessAge);
        sb2.append(", proofOfIncome=");
        sb2.append(this.proofOfIncome);
        sb2.append(", bankPayrollId=");
        sb2.append(this.bankPayrollId);
        sb2.append(", bankSalaryId=");
        sb2.append(this.bankSalaryId);
        sb2.append(", preApprovalDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.preApprovalDeeplink, ')');
    }
}
