package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 1000;
        int iS3 = 1;
        int iS4 = 1;
        long jU2 = 0;
        zzac[] zzacVarArr = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 4:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 5:
                    zzacVarArr = (zzac[]) SafeParcelReader.i(parcel, i12, zzac.CREATOR);
                    break;
                case 6:
                    SafeParcelReader.l(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new LocationAvailability(iS2, iS3, iS4, jU2, zzacVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new LocationAvailability[i12];
    }
}
