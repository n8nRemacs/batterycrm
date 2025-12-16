package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzdg implements Parcelable.Creator<zzdd> {
    @Override // android.os.Parcelable.Creator
    public final zzdd createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        long jU2 = 0;
        long jU3 = 0;
        boolean zL2 = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleB = null;
        String strF4 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 2:
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case 3:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 6:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    bundleB = SafeParcelReader.b(parcel, i12);
                    break;
                case '\b':
                    strF4 = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzdd(jU2, jU3, zL2, strF, strF2, strF3, bundleB, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdd[] newArray(int i12) {
        return new zzdd[i12];
    }
}
