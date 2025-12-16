package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzd;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        long jU2 = Long.MAX_VALUE;
        int iS2 = 0;
        boolean zL2 = false;
        String strF = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                jU2 = SafeParcelReader.u(parcel, i12);
            } else if (c12 == 2) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 == 3) {
                zL2 = SafeParcelReader.l(parcel, i12);
            } else if (c12 == 4) {
                strF = SafeParcelReader.f(parcel, i12);
            } else if (c12 != 5) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zzdVar = (zzd) SafeParcelReader.e(parcel, i12, zzd.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LastLocationRequest(jU2, iS2, zL2, strF, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new LastLocationRequest[i12];
    }
}
