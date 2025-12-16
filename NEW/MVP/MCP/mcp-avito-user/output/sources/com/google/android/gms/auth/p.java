package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        Long lV2 = null;
        ArrayList<String> arrayListH = null;
        String strF2 = null;
        int iS2 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    lV2 = SafeParcelReader.v(parcel, i12);
                    break;
                case 4:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 5:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    arrayListH = SafeParcelReader.h(parcel, i12);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new TokenData(iS2, strF, lV2, zL2, zL3, arrayListH, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new TokenData[i12];
    }
}
