package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class v implements Parcelable.Creator<PatternItem> {
    @Override // android.os.Parcelable.Creator
    public final PatternItem createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        Float fQ2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                fQ2 = SafeParcelReader.q(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PatternItem(iS2, fQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PatternItem[] newArray(int i12) {
        return new PatternItem[i12];
    }
}
