package com.avito.android.mortgage.root.list.items.bank.details.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootBankDetails.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank/details/model/MortgageRootBankAdditionalBlock;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageRootBankAdditionalBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageRootBankAdditionalBlock> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f202344c;

    /* compiled from: MortgageRootBankDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageRootBankAdditionalBlock> {
        @Override // android.os.Parcelable.Creator
        public final MortgageRootBankAdditionalBlock createFromParcel(Parcel parcel) {
            return new MortgageRootBankAdditionalBlock(parcel.readString(), (AttributedText) parcel.readParcelable(MortgageRootBankAdditionalBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageRootBankAdditionalBlock[] newArray(int i12) {
            return new MortgageRootBankAdditionalBlock[i12];
        }
    }

    public MortgageRootBankAdditionalBlock(@k String str, @k AttributedText attributedText) {
        this.f202343b = str;
        this.f202344c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageRootBankAdditionalBlock)) {
            return false;
        }
        MortgageRootBankAdditionalBlock mortgageRootBankAdditionalBlock = (MortgageRootBankAdditionalBlock) obj;
        return L.f(this.f202343b, mortgageRootBankAdditionalBlock.f202343b) && L.f(this.f202344c, mortgageRootBankAdditionalBlock.f202344c);
    }

    public final int hashCode() {
        return this.f202344c.hashCode() + (this.f202343b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageRootBankAdditionalBlock(iconName=");
        sb2.append(this.f202343b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f202344c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f202343b);
        parcel.writeParcelable(this.f202344c, i12);
    }
}
