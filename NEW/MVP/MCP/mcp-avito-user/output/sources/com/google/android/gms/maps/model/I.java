package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class I implements Parcelable.Creator<VisibleRegion> {
    @Override // android.os.Parcelable.Creator
    public final VisibleRegion createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 == 3) {
                latLng2 = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 == 4) {
                latLng3 = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 == 5) {
                latLng4 = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 != 6) {
                SafeParcelReader.x(parcel, i12);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.e(parcel, i12, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion[] newArray(int i12) {
        return new VisibleRegion[i12];
    }
}
