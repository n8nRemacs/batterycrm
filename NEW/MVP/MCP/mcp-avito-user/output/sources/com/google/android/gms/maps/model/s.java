package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class s implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final LatLng createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        double dN2 = 0.0d;
        double dN3 = 0.0d;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 2) {
                dN2 = SafeParcelReader.n(parcel, i12);
            } else if (c12 != 3) {
                SafeParcelReader.x(parcel, i12);
            } else {
                dN3 = SafeParcelReader.n(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LatLng(dN2, dN3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLng[] newArray(int i12) {
        return new LatLng[i12];
    }
}
