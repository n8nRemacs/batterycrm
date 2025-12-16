package com.avito.android.mortgage.applicant_type.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantTypeSelectorArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/model/ApplicantTypeSelectorArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicantTypeSelectorArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicantTypeSelectorArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f198309b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f198310c;

    /* compiled from: ApplicantTypeSelectorArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicantTypeSelectorArguments> {
        @Override // android.os.Parcelable.Creator
        public final ApplicantTypeSelectorArguments createFromParcel(Parcel parcel) {
            return new ApplicantTypeSelectorArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicantTypeSelectorArguments[] newArray(int i12) {
            return new ApplicantTypeSelectorArguments[i12];
        }
    }

    public ApplicantTypeSelectorArguments(@k String str, @k String str2) {
        this.f198309b = str;
        this.f198310c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicantTypeSelectorArguments)) {
            return false;
        }
        ApplicantTypeSelectorArguments applicantTypeSelectorArguments = (ApplicantTypeSelectorArguments) obj;
        return L.f(this.f198309b, applicantTypeSelectorArguments.f198309b) && L.f(this.f198310c, applicantTypeSelectorArguments.f198310c);
    }

    public final int hashCode() {
        return this.f198310c.hashCode() + (this.f198309b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantTypeSelectorArguments(applicationId=");
        sb2.append(this.f198309b);
        sb2.append(", applicationStage=");
        return C22026a.c(sb2, this.f198310c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f198309b);
        parcel.writeString(this.f198310c);
    }
}
