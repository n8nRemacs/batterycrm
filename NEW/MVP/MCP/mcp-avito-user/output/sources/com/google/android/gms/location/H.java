package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzd;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        WorkSource workSource = new WorkSource();
        long jU2 = Long.MAX_VALUE;
        long jU3 = Long.MAX_VALUE;
        int iS2 = 0;
        boolean zL2 = false;
        int iS3 = 0;
        int iS4 = 102;
        String strF = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 2:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 4:
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case 5:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.e(parcel, i12, WorkSource.CREATOR);
                    break;
                case 7:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\b':
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    zzdVar = (zzd) SafeParcelReader.e(parcel, i12, zzd.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new CurrentLocationRequest(jU2, iS2, iS4, jU3, zL2, iS3, strF, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new CurrentLocationRequest[i12];
    }
}
