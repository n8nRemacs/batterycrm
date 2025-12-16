package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class E implements Parcelable.Creator<Tile> {
    @Override // android.os.Parcelable.Creator
    public final Tile createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        byte[] bArrC = null;
        int iS3 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 3) {
                iS3 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                bArrC = SafeParcelReader.c(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new Tile(iS2, iS3, bArrC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Tile[] newArray(int i12) {
        return new Tile[i12];
    }
}
