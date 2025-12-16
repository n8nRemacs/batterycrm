package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        List listZzk = zzds.zzk();
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 6:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    zzdVar = (zzd) SafeParcelReader.e(parcel, i12, zzd.CREATOR);
                    break;
                case '\b':
                    listZzk = SafeParcelReader.j(parcel, i12, Feature.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzd(iS2, iS3, strF, strF2, strF3, iS4, listZzk, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzd[i12];
    }
}
