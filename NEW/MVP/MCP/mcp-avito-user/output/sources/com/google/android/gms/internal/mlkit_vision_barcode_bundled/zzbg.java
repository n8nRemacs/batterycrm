package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        zzav zzavVar = null;
        String strF = null;
        String strF2 = null;
        zzaw[] zzawVarArr = null;
        zzat[] zzatVarArr = null;
        String[] strArrG = null;
        zzao[] zzaoVarArr = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    zzavVar = (zzav) SafeParcelReader.e(parcel, i12, zzav.CREATOR);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    zzawVarArr = (zzaw[]) SafeParcelReader.i(parcel, i12, zzaw.CREATOR);
                    break;
                case 5:
                    zzatVarArr = (zzat[]) SafeParcelReader.i(parcel, i12, zzat.CREATOR);
                    break;
                case 6:
                    strArrG = SafeParcelReader.g(parcel, i12);
                    break;
                case 7:
                    zzaoVarArr = (zzao[]) SafeParcelReader.i(parcel, i12, zzao.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzar(zzavVar, strF, strF2, zzawVarArr, zzatVarArr, strArrG, zzaoVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzar[i12];
    }
}
