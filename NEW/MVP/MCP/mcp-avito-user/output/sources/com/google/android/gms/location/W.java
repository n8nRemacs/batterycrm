package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzd;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        WorkSource workSource = new WorkSource();
        int iS2 = 102;
        long jU2 = 3600000;
        long jU3 = 600000;
        long jU4 = 0;
        long jU5 = Long.MAX_VALUE;
        long jU6 = Long.MAX_VALUE;
        int iS3 = Integer.MAX_VALUE;
        float fP2 = 0.0f;
        boolean zL2 = false;
        int iS4 = 0;
        int iS5 = 0;
        boolean zL3 = false;
        long jU7 = -1;
        String strF = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 3:
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case 4:
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
                case 5:
                    jU5 = SafeParcelReader.u(parcel, i12);
                    break;
                case 6:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 7:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case '\b':
                    jU4 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\t':
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\n':
                    jU6 = SafeParcelReader.u(parcel, i12);
                    break;
                case 11:
                    jU7 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\f':
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\r':
                    iS5 = SafeParcelReader.s(parcel, i12);
                    break;
                case 14:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 15:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.e(parcel, i12, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (zzd) SafeParcelReader.e(parcel, i12, zzd.CREATOR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LocationRequest(iS2, jU2, jU3, jU4, jU5, jU6, iS3, fP2, zL2, jU7, iS4, iS5, strF, zL3, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new LocationRequest[i12];
    }
}
