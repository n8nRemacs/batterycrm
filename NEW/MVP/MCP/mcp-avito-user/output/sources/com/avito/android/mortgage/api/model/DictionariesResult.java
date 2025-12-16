package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.dictionary.IconParameter;
import com.avito.android.mortgage.api.model.dictionary.MonthParameter;
import com.avito.android.mortgage.api.model.dictionary.ProgramParameter;
import com.avito.android.mortgage.api.model.dictionary.UsualParameter;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DictionariesResult.kt */
@d
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B£\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u001fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\u001fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b#\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b$\u0010\u001fR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b%\u0010\u001fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b&\u0010\u001fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b'\u0010\u001fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b(\u0010\u001fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b)\u0010\u001fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b*\u0010\u001fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b+\u0010\u001fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b,\u0010\u001fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b-\u0010\u001fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b.\u0010\u001fR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b/\u0010\u001fR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b0\u0010\u001fR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b1\u0010\u001fR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b2\u0010\u001f¨\u00063"}, d2 = {"Lcom/avito/android/mortgage/api/model/DictionariesResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/mortgage/api/model/dictionary/IconParameter;", "banks", "Lcom/avito/android/mortgage/api/model/dictionary/UsualParameter;", "businessProofOfIncome", "selfEmployedProofOfIncome", "Lcom/avito/android/mortgage/api/model/dictionary/MonthParameter;", "currentWorkingPlaceExperience", "education", "familyStatus", "fullNameChangeCause", "gender", "hiredProofOfIncome", "loanType", "Lcom/avito/android/mortgage/api/model/dictionary/ProgramParameter;", "mortgageProgram", "borrowerAges", "occupation", "organizationAge", "organizationType", "ownership", "primaryMortgageProgram", "proofOfIncome", "regions", "totalExperience", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "getBanks", "()Ljava/util/List;", "d", "k", "e", "getEducation", "getFamilyStatus", "getFullNameChangeCause", "getGender", "f", "g", "h", "c", "i", "getOrganizationAge", "getOrganizationType", "getOwnership", "getPrimaryMortgageProgram", "getProofOfIncome", "j", "getTotalExperience", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DictionariesResult implements Parcelable {

    @k
    public static final Parcelable.Creator<DictionariesResult> CREATOR = new a();

    @c("bankList")
    @k
    private final List<IconParameter> banks;

    @c("landingAges")
    @k
    private final List<UsualParameter> borrowerAges;

    @c("businessProofOfIncome")
    @k
    private final List<UsualParameter> businessProofOfIncome;

    @c("landingCurrentWorkingPlaceExperience")
    @k
    private final List<MonthParameter> currentWorkingPlaceExperience;

    @c("education")
    @k
    private final List<UsualParameter> education;

    @c("familyStatus")
    @k
    private final List<UsualParameter> familyStatus;

    @c("fullNameChangeCause")
    @k
    private final List<UsualParameter> fullNameChangeCause;

    @c("gender")
    @k
    private final List<UsualParameter> gender;

    @c("hiredProofOfIncome")
    @k
    private final List<UsualParameter> hiredProofOfIncome;

    @c("loanType")
    @k
    private final List<UsualParameter> loanType;

    @c("mortgageProgram")
    @k
    private final List<ProgramParameter> mortgageProgram;

    @c("occupation")
    @k
    private final List<UsualParameter> occupation;

    @c("organizationAge")
    @k
    private final List<UsualParameter> organizationAge;

    @c("organizationType")
    @k
    private final List<UsualParameter> organizationType;

    @c("ownership")
    @k
    private final List<UsualParameter> ownership;

    @c("primaryMortgageProgram")
    @l
    private final List<ProgramParameter> primaryMortgageProgram;

    @c("proofOfIncome")
    @k
    private final List<UsualParameter> proofOfIncome;

    @c("regions")
    @k
    private final List<UsualParameter> regions;

    @c("selfEmployedProofOfIncome")
    @l
    private final List<UsualParameter> selfEmployedProofOfIncome;

    @c("totalExperience")
    @k
    private final List<MonthParameter> totalExperience;

    /* compiled from: DictionariesResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DictionariesResult> {
        @Override // android.os.Parcelable.Creator
        public final DictionariesResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i12 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(IconParameter.CREATOR, parcel, arrayList4, iC2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList5, iC3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iC4 = 0;
                while (iC4 != i14) {
                    iC4 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList, iC4, 1);
                }
            }
            int i15 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i15);
            int iC5 = 0;
            while (iC5 != i15) {
                iC5 = com.avito.android.actions_sheet.a.c(MonthParameter.CREATOR, parcel, arrayList6, iC5, 1);
            }
            int i16 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i16);
            int iC6 = 0;
            while (iC6 != i16) {
                iC6 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList7, iC6, 1);
            }
            int i17 = parcel.readInt();
            ArrayList arrayList8 = new ArrayList(i17);
            int iC7 = 0;
            while (iC7 != i17) {
                iC7 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList8, iC7, 1);
            }
            int i18 = parcel.readInt();
            ArrayList arrayList9 = new ArrayList(i18);
            int iC8 = 0;
            while (iC8 != i18) {
                iC8 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList9, iC8, 1);
            }
            int i19 = parcel.readInt();
            ArrayList arrayList10 = new ArrayList(i19);
            int iC9 = 0;
            while (iC9 != i19) {
                iC9 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList10, iC9, 1);
            }
            int i22 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(i22);
            int iC10 = 0;
            while (iC10 != i22) {
                iC10 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList11, iC10, 1);
            }
            int i23 = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(i23);
            int iC11 = 0;
            while (iC11 != i23) {
                iC11 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList12, iC11, 1);
            }
            int i24 = parcel.readInt();
            ArrayList arrayList13 = new ArrayList(i24);
            int iC12 = 0;
            while (iC12 != i24) {
                iC12 = com.avito.android.actions_sheet.a.c(ProgramParameter.CREATOR, parcel, arrayList13, iC12, 1);
            }
            int i25 = parcel.readInt();
            ArrayList arrayList14 = new ArrayList(i25);
            int iC13 = 0;
            while (iC13 != i25) {
                iC13 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList14, iC13, 1);
                i25 = i25;
            }
            int i26 = parcel.readInt();
            ArrayList arrayList15 = new ArrayList(i26);
            int iC14 = 0;
            while (iC14 != i26) {
                iC14 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList15, iC14, 1);
                i26 = i26;
                arrayList14 = arrayList14;
            }
            ArrayList arrayList16 = arrayList14;
            int i27 = parcel.readInt();
            ArrayList arrayList17 = new ArrayList(i27);
            int iC15 = 0;
            while (iC15 != i27) {
                iC15 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList17, iC15, 1);
                i27 = i27;
                arrayList15 = arrayList15;
            }
            ArrayList arrayList18 = arrayList15;
            int i28 = parcel.readInt();
            ArrayList arrayList19 = new ArrayList(i28);
            int iC16 = 0;
            while (iC16 != i28) {
                iC16 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList19, iC16, 1);
                i28 = i28;
                arrayList17 = arrayList17;
            }
            ArrayList arrayList20 = arrayList17;
            int i29 = parcel.readInt();
            ArrayList arrayList21 = new ArrayList(i29);
            int iC17 = 0;
            while (iC17 != i29) {
                iC17 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList21, iC17, 1);
                i29 = i29;
                arrayList19 = arrayList19;
            }
            ArrayList arrayList22 = arrayList19;
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList21;
                arrayList3 = null;
            } else {
                int i32 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i32);
                int iC18 = 0;
                while (iC18 != i32) {
                    iC18 = com.avito.android.actions_sheet.a.c(ProgramParameter.CREATOR, parcel, arrayList23, iC18, 1);
                    i32 = i32;
                    arrayList21 = arrayList21;
                }
                arrayList2 = arrayList21;
                arrayList3 = arrayList23;
            }
            int i33 = parcel.readInt();
            ArrayList arrayList24 = new ArrayList(i33);
            int iC19 = 0;
            while (iC19 != i33) {
                iC19 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList24, iC19, 1);
                i33 = i33;
                arrayList3 = arrayList3;
            }
            ArrayList arrayList25 = arrayList3;
            int i34 = parcel.readInt();
            ArrayList arrayList26 = new ArrayList(i34);
            int iC20 = 0;
            while (iC20 != i34) {
                iC20 = com.avito.android.actions_sheet.a.c(UsualParameter.CREATOR, parcel, arrayList26, iC20, 1);
                i34 = i34;
                arrayList24 = arrayList24;
            }
            ArrayList arrayList27 = arrayList24;
            int i35 = parcel.readInt();
            ArrayList arrayList28 = new ArrayList(i35);
            int iC21 = 0;
            while (iC21 != i35) {
                iC21 = com.avito.android.actions_sheet.a.c(MonthParameter.CREATOR, parcel, arrayList28, iC21, 1);
                i35 = i35;
                arrayList26 = arrayList26;
            }
            return new DictionariesResult(arrayList4, arrayList5, arrayList, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, arrayList16, arrayList18, arrayList20, arrayList22, arrayList2, arrayList25, arrayList27, arrayList26, arrayList28);
        }

        @Override // android.os.Parcelable.Creator
        public final DictionariesResult[] newArray(int i12) {
            return new DictionariesResult[i12];
        }
    }

    public DictionariesResult(@k List<IconParameter> list, @k List<UsualParameter> list2, @l List<UsualParameter> list3, @k List<MonthParameter> list4, @k List<UsualParameter> list5, @k List<UsualParameter> list6, @k List<UsualParameter> list7, @k List<UsualParameter> list8, @k List<UsualParameter> list9, @k List<UsualParameter> list10, @k List<ProgramParameter> list11, @k List<UsualParameter> list12, @k List<UsualParameter> list13, @k List<UsualParameter> list14, @k List<UsualParameter> list15, @k List<UsualParameter> list16, @l List<ProgramParameter> list17, @k List<UsualParameter> list18, @k List<UsualParameter> list19, @k List<MonthParameter> list20) {
        this.banks = list;
        this.businessProofOfIncome = list2;
        this.selfEmployedProofOfIncome = list3;
        this.currentWorkingPlaceExperience = list4;
        this.education = list5;
        this.familyStatus = list6;
        this.fullNameChangeCause = list7;
        this.gender = list8;
        this.hiredProofOfIncome = list9;
        this.loanType = list10;
        this.mortgageProgram = list11;
        this.borrowerAges = list12;
        this.occupation = list13;
        this.organizationAge = list14;
        this.organizationType = list15;
        this.ownership = list16;
        this.primaryMortgageProgram = list17;
        this.proofOfIncome = list18;
        this.regions = list19;
        this.totalExperience = list20;
    }

    @k
    public final List<UsualParameter> c() {
        return this.borrowerAges;
    }

    @k
    public final List<UsualParameter> d() {
        return this.businessProofOfIncome;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<MonthParameter> e() {
        return this.currentWorkingPlaceExperience;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionariesResult)) {
            return false;
        }
        DictionariesResult dictionariesResult = (DictionariesResult) obj;
        return L.f(this.banks, dictionariesResult.banks) && L.f(this.businessProofOfIncome, dictionariesResult.businessProofOfIncome) && L.f(this.selfEmployedProofOfIncome, dictionariesResult.selfEmployedProofOfIncome) && L.f(this.currentWorkingPlaceExperience, dictionariesResult.currentWorkingPlaceExperience) && L.f(this.education, dictionariesResult.education) && L.f(this.familyStatus, dictionariesResult.familyStatus) && L.f(this.fullNameChangeCause, dictionariesResult.fullNameChangeCause) && L.f(this.gender, dictionariesResult.gender) && L.f(this.hiredProofOfIncome, dictionariesResult.hiredProofOfIncome) && L.f(this.loanType, dictionariesResult.loanType) && L.f(this.mortgageProgram, dictionariesResult.mortgageProgram) && L.f(this.borrowerAges, dictionariesResult.borrowerAges) && L.f(this.occupation, dictionariesResult.occupation) && L.f(this.organizationAge, dictionariesResult.organizationAge) && L.f(this.organizationType, dictionariesResult.organizationType) && L.f(this.ownership, dictionariesResult.ownership) && L.f(this.primaryMortgageProgram, dictionariesResult.primaryMortgageProgram) && L.f(this.proofOfIncome, dictionariesResult.proofOfIncome) && L.f(this.regions, dictionariesResult.regions) && L.f(this.totalExperience, dictionariesResult.totalExperience);
    }

    @k
    public final List<UsualParameter> f() {
        return this.hiredProofOfIncome;
    }

    @k
    public final List<UsualParameter> g() {
        return this.loanType;
    }

    @k
    public final List<ProgramParameter> h() {
        return this.mortgageProgram;
    }

    public final int hashCode() {
        int iE2 = H.e(this.banks.hashCode() * 31, 31, this.businessProofOfIncome);
        List<UsualParameter> list = this.selfEmployedProofOfIncome;
        int iE3 = H.e(H.e(H.e(H.e(H.e(H.e(H.e(H.e(H.e(H.e(H.e(H.e(H.e((iE2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.currentWorkingPlaceExperience), 31, this.education), 31, this.familyStatus), 31, this.fullNameChangeCause), 31, this.gender), 31, this.hiredProofOfIncome), 31, this.loanType), 31, this.mortgageProgram), 31, this.borrowerAges), 31, this.occupation), 31, this.organizationAge), 31, this.organizationType), 31, this.ownership);
        List<ProgramParameter> list2 = this.primaryMortgageProgram;
        return this.totalExperience.hashCode() + H.e(H.e((iE3 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.proofOfIncome), 31, this.regions);
    }

    @k
    public final List<UsualParameter> i() {
        return this.occupation;
    }

    @k
    public final List<UsualParameter> j() {
        return this.regions;
    }

    @l
    public final List<UsualParameter> k() {
        return this.selfEmployedProofOfIncome;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DictionariesResult(banks=");
        sb2.append(this.banks);
        sb2.append(", businessProofOfIncome=");
        sb2.append(this.businessProofOfIncome);
        sb2.append(", selfEmployedProofOfIncome=");
        sb2.append(this.selfEmployedProofOfIncome);
        sb2.append(", currentWorkingPlaceExperience=");
        sb2.append(this.currentWorkingPlaceExperience);
        sb2.append(", education=");
        sb2.append(this.education);
        sb2.append(", familyStatus=");
        sb2.append(this.familyStatus);
        sb2.append(", fullNameChangeCause=");
        sb2.append(this.fullNameChangeCause);
        sb2.append(", gender=");
        sb2.append(this.gender);
        sb2.append(", hiredProofOfIncome=");
        sb2.append(this.hiredProofOfIncome);
        sb2.append(", loanType=");
        sb2.append(this.loanType);
        sb2.append(", mortgageProgram=");
        sb2.append(this.mortgageProgram);
        sb2.append(", borrowerAges=");
        sb2.append(this.borrowerAges);
        sb2.append(", occupation=");
        sb2.append(this.occupation);
        sb2.append(", organizationAge=");
        sb2.append(this.organizationAge);
        sb2.append(", organizationType=");
        sb2.append(this.organizationType);
        sb2.append(", ownership=");
        sb2.append(this.ownership);
        sb2.append(", primaryMortgageProgram=");
        sb2.append(this.primaryMortgageProgram);
        sb2.append(", proofOfIncome=");
        sb2.append(this.proofOfIncome);
        sb2.append(", regions=");
        sb2.append(this.regions);
        sb2.append(", totalExperience=");
        return H.p(sb2, this.totalExperience, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.banks, parcel);
        while (itJ.hasNext()) {
            ((IconParameter) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.businessProofOfIncome, parcel);
        while (itJ2.hasNext()) {
            ((UsualParameter) itJ2.next()).writeToParcel(parcel, i12);
        }
        List<UsualParameter> list = this.selfEmployedProofOfIncome;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((UsualParameter) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Iterator itJ3 = C0.j(this.currentWorkingPlaceExperience, parcel);
        while (itJ3.hasNext()) {
            ((MonthParameter) itJ3.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ4 = C0.j(this.education, parcel);
        while (itJ4.hasNext()) {
            ((UsualParameter) itJ4.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ5 = C0.j(this.familyStatus, parcel);
        while (itJ5.hasNext()) {
            ((UsualParameter) itJ5.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ6 = C0.j(this.fullNameChangeCause, parcel);
        while (itJ6.hasNext()) {
            ((UsualParameter) itJ6.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ7 = C0.j(this.gender, parcel);
        while (itJ7.hasNext()) {
            ((UsualParameter) itJ7.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ8 = C0.j(this.hiredProofOfIncome, parcel);
        while (itJ8.hasNext()) {
            ((UsualParameter) itJ8.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ9 = C0.j(this.loanType, parcel);
        while (itJ9.hasNext()) {
            ((UsualParameter) itJ9.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ10 = C0.j(this.mortgageProgram, parcel);
        while (itJ10.hasNext()) {
            ((ProgramParameter) itJ10.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ11 = C0.j(this.borrowerAges, parcel);
        while (itJ11.hasNext()) {
            ((UsualParameter) itJ11.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ12 = C0.j(this.occupation, parcel);
        while (itJ12.hasNext()) {
            ((UsualParameter) itJ12.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ13 = C0.j(this.organizationAge, parcel);
        while (itJ13.hasNext()) {
            ((UsualParameter) itJ13.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ14 = C0.j(this.organizationType, parcel);
        while (itJ14.hasNext()) {
            ((UsualParameter) itJ14.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ15 = C0.j(this.ownership, parcel);
        while (itJ15.hasNext()) {
            ((UsualParameter) itJ15.next()).writeToParcel(parcel, i12);
        }
        List<ProgramParameter> list2 = this.primaryMortgageProgram;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((ProgramParameter) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        Iterator itJ16 = C0.j(this.proofOfIncome, parcel);
        while (itJ16.hasNext()) {
            ((UsualParameter) itJ16.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ17 = C0.j(this.regions, parcel);
        while (itJ17.hasNext()) {
            ((UsualParameter) itJ17.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ18 = C0.j(this.totalExperience, parcel);
        while (itJ18.hasNext()) {
            ((MonthParameter) itJ18.next()).writeToParcel(parcel, i12);
        }
    }
}
