package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/SelectItemsInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectItemsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectItemsInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SelectActionInfo f107868b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107869c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f107870d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f107871e;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectItemsInfo> {
        @Override // android.os.Parcelable.Creator
        public final SelectItemsInfo createFromParcel(Parcel parcel) {
            SelectActionInfo selectActionInfoCreateFromParcel = SelectActionInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SelectItemInfo.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SelectItemsInfo(selectActionInfoCreateFromParcel, string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectItemsInfo[] newArray(int i12) {
            return new SelectItemsInfo[i12];
        }
    }

    public SelectItemsInfo(@k SelectActionInfo selectActionInfo, @k String str, @k ArrayList arrayList, @k String str2) {
        this.f107868b = selectActionInfo;
        this.f107869c = str;
        this.f107870d = arrayList;
        this.f107871e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectItemsInfo)) {
            return false;
        }
        SelectItemsInfo selectItemsInfo = (SelectItemsInfo) obj;
        return L.f(this.f107868b, selectItemsInfo.f107868b) && L.f(this.f107869c, selectItemsInfo.f107869c) && this.f107870d.equals(selectItemsInfo.f107870d) && L.f(this.f107871e, selectItemsInfo.f107871e);
    }

    public final int hashCode() {
        return this.f107871e.hashCode() + e.g(this.f107870d, H.d(this.f107868b.hashCode() * 31, 31, this.f107869c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItemsInfo(action=");
        sb2.append(this.f107868b);
        sb2.append(", header=");
        sb2.append(this.f107869c);
        sb2.append(", items=");
        sb2.append(this.f107870d);
        sb2.append(", subHeader=");
        return C22026a.c(sb2, this.f107871e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f107868b.writeToParcel(parcel, i12);
        parcel.writeString(this.f107869c);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f107870d, parcel);
        while (itZ.hasNext()) {
            ((SelectItemInfo) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f107871e);
    }
}
