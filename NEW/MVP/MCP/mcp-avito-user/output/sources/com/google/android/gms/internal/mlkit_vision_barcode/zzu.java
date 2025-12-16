package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        zzl zzlVar = null;
        String strF = null;
        String strF2 = null;
        zzm[] zzmVarArr = null;
        zzj[] zzjVarArr = null;
        String[] strArrG = null;
        zze[] zzeVarArr = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    zzlVar = (zzl) SafeParcelReader.e(parcel, i12, zzl.CREATOR);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    zzmVarArr = (zzm[]) SafeParcelReader.i(parcel, i12, zzm.CREATOR);
                    break;
                case 6:
                    zzjVarArr = (zzj[]) SafeParcelReader.i(parcel, i12, zzj.CREATOR);
                    break;
                case 7:
                    strArrG = SafeParcelReader.g(parcel, i12);
                    break;
                case '\b':
                    zzeVarArr = (zze[]) SafeParcelReader.i(parcel, i12, zze.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzh(zzlVar, strF, strF2, zzmVarArr, zzjVarArr, strArrG, zzeVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzh[i12];
    }
}
