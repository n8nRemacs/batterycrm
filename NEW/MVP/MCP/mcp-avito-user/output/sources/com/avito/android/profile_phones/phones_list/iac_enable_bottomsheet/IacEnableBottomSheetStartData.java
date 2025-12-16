package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: IacEnableBottomSheetStartData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/IacEnableBottomSheetStartData;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IacEnableBottomSheetStartData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<IacEnableBottomSheetStartData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f227774b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f227775c;

    /* compiled from: IacEnableBottomSheetStartData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacEnableBottomSheetStartData> {
        @Override // android.os.Parcelable.Creator
        public final IacEnableBottomSheetStartData createFromParcel(Parcel parcel) {
            return new IacEnableBottomSheetStartData(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacEnableBottomSheetStartData[] newArray(int i12) {
            return new IacEnableBottomSheetStartData[i12];
        }
    }

    public IacEnableBottomSheetStartData(boolean z12, boolean z13) {
        this.f227774b = z12;
        this.f227775c = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacEnableBottomSheetStartData)) {
            return false;
        }
        IacEnableBottomSheetStartData iacEnableBottomSheetStartData = (IacEnableBottomSheetStartData) obj;
        return this.f227774b == iacEnableBottomSheetStartData.f227774b && this.f227775c == iacEnableBottomSheetStartData.f227775c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227775c) + (Boolean.hashCode(this.f227774b) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacEnableBottomSheetStartData(canChangeStateIacEnable=");
        sb2.append(this.f227774b);
        sb2.append(", iacEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f227775c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f227774b ? 1 : 0);
        parcel.writeInt(this.f227775c ? 1 : 0);
    }
}
