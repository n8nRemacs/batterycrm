package com.avito.android.comfortable_deal.common.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommissionView.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/common/view/CommissionData;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommissionData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CommissionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f120628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f120629c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f120630d;

    /* renamed from: e, reason: collision with root package name */
    public final int f120631e;

    /* compiled from: CommissionView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommissionData> {
        @Override // android.os.Parcelable.Creator
        public final CommissionData createFromParcel(Parcel parcel) {
            return new CommissionData(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CommissionData[] newArray(int i12) {
            return new CommissionData[i12];
        }
    }

    public CommissionData(int i12, @Y61.l Integer num, @Y61.l Integer num2, int i13) {
        this.f120628b = i12;
        this.f120629c = num;
        this.f120630d = num2;
        this.f120631e = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissionData)) {
            return false;
        }
        CommissionData commissionData = (CommissionData) obj;
        return this.f120628b == commissionData.f120628b && L.f(this.f120629c, commissionData.f120629c) && L.f(this.f120630d, commissionData.f120630d) && this.f120631e == commissionData.f120631e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f120628b) * 31;
        Integer num = this.f120629c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f120630d;
        return Integer.hashCode(this.f120631e) + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommissionData(agentReward=");
        sb2.append(this.f120628b);
        sb2.append(", serviceCommissionRate=");
        sb2.append(this.f120629c);
        sb2.append(", serviceCommission=");
        sb2.append(this.f120630d);
        sb2.append(", reward=");
        return androidx.appcompat.app.r.t(sb2, this.f120631e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f120628b);
        Integer num = this.f120629c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f120630d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeInt(this.f120631e);
    }
}
