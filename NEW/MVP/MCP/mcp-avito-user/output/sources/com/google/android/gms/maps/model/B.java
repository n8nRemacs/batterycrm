package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class B implements Parcelable.Creator<StreetViewPanoramaLocation> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String strF = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) SafeParcelReader.i(parcel, i12, StreetViewPanoramaLink.CREATOR);
            } else if (c12 == 3) {
                latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 != 4) {
                SafeParcelReader.x(parcel, i12);
            } else {
                strF = SafeParcelReader.f(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaLocation[] newArray(int i12) {
        return new StreetViewPanoramaLocation[i12];
    }
}
