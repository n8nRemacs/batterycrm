package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/ConditionItemInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ConditionItemInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ConditionItemInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f107853b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107854c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f107855d;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConditionItemInfo> {
        @Override // android.os.Parcelable.Creator
        public final ConditionItemInfo createFromParcel(Parcel parcel) {
            return new ConditionItemInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConditionItemInfo[] newArray(int i12) {
            return new ConditionItemInfo[i12];
        }
    }

    public ConditionItemInfo(@k String str, @k String str2, @l String str3) {
        this.f107853b = str;
        this.f107854c = str2;
        this.f107855d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConditionItemInfo)) {
            return false;
        }
        ConditionItemInfo conditionItemInfo = (ConditionItemInfo) obj;
        return L.f(this.f107853b, conditionItemInfo.f107853b) && L.f(this.f107854c, conditionItemInfo.f107854c) && L.f(this.f107855d, conditionItemInfo.f107855d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f107853b.hashCode() * 31, 31, this.f107854c);
        String str = this.f107855d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConditionItemInfo(image=");
        sb2.append(this.f107853b);
        sb2.append(", text=");
        sb2.append(this.f107854c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f107855d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f107853b);
        parcel.writeString(this.f107854c);
        parcel.writeString(this.f107855d);
    }
}
