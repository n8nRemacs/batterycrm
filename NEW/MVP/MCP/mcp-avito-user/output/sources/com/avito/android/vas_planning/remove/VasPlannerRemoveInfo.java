package com.avito.android.vas_planning.remove;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: VasPlannerRemoveInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/remove/VasPlannerRemoveInfo;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasPlannerRemoveInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VasPlannerRemoveInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f322472b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f322473c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f322474d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f322475e;

    /* compiled from: VasPlannerRemoveInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlannerRemoveInfo> {
        @Override // android.os.Parcelable.Creator
        public final VasPlannerRemoveInfo createFromParcel(Parcel parcel) {
            return new VasPlannerRemoveInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlannerRemoveInfo[] newArray(int i12) {
            return new VasPlannerRemoveInfo[i12];
        }
    }

    public VasPlannerRemoveInfo(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        this.f322472b = str;
        this.f322473c = str2;
        this.f322474d = str3;
        this.f322475e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f322472b);
        parcel.writeString(this.f322473c);
        parcel.writeString(this.f322474d);
        parcel.writeString(this.f322475e);
    }
}
