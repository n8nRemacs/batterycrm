package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, i12);
                    break;
                case 6:
                    strF5 = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    zzfVar = (zzf) SafeParcelReader.e(parcel, i12, zzf.CREATOR);
                    break;
                case '\b':
                    zzfVar2 = (zzf) SafeParcelReader.e(parcel, i12, zzf.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzg(strF, strF2, strF3, strF4, strF5, zzfVar, zzfVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzg[i12];
    }
}
