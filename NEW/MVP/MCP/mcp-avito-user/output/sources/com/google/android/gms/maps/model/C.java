package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class C implements Parcelable.Creator<StreetViewPanoramaOrientation> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewPanoramaOrientation createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        float fP2 = 0.0f;
        float fP3 = 0.0f;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                fP2 = SafeParcelReader.p(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                fP3 = SafeParcelReader.p(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new StreetViewPanoramaOrientation(fP2, fP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOrientation[] newArray(int i12) {
        return new StreetViewPanoramaOrientation[i12];
    }
}
