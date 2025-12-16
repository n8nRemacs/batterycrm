package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/ConditionsInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ConditionsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ConditionsInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ConditionItemInfo> f107856b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107857c;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConditionsInfo> {
        @Override // android.os.Parcelable.Creator
        public final ConditionsInfo createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ConditionItemInfo.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ConditionsInfo(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConditionsInfo[] newArray(int i12) {
            return new ConditionsInfo[i12];
        }
    }

    public ConditionsInfo(@k List<ConditionItemInfo> list, @k String str) {
        this.f107856b = list;
        this.f107857c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConditionsInfo)) {
            return false;
        }
        ConditionsInfo conditionsInfo = (ConditionsInfo) obj;
        return L.f(this.f107856b, conditionsInfo.f107856b) && L.f(this.f107857c, conditionsInfo.f107857c);
    }

    public final int hashCode() {
        return this.f107857c.hashCode() + (this.f107856b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConditionsInfo(items=");
        sb2.append(this.f107856b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f107857c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f107856b, parcel);
        while (itJ.hasNext()) {
            ((ConditionItemInfo) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f107857c);
    }
}
