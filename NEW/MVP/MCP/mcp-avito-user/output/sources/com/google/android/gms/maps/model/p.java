package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class p implements Parcelable.Creator<CircleOptions> {
    @Override // android.os.Parcelable.Creator
    public final CircleOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        LatLng latLng = null;
        float fP2 = 0.0f;
        int iS2 = 0;
        int iS3 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        double dN2 = 0.0d;
        float fP3 = 0.0f;
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.e(parcel, i12, LatLng.CREATOR);
                    break;
                case 3:
                    dN2 = SafeParcelReader.n(parcel, i12);
                    break;
                case 4:
                    fP3 = SafeParcelReader.p(parcel, i12);
                    break;
                case 5:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 6:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 7:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\b':
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\t':
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\n':
                    arrayListJ = SafeParcelReader.j(parcel, i12, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.f354386b = latLng;
        circleOptions.f354387c = dN2;
        circleOptions.f354388d = fP3;
        circleOptions.f354389e = iS2;
        circleOptions.f354390f = iS3;
        circleOptions.f354391g = fP2;
        circleOptions.f354392h = zL2;
        circleOptions.f354393i = zL3;
        circleOptions.f354394j = arrayListJ;
        return circleOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CircleOptions[] newArray(int i12) {
        return new CircleOptions[i12];
    }
}
