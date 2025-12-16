package MZ;

import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageInfoModel.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b#\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b$\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b*\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b+\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b,\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b-\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b.\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b/\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b0\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b1\u0010 R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b2\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b3\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b4\u0010 R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b5\u0010 R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b9\u0010'¨\u0006:"}, d2 = {"LMZ/k;", "", "", "applicationId", "flowType", "sourceType", "regionId", "purposeId", "", "landCost", "houseCost", "propertyCost", "downPayment", "creditTerm", "mortgageProgram", "borrowerAge", "occupation", "totalExperience", "currentExperience", "businessAge", "selfEmployedExperience", "proofOfIncome", "bankPayrollId", "bankSalaryId", "", "LMZ/d;", "banksPreferred", "income", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "getRegionId", "getPurposeId", "Ljava/lang/Integer;", "getLandCost", "()Ljava/lang/Integer;", "getHouseCost", "getPropertyCost", "getDownPayment", "getCreditTerm", "getMortgageProgram", "getBorrowerAge", "getOccupation", "getTotalExperience", "getCurrentExperience", "getBusinessAge", "getSelfEmployedExperience", "getProofOfIncome", "getBankPayrollId", "getBankSalaryId", "Ljava/util/List;", "getBanksPreferred", "()Ljava/util/List;", "getIncome", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class k {

    @com.google.gson.annotations.c("applicationId")
    @Y61.l
    private final String applicationId;

    @com.google.gson.annotations.c("bankPayrollId")
    @Y61.l
    private final String bankPayrollId;

    @com.google.gson.annotations.c("bankSalaryId")
    @Y61.l
    private final String bankSalaryId;

    @com.google.gson.annotations.c("banksPreferred")
    @Y61.l
    private final List<d> banksPreferred;

    @com.google.gson.annotations.c("landingBorrowerAge")
    @Y61.l
    private final String borrowerAge;

    @com.google.gson.annotations.c("businessAge")
    @Y61.l
    private final String businessAge;

    @com.google.gson.annotations.c("creditTerm")
    @Y61.l
    private final Integer creditTerm;

    @com.google.gson.annotations.c("currentExperience")
    @Y61.l
    private final String currentExperience;

    @com.google.gson.annotations.c("downPayment")
    @Y61.l
    private final Integer downPayment;

    @com.google.gson.annotations.c("flowType")
    @Y61.l
    private final String flowType;

    @com.google.gson.annotations.c("houseCost")
    @Y61.l
    private final Integer houseCost;

    @com.google.gson.annotations.c("income")
    @Y61.l
    private final Integer income;

    @com.google.gson.annotations.c("landCost")
    @Y61.l
    private final Integer landCost;

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

    @com.google.gson.annotations.c("selfEmployedExperience")
    @Y61.l
    private final String selfEmployedExperience;

    @com.google.gson.annotations.c("sourceType")
    @Y61.l
    private final String sourceType;

    @com.google.gson.annotations.c("totalExperience")
    @Y61.l
    private final String totalExperience;

    public k(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12, @Y61.l String str13, @Y61.l String str14, @Y61.l String str15, @Y61.l List<d> list, @Y61.l Integer num6) {
        this.applicationId = str;
        this.flowType = str2;
        this.sourceType = str3;
        this.regionId = str4;
        this.purposeId = str5;
        this.landCost = num;
        this.houseCost = num2;
        this.propertyCost = num3;
        this.downPayment = num4;
        this.creditTerm = num5;
        this.mortgageProgram = str6;
        this.borrowerAge = str7;
        this.occupation = str8;
        this.totalExperience = str9;
        this.currentExperience = str10;
        this.businessAge = str11;
        this.selfEmployedExperience = str12;
        this.proofOfIncome = str13;
        this.bankPayrollId = str14;
        this.bankSalaryId = str15;
        this.banksPreferred = list;
        this.income = num6;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getFlowType() {
        return this.flowType;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.applicationId, kVar.applicationId) && L.f(this.flowType, kVar.flowType) && L.f(this.sourceType, kVar.sourceType) && L.f(this.regionId, kVar.regionId) && L.f(this.purposeId, kVar.purposeId) && L.f(this.landCost, kVar.landCost) && L.f(this.houseCost, kVar.houseCost) && L.f(this.propertyCost, kVar.propertyCost) && L.f(this.downPayment, kVar.downPayment) && L.f(this.creditTerm, kVar.creditTerm) && L.f(this.mortgageProgram, kVar.mortgageProgram) && L.f(this.borrowerAge, kVar.borrowerAge) && L.f(this.occupation, kVar.occupation) && L.f(this.totalExperience, kVar.totalExperience) && L.f(this.currentExperience, kVar.currentExperience) && L.f(this.businessAge, kVar.businessAge) && L.f(this.selfEmployedExperience, kVar.selfEmployedExperience) && L.f(this.proofOfIncome, kVar.proofOfIncome) && L.f(this.bankPayrollId, kVar.bankPayrollId) && L.f(this.bankSalaryId, kVar.bankSalaryId) && L.f(this.banksPreferred, kVar.banksPreferred) && L.f(this.income, kVar.income);
    }

    public final int hashCode() {
        String str = this.applicationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flowType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.regionId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purposeId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.landCost;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.houseCost;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.propertyCost;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.downPayment;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.creditTerm;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.mortgageProgram;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.borrowerAge;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.occupation;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.totalExperience;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currentExperience;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.businessAge;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.selfEmployedExperience;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.proofOfIncome;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.bankPayrollId;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.bankSalaryId;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<d> list = this.banksPreferred;
        int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num6 = this.income;
        return iHashCode21 + (num6 != null ? num6.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageInfoModel(applicationId=");
        sb2.append(this.applicationId);
        sb2.append(", flowType=");
        sb2.append(this.flowType);
        sb2.append(", sourceType=");
        sb2.append(this.sourceType);
        sb2.append(", regionId=");
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
        sb2.append(", totalExperience=");
        sb2.append(this.totalExperience);
        sb2.append(", currentExperience=");
        sb2.append(this.currentExperience);
        sb2.append(", businessAge=");
        sb2.append(this.businessAge);
        sb2.append(", selfEmployedExperience=");
        sb2.append(this.selfEmployedExperience);
        sb2.append(", proofOfIncome=");
        sb2.append(this.proofOfIncome);
        sb2.append(", bankPayrollId=");
        sb2.append(this.bankPayrollId);
        sb2.append(", bankSalaryId=");
        sb2.append(this.bankSalaryId);
        sb2.append(", banksPreferred=");
        sb2.append(this.banksPreferred);
        sb2.append(", income=");
        return s.j(sb2, this.income, ')');
    }
}
