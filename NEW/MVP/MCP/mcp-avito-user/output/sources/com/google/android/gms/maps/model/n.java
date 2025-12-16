package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class n implements Parcelable.Creator<CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final CameraPosition createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        LatLng latLng = null;
        float fP2 = 0.0f;
        float fP3 = 0.0f;
        float fP4 = 0.0f;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
            } else if (c12 == 3) {
                fP2 = SafeParcelReader.p(parcel, i12);
            } else if (c12 == 4) {
                fP3 = SafeParcelReader.p(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                fP4 = SafeParcelReader.p(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new CameraPosition(latLng, fP2, fP3, fP4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i12) {
        return new CameraPosition[i12];
    }
}
