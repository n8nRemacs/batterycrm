package com.avito.android.mortgage.root.list.items.bank.details.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBankDetails.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/details/model/MortgageRootBankDetails;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageRootBankDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageRootBankDetails> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202347b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202348c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f202349d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final MortgageRootBankAdditionalDetails f202350e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f202351f;

    /* compiled from: MortgageRootBankDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageRootBankDetails> {
        @Override // android.os.Parcelable.Creator
        public final MortgageRootBankDetails createFromParcel(Parcel parcel) {
            return new MortgageRootBankDetails(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(MortgageRootBankDetails.class.getClassLoader()), parcel.readInt() == 0 ? null : MortgageRootBankAdditionalDetails.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageRootBankDetails[] newArray(int i12) {
            return new MortgageRootBankDetails[i12];
        }
    }

    public MortgageRootBankDetails(@k String str, @k String str2, @k AttributedText attributedText, @l MortgageRootBankAdditionalDetails mortgageRootBankAdditionalDetails, @k String str3) {
        this.f202347b = str;
        this.f202348c = str2;
        this.f202349d = attributedText;
        this.f202350e = mortgageRootBankAdditionalDetails;
        this.f202351f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageRootBankDetails)) {
            return false;
        }
        MortgageRootBankDetails mortgageRootBankDetails = (MortgageRootBankDetails) obj;
        return L.f(this.f202347b, mortgageRootBankDetails.f202347b) && L.f(this.f202348c, mortgageRootBankDetails.f202348c) && L.f(this.f202349d, mortgageRootBankDetails.f202349d) && L.f(this.f202350e, mortgageRootBankDetails.f202350e) && L.f(this.f202351f, mortgageRootBankDetails.f202351f);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(this.f202347b.hashCode() * 31, 31, this.f202348c), 31, this.f202349d);
        MortgageRootBankAdditionalDetails mortgageRootBankAdditionalDetails = this.f202350e;
        return this.f202351f.hashCode() + ((iB2 + (mortgageRootBankAdditionalDetails == null ? 0 : mortgageRootBankAdditionalDetails.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageRootBankDetails(title=");
        sb2.append(this.f202347b);
        sb2.append(", iconUrl=");
        sb2.append(this.f202348c);
        sb2.append(", description=");
        sb2.append(this.f202349d);
        sb2.append(", additionalBlock=");
        sb2.append(this.f202350e);
        sb2.append(", actionTitle=");
        return C22026a.c(sb2, this.f202351f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f202347b);
        parcel.writeString(this.f202348c);
        parcel.writeParcelable(this.f202349d, i12);
        MortgageRootBankAdditionalDetails mortgageRootBankAdditionalDetails = this.f202350e;
        if (mortgageRootBankAdditionalDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mortgageRootBankAdditionalDetails.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f202351f);
    }
}
