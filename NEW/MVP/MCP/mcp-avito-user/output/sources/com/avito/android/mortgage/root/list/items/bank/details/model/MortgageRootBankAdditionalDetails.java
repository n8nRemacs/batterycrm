package com.avito.android.mortgage.root.list.items.bank.details.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBankDetails.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/details/model/MortgageRootBankAdditionalDetails;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageRootBankAdditionalDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageRootBankAdditionalDetails> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202345b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f202346c;

    /* compiled from: MortgageRootBankDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageRootBankAdditionalDetails> {
        @Override // android.os.Parcelable.Creator
        public final MortgageRootBankAdditionalDetails createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(MortgageRootBankAdditionalBlock.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MortgageRootBankAdditionalDetails(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageRootBankAdditionalDetails[] newArray(int i12) {
            return new MortgageRootBankAdditionalDetails[i12];
        }
    }

    public MortgageRootBankAdditionalDetails(@k String str, @k ArrayList arrayList) {
        this.f202345b = str;
        this.f202346c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageRootBankAdditionalDetails)) {
            return false;
        }
        MortgageRootBankAdditionalDetails mortgageRootBankAdditionalDetails = (MortgageRootBankAdditionalDetails) obj;
        return L.f(this.f202345b, mortgageRootBankAdditionalDetails.f202345b) && this.f202346c.equals(mortgageRootBankAdditionalDetails.f202346c);
    }

    public final int hashCode() {
        return this.f202346c.hashCode() + (this.f202345b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageRootBankAdditionalDetails(title=");
        sb2.append(this.f202345b);
        sb2.append(", blocks=");
        return e.p(sb2, this.f202346c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f202345b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f202346c, parcel);
        while (itZ.hasNext()) {
            ((MortgageRootBankAdditionalBlock) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
