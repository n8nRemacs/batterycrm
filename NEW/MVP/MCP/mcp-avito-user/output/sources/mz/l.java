package MZ;

import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScoreMortgageInfoModel.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"LMZ/l;", "", "", "regionId", "purposeId", "", "landCost", "houseCost", "propertyCost", "downPayment", "creditTerm", "mortgageProgram", "borrowerAge", "occupation", "landingCurrentExperience", "proofOfIncome", "income", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "j", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "getHouseCost", "i", "c", "b", "getMortgageProgram", "a", "g", "f", "h", "d", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class l {

    @com.google.gson.annotations.c("landingBorrowerAge")
    @Y61.l
    private final String borrowerAge;

    @com.google.gson.annotations.c("creditTerm")
    @Y61.l
    private final Integer creditTerm;

    @com.google.gson.annotations.c("downPayment")
    @Y61.l
    private final Integer downPayment;

    @com.google.gson.annotations.c("houseCost")
    @Y61.l
    private final Integer houseCost;

    @com.google.gson.annotations.c("income")
    @Y61.l
    private final Integer income;

    @com.google.gson.annotations.c("landCost")
    @Y61.l
    private final Integer landCost;

    @com.google.gson.annotations.c("landingCurrentExperience")
    @Y61.l
    private final String landingCurrentExperience;

    @com.google.gson.annotations.c("mortgageProgram")
    @Y61.l
    private final String mortgageProgram;

    @com.google.gson.annotations.c("occupation")
    @Y61.l
    private final String occupation;

    @com.google.gson.annotations.c("proofOfIncome")
    @Y61.l
    private final String proofOfIncome;

    @com.google.gson.annotations.c("propertyCost")
    @Y61.l
    private final Integer propertyCost;

    @com.google.gson.annotations.c("purposeId")
    @Y61.l
    private final String purposeId;

    @com.google.gson.annotations.c("regionId")
    @Y61.l
    private final String regionId;

    public l(@Y61.l String str, @Y61.l String str2, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l Integer num6) {
        this.regionId = str;
        this.purposeId = str2;
        this.landCost = num;
        this.houseCost = num2;
        this.propertyCost = num3;
        this.downPayment = num4;
        this.creditTerm = num5;
        this.mortgageProgram = str3;
        this.borrowerAge = str4;
        this.occupation = str5;
        this.landingCurrentExperience = str6;
        this.proofOfIncome = str7;
        this.income = num6;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getBorrowerAge() {
        return this.borrowerAge;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Integer getCreditTerm() {
        return this.creditTerm;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Integer getDownPayment() {
        return this.downPayment;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Integer getIncome() {
        return this.income;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Integer getLandCost() {
        return this.landCost;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.regionId, lVar.regionId) && L.f(this.purposeId, lVar.purposeId) && L.f(this.landCost, lVar.landCost) && L.f(this.houseCost, lVar.houseCost) && L.f(this.propertyCost, lVar.propertyCost) && L.f(this.downPayment, lVar.downPayment) && L.f(this.creditTerm, lVar.creditTerm) && L.f(this.mortgageProgram, lVar.mortgageProgram) && L.f(this.borrowerAge, lVar.borrowerAge) && L.f(this.occupation, lVar.occupation) && L.f(this.landingCurrentExperience, lVar.landingCurrentExperience) && L.f(this.proofOfIncome, lVar.proofOfIncome) && L.f(this.income, lVar.income);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getLandingCurrentExperience() {
        return this.landingCurrentExperience;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getOccupation() {
        return this.occupation;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getProofOfIncome() {
        return this.proofOfIncome;
    }

    public final int hashCode() {
        String str = this.regionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.purposeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.landCost;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.houseCost;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.propertyCost;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.downPayment;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.creditTerm;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.mortgageProgram;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.borrowerAge;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.occupation;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.landingCurrentExperience;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.proofOfIncome;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num6 = this.income;
        return iHashCode12 + (num6 != null ? num6.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final Integer getPropertyCost() {
        return this.propertyCost;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getPurposeId() {
        return this.purposeId;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final String getRegionId() {
        return this.regionId;
    }

    @Y61.k
    public final k l() {
        String str = this.purposeId;
        String str2 = this.regionId;
        Integer num = this.propertyCost;
        Integer num2 = this.houseCost;
        Integer num3 = this.landCost;
        Integer num4 = this.downPayment;
        Integer num5 = this.creditTerm;
        String str3 = this.borrowerAge;
        String str4 = this.occupation;
        String str5 = this.landingCurrentExperience;
        Integer num6 = this.income;
        return new k(null, null, null, str2, str, num3, num2, num, num4, num5, this.mortgageProgram, str3, str4, null, str5, null, null, this.proofOfIncome, null, null, null, num6);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScoreMortgageInfoModel(regionId=");
        sb2.append(this.regionId);
        sb2.append(", purposeId=");
        sb2.append(this.purposeId);
        sb2.append(", landCost=");
        sb2.append(this.landCost);
        sb2.append(", houseCost=");
        sb2.append(this.houseCost);
        sb2.append(", propertyCost=");
        sb2.append(this.propertyCost);
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
        sb2.append(", landingCurrentExperience=");
        sb2.append(this.landingCurrentExperience);
        sb2.append(", proofOfIncome=");
        sb2.append(this.proofOfIncome);
        sb2.append(", income=");
        return s.j(sb2, this.income, ')');
    }
}
