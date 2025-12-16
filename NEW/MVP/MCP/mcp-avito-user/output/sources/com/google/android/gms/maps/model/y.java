package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class y implements Parcelable.Creator<PolylineOptions> {
    @Override // android.os.Parcelable.Creator
    public final PolylineOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayListJ2 = null;
        float fP2 = 0.0f;
        float fP3 = 0.0f;
        int iS2 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        int iS3 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    arrayListJ = SafeParcelReader.j(parcel, i12, LatLng.CREATOR);
                    break;
                case 3:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case 4:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 5:
                    fP3 = SafeParcelReader.p(parcel, i12);
                    break;
                case 6:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 7:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\b':
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\t':
                    cap = (Cap) SafeParcelReader.e(parcel, i12, Cap.CREATOR);
                    break;
                case '\n':
                    cap2 = (Cap) SafeParcelReader.e(parcel, i12, Cap.CREATOR);
                    break;
                case 11:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\f':
                    arrayListJ2 = SafeParcelReader.j(parcel, i12, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PolylineOptions(arrayListJ, fP2, iS2, fP3, zL2, zL3, zL4, cap, cap2, iS3, arrayListJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions[] newArray(int i12) {
        return new PolylineOptions[i12];
    }
}
