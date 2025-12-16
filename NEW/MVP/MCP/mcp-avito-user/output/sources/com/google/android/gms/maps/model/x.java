package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class x implements Parcelable.Creator<PolygonOptions> {
    @Override // android.os.Parcelable.Creator
    public final PolygonOptions createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListJ = null;
        float fP2 = 0.0f;
        int iS2 = 0;
        int iS3 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        int iS4 = 0;
        float fP3 = 0.0f;
        ArrayList arrayListJ2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    arrayListJ2 = SafeParcelReader.j(parcel, i12, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = x.class.getClassLoader();
                    int iW2 = SafeParcelReader.w(parcel, i12);
                    int iDataPosition = parcel.dataPosition();
                    if (iW2 != 0) {
                        parcel.readList(arrayList, classLoader);
                        parcel.setDataPosition(iDataPosition + iW2);
                        break;
                    } else {
                        break;
                    }
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
                    zL4 = SafeParcelReader.l(parcel, i12);
                    break;
                case 11:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\f':
                    arrayListJ = SafeParcelReader.j(parcel, i12, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new PolygonOptions(arrayListJ2, arrayList, fP3, iS2, iS3, fP2, zL2, zL3, zL4, iS4, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions[] newArray(int i12) {
        return new PolygonOptions[i12];
    }
}
