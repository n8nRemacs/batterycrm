package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class r implements Parcelable.Creator<LatLngBounds> {
    @Override // android.os.Parcelable.Creator
    public final LatLngBounds createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                latLng2 = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds[] newArray(int i12) {
        return new LatLngBounds[i12];
    }
}
