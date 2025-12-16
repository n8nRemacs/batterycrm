package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class w implements Parcelable.Creator<PointOfInterest> {
    @Override // android.os.Parcelable.Creator
    public final PointOfInterest createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        LatLng latLng = null;
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 == 3) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF2 = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PointOfInterest(latLng, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PointOfInterest[] newArray(int i12) {
        return new PointOfInterest[i12];
    }
}
