package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlock.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsBlock;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsBlock> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f172839b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InstallmentsBlockStateData f172840c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InstallmentsLoanTerms f172841d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f172842e;

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsBlock> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsBlock createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            InstallmentsBlockStateData installmentsBlockStateDataCreateFromParcel = parcel.readInt() == 0 ? null : InstallmentsBlockStateData.CREATOR.createFromParcel(parcel);
            InstallmentsLoanTerms installmentsLoanTermsCreateFromParcel = parcel.readInt() != 0 ? InstallmentsLoanTerms.CREATOR.createFromParcel(parcel) : null;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), InstallmentsBlockStateData.CREATOR.createFromParcel(parcel));
            }
            return new InstallmentsBlock(string, installmentsBlockStateDataCreateFromParcel, installmentsLoanTermsCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsBlock[] newArray(int i12) {
            return new InstallmentsBlock[i12];
        }
    }

    public InstallmentsBlock(@l String str, @l InstallmentsBlockStateData installmentsBlockStateData, @l InstallmentsLoanTerms installmentsLoanTerms, @k Map<String, InstallmentsBlockStateData> map) {
        this.f172839b = str;
        this.f172840c = installmentsBlockStateData;
        this.f172841d = installmentsLoanTerms;
        this.f172842e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsBlock)) {
            return false;
        }
        InstallmentsBlock installmentsBlock = (InstallmentsBlock) obj;
        return L.f(this.f172839b, installmentsBlock.f172839b) && L.f(this.f172840c, installmentsBlock.f172840c) && L.f(this.f172841d, installmentsBlock.f172841d) && this.f172842e.equals(installmentsBlock.f172842e);
    }

    public final int hashCode() {
        String str = this.f172839b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InstallmentsBlockStateData installmentsBlockStateData = this.f172840c;
        int iHashCode2 = (iHashCode + (installmentsBlockStateData == null ? 0 : installmentsBlockStateData.hashCode())) * 31;
        InstallmentsLoanTerms installmentsLoanTerms = this.f172841d;
        return this.f172842e.hashCode() + ((iHashCode2 + (installmentsLoanTerms != null ? installmentsLoanTerms.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsBlock(initialPlanId=");
        sb2.append(this.f172839b);
        sb2.append(", initialBlockState=");
        sb2.append(this.f172840c);
        sb2.append(", loanTerms=");
        sb2.append(this.f172841d);
        sb2.append(", planIdToState=");
        return H.n(sb2, this.f172842e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f172839b);
        InstallmentsBlockStateData installmentsBlockStateData = this.f172840c;
        if (installmentsBlockStateData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsBlockStateData.writeToParcel(parcel, i12);
        }
        InstallmentsLoanTerms installmentsLoanTerms = this.f172841d;
        if (installmentsLoanTerms == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsLoanTerms.writeToParcel(parcel, i12);
        }
        Iterator itO = f.o(this.f172842e, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            ((InstallmentsBlockStateData) entry.getValue()).writeToParcel(parcel, i12);
        }
    }
}
