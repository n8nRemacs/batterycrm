package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/SelectItemInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectItemInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectItemInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f107864b;

    /* renamed from: c, reason: collision with root package name */
    public final long f107865c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalImage f107866d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f107867e;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectItemInfo> {
        @Override // android.os.Parcelable.Creator
        public final SelectItemInfo createFromParcel(Parcel parcel) {
            return new SelectItemInfo(parcel.readString(), parcel.readLong(), (UniversalImage) parcel.readParcelable(SelectItemInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectItemInfo[] newArray(int i12) {
            return new SelectItemInfo[i12];
        }
    }

    public SelectItemInfo(@k String str, long j12, @k UniversalImage universalImage, @k String str2) {
        this.f107864b = str;
        this.f107865c = j12;
        this.f107866d = universalImage;
        this.f107867e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectItemInfo)) {
            return false;
        }
        SelectItemInfo selectItemInfo = (SelectItemInfo) obj;
        return L.f(this.f107864b, selectItemInfo.f107864b) && this.f107865c == selectItemInfo.f107865c && L.f(this.f107866d, selectItemInfo.f107866d) && L.f(this.f107867e, selectItemInfo.f107867e);
    }

    public final int hashCode() {
        return this.f107867e.hashCode() + com.avito.android.actions_sheet.a.a(r.g(this.f107864b.hashCode() * 31, 31, this.f107865c), 31, this.f107866d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItemInfo(address=");
        sb2.append(this.f107864b);
        sb2.append(", id=");
        sb2.append(this.f107865c);
        sb2.append(", image=");
        sb2.append(this.f107866d);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f107867e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f107864b);
        parcel.writeLong(this.f107865c);
        parcel.writeParcelable(this.f107866d, i12);
        parcel.writeString(this.f107867e);
    }
}
