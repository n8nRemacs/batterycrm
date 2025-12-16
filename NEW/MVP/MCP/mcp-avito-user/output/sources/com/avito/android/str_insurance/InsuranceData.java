package com.avito.android.str_insurance;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceLink.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/str_insurance/InsuranceData;", "Landroid/os/Parcelable;", "Lcom/avito/android/str_insurance/Offer;", "offer", "Lcom/avito/android/str_insurance/Form;", "form", "Lcom/avito/android/str_insurance/Confirmation;", "confirmation", "<init>", "(Lcom/avito/android/str_insurance/Offer;Lcom/avito/android/str_insurance/Form;Lcom/avito/android/str_insurance/Confirmation;)V", "Lcom/avito/android/str_insurance/Offer;", "e", "()Lcom/avito/android/str_insurance/Offer;", "Lcom/avito/android/str_insurance/Form;", "d", "()Lcom/avito/android/str_insurance/Form;", "Lcom/avito/android/str_insurance/Confirmation;", "c", "()Lcom/avito/android/str_insurance/Confirmation;", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InsuranceData implements Parcelable {

    @k
    public static final Parcelable.Creator<InsuranceData> CREATOR = new a();

    @c("confirmation")
    @k
    private final Confirmation confirmation;

    @c("form")
    @k
    private final Form form;

    @c("offer")
    @k
    private final Offer offer;

    /* compiled from: StrInsuranceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InsuranceData> {
        @Override // android.os.Parcelable.Creator
        public final InsuranceData createFromParcel(Parcel parcel) {
            return new InsuranceData(Offer.CREATOR.createFromParcel(parcel), Form.CREATOR.createFromParcel(parcel), Confirmation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final InsuranceData[] newArray(int i12) {
            return new InsuranceData[i12];
        }
    }

    public InsuranceData(@k Offer offer, @k Form form, @k Confirmation confirmation) {
        this.offer = offer;
        this.form = form;
        this.confirmation = confirmation;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Confirmation getConfirmation() {
        return this.confirmation;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Form getForm() {
        return this.form;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Offer getOffer() {
        return this.offer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceData)) {
            return false;
        }
        InsuranceData insuranceData = (InsuranceData) obj;
        return L.f(this.offer, insuranceData.offer) && L.f(this.form, insuranceData.form) && L.f(this.confirmation, insuranceData.confirmation);
    }

    public final int hashCode() {
        return this.confirmation.hashCode() + ((this.form.hashCode() + (this.offer.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "InsuranceData(offer=" + this.offer + ", form=" + this.form + ", confirmation=" + this.confirmation + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.offer.writeToParcel(parcel, i12);
        this.form.writeToParcel(parcel, i12);
        this.confirmation.writeToParcel(parcel, i12);
    }
}
