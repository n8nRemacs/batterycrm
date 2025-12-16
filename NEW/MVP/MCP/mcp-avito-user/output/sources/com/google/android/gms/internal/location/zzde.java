package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayListJ = null;
        String strF = null;
        String strF2 = null;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        long jU2 = Long.MAX_VALUE;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.e(parcel, i12, LocationRequest.CREATOR);
            } else if (c12 != 5) {
                switch (c12) {
                    case '\b':
                        zL2 = SafeParcelReader.l(parcel, i12);
                        break;
                    case '\t':
                        zL3 = SafeParcelReader.l(parcel, i12);
                        break;
                    case '\n':
                        strF = SafeParcelReader.f(parcel, i12);
                        break;
                    case 11:
                        zL4 = SafeParcelReader.l(parcel, i12);
                        break;
                    case '\f':
                        zL5 = SafeParcelReader.l(parcel, i12);
                        break;
                    case '\r':
                        strF2 = SafeParcelReader.f(parcel, i12);
                        break;
                    case 14:
                        jU2 = SafeParcelReader.u(parcel, i12);
                        break;
                    default:
                        SafeParcelReader.x(parcel, i12);
                        break;
                }
            } else {
                arrayListJ = SafeParcelReader.j(parcel, i12, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzdd(locationRequest, arrayListJ, zL2, zL3, strF, zL4, zL5, strF2, jU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzdd[i12];
    }
}
