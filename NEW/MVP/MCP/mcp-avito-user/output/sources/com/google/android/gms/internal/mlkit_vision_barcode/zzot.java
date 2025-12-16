package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzot implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        zzoi zzoiVar = null;
        String strF = null;
        String strF2 = null;
        zzoj[] zzojVarArr = null;
        zzog[] zzogVarArr = null;
        String[] strArrG = null;
        zzob[] zzobVarArr = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    zzoiVar = (zzoi) SafeParcelReader.e(parcel, i12, zzoi.CREATOR);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    zzojVarArr = (zzoj[]) SafeParcelReader.i(parcel, i12, zzoj.CREATOR);
                    break;
                case 5:
                    zzogVarArr = (zzog[]) SafeParcelReader.i(parcel, i12, zzog.CREATOR);
                    break;
                case 6:
                    strArrG = SafeParcelReader.g(parcel, i12);
                    break;
                case 7:
                    zzobVarArr = (zzob[]) SafeParcelReader.i(parcel, i12, zzob.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzoe(zzoiVar, strF, strF2, zzojVarArr, zzogVarArr, strArrG, zzobVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzoe[i12];
    }
}
