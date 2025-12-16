package com.avito.android.mortgage.terms.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.MortgageTerms;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageTermsArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/terms/model/MortgageTermsArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageTermsArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageTermsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f203840b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f203841c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final MortgageTerms f203842d;

    /* compiled from: MortgageTermsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageTermsArguments> {
        @Override // android.os.Parcelable.Creator
        public final MortgageTermsArguments createFromParcel(Parcel parcel) {
            return new MortgageTermsArguments(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MortgageTerms.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageTermsArguments[] newArray(int i12) {
            return new MortgageTermsArguments[i12];
        }
    }

    public MortgageTermsArguments(@k String str, @k String str2, @l MortgageTerms mortgageTerms) {
        this.f203840b = str;
        this.f203841c = str2;
        this.f203842d = mortgageTerms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageTermsArguments)) {
            return false;
        }
        MortgageTermsArguments mortgageTermsArguments = (MortgageTermsArguments) obj;
        return L.f(this.f203840b, mortgageTermsArguments.f203840b) && L.f(this.f203841c, mortgageTermsArguments.f203841c) && L.f(this.f203842d, mortgageTermsArguments.f203842d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f203840b.hashCode() * 31, 31, this.f203841c);
        MortgageTerms mortgageTerms = this.f203842d;
        return iD2 + (mortgageTerms == null ? 0 : mortgageTerms.hashCode());
    }

    @k
    public final String toString() {
        return "MortgageTermsArguments(applicationId=" + this.f203840b + ", applicationStage=" + this.f203841c + ", terms=" + this.f203842d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f203840b);
        parcel.writeString(this.f203841c);
        MortgageTerms mortgageTerms = this.f203842d;
        if (mortgageTerms == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mortgageTerms.writeToParcel(parcel, i12);
        }
    }
}
