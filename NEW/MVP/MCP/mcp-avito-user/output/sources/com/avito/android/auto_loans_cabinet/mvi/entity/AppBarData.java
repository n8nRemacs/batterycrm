package com.avito.android.auto_loans_cabinet.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoLoansCabinetState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/AppBarData;", "Landroid/os/Parcelable;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AppBarData implements Parcelable {

    @k
    public static final Parcelable.Creator<AppBarData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f95437b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95438c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95440e;

    /* compiled from: AutoLoansCabinetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppBarData> {
        @Override // android.os.Parcelable.Creator
        public final AppBarData createFromParcel(Parcel parcel) {
            return new AppBarData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AppBarData[] newArray(int i12) {
            return new AppBarData[i12];
        }
    }

    public AppBarData(@k String str, @e0 int i12, @e0 int i13, @e0 int i14) {
        this.f95437b = str;
        this.f95438c = i12;
        this.f95439d = i13;
        this.f95440e = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBarData)) {
            return false;
        }
        AppBarData appBarData = (AppBarData) obj;
        return L.f(this.f95437b, appBarData.f95437b) && this.f95438c == appBarData.f95438c && this.f95439d == appBarData.f95439d && this.f95440e == appBarData.f95440e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95440e) + r.e(this.f95439d, r.e(this.f95438c, this.f95437b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppBarData(image=");
        sb2.append(this.f95437b);
        sb2.append(", titleRes=");
        sb2.append(this.f95438c);
        sb2.append(", textRes=");
        sb2.append(this.f95439d);
        sb2.append(", buttonTextRes=");
        return r.t(sb2, this.f95440e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f95437b);
        parcel.writeInt(this.f95438c);
        parcel.writeInt(this.f95439d);
        parcel.writeInt(this.f95440e);
    }
}
