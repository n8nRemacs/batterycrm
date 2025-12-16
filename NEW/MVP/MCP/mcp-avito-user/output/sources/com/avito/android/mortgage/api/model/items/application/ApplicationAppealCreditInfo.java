package com.avito.android.mortgage.api.model.items.application;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationAppealsItemValue.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoIntField;", "loanAmount", "initialPayment", "monthlyPayment", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatField;", "rate", "loanTerm", "<init>", "(Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoIntField;Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoIntField;Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoIntField;Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatField;Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoIntField;)V", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoIntField;", "d", "()Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoIntField;", "c", "f", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatField;", "g", "()Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatField;", "e", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationAppealCreditInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationAppealCreditInfo> CREATOR = new a();

    @c("initialPayment")
    @l
    private final ApplicationAppealCreditInfoIntField initialPayment;

    @c("loanAmount")
    @l
    private final ApplicationAppealCreditInfoIntField loanAmount;

    @c("loanTerm")
    @l
    private final ApplicationAppealCreditInfoIntField loanTerm;

    @c("monthlyPayment")
    @l
    private final ApplicationAppealCreditInfoIntField monthlyPayment;

    @c("rate")
    @l
    private final ApplicationAppealCreditInfoFloatField rate;

    /* compiled from: ApplicationAppealsItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationAppealCreditInfo> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationAppealCreditInfo createFromParcel(Parcel parcel) {
            return new ApplicationAppealCreditInfo(parcel.readInt() == 0 ? null : ApplicationAppealCreditInfoIntField.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApplicationAppealCreditInfoIntField.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApplicationAppealCreditInfoIntField.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApplicationAppealCreditInfoFloatField.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ApplicationAppealCreditInfoIntField.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationAppealCreditInfo[] newArray(int i12) {
            return new ApplicationAppealCreditInfo[i12];
        }
    }

    public ApplicationAppealCreditInfo(@l ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField, @l ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField2, @l ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField3, @l ApplicationAppealCreditInfoFloatField applicationAppealCreditInfoFloatField, @l ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField4) {
        this.loanAmount = applicationAppealCreditInfoIntField;
        this.initialPayment = applicationAppealCreditInfoIntField2;
        this.monthlyPayment = applicationAppealCreditInfoIntField3;
        this.rate = applicationAppealCreditInfoFloatField;
        this.loanTerm = applicationAppealCreditInfoIntField4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ApplicationAppealCreditInfoIntField getInitialPayment() {
        return this.initialPayment;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ApplicationAppealCreditInfoIntField getLoanAmount() {
        return this.loanAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ApplicationAppealCreditInfoIntField getLoanTerm() {
        return this.loanTerm;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationAppealCreditInfo)) {
            return false;
        }
        ApplicationAppealCreditInfo applicationAppealCreditInfo = (ApplicationAppealCreditInfo) obj;
        return L.f(this.loanAmount, applicationAppealCreditInfo.loanAmount) && L.f(this.initialPayment, applicationAppealCreditInfo.initialPayment) && L.f(this.monthlyPayment, applicationAppealCreditInfo.monthlyPayment) && L.f(this.rate, applicationAppealCreditInfo.rate) && L.f(this.loanTerm, applicationAppealCreditInfo.loanTerm);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final ApplicationAppealCreditInfoIntField getMonthlyPayment() {
        return this.monthlyPayment;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final ApplicationAppealCreditInfoFloatField getRate() {
        return this.rate;
    }

    public final int hashCode() {
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField = this.loanAmount;
        int iHashCode = (applicationAppealCreditInfoIntField == null ? 0 : applicationAppealCreditInfoIntField.hashCode()) * 31;
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField2 = this.initialPayment;
        int iHashCode2 = (iHashCode + (applicationAppealCreditInfoIntField2 == null ? 0 : applicationAppealCreditInfoIntField2.hashCode())) * 31;
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField3 = this.monthlyPayment;
        int iHashCode3 = (iHashCode2 + (applicationAppealCreditInfoIntField3 == null ? 0 : applicationAppealCreditInfoIntField3.hashCode())) * 31;
        ApplicationAppealCreditInfoFloatField applicationAppealCreditInfoFloatField = this.rate;
        int iHashCode4 = (iHashCode3 + (applicationAppealCreditInfoFloatField == null ? 0 : applicationAppealCreditInfoFloatField.hashCode())) * 31;
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField4 = this.loanTerm;
        return iHashCode4 + (applicationAppealCreditInfoIntField4 != null ? applicationAppealCreditInfoIntField4.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ApplicationAppealCreditInfo(loanAmount=" + this.loanAmount + ", initialPayment=" + this.initialPayment + ", monthlyPayment=" + this.monthlyPayment + ", rate=" + this.rate + ", loanTerm=" + this.loanTerm + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField = this.loanAmount;
        if (applicationAppealCreditInfoIntField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applicationAppealCreditInfoIntField.writeToParcel(parcel, i12);
        }
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField2 = this.initialPayment;
        if (applicationAppealCreditInfoIntField2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applicationAppealCreditInfoIntField2.writeToParcel(parcel, i12);
        }
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField3 = this.monthlyPayment;
        if (applicationAppealCreditInfoIntField3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applicationAppealCreditInfoIntField3.writeToParcel(parcel, i12);
        }
        ApplicationAppealCreditInfoFloatField applicationAppealCreditInfoFloatField = this.rate;
        if (applicationAppealCreditInfoFloatField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applicationAppealCreditInfoFloatField.writeToParcel(parcel, i12);
        }
        ApplicationAppealCreditInfoIntField applicationAppealCreditInfoIntField4 = this.loanTerm;
        if (applicationAppealCreditInfoIntField4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            applicationAppealCreditInfoIntField4.writeToParcel(parcel, i12);
        }
    }
}
