package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        long jU2 = 0;
        long jU3 = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        WorkSource workSource = null;
        String strF = null;
        int[] iArrD = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 2:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 3:
                    workSource = (WorkSource) SafeParcelReader.e(parcel, i12, WorkSource.CREATOR);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    iArrD = SafeParcelReader.d(parcel, i12);
                    break;
                case 6:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\t':
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzb(jU2, zL2, workSource, strF, iArrD, zL3, strF2, jU3, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzb[i12];
    }
}
