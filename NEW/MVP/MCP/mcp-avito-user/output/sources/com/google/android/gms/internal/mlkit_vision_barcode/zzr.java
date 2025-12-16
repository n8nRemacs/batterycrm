package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        int iS3 = 0;
        boolean zL2 = false;
        String strF = null;
        String strF2 = null;
        Point[] pointArr = null;
        zzj zzjVar = null;
        zzm zzmVar = null;
        zzn zznVar = null;
        zzp zzpVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzg zzgVar = null;
        zzh zzhVar = null;
        zzi zziVar = null;
        byte[] bArrC = null;
        double dN2 = 0.0d;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 2:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.i(parcel, i12, Point.CREATOR);
                    break;
                case 7:
                    zzjVar = (zzj) SafeParcelReader.e(parcel, i12, zzj.CREATOR);
                    break;
                case '\b':
                    zzmVar = (zzm) SafeParcelReader.e(parcel, i12, zzm.CREATOR);
                    break;
                case '\t':
                    zznVar = (zzn) SafeParcelReader.e(parcel, i12, zzn.CREATOR);
                    break;
                case '\n':
                    zzpVar = (zzp) SafeParcelReader.e(parcel, i12, zzp.CREATOR);
                    break;
                case 11:
                    zzoVar = (zzo) SafeParcelReader.e(parcel, i12, zzo.CREATOR);
                    break;
                case '\f':
                    zzkVar = (zzk) SafeParcelReader.e(parcel, i12, zzk.CREATOR);
                    break;
                case '\r':
                    zzgVar = (zzg) SafeParcelReader.e(parcel, i12, zzg.CREATOR);
                    break;
                case 14:
                    zzhVar = (zzh) SafeParcelReader.e(parcel, i12, zzh.CREATOR);
                    break;
                case 15:
                    zziVar = (zzi) SafeParcelReader.e(parcel, i12, zzi.CREATOR);
                    break;
                case 16:
                    bArrC = SafeParcelReader.c(parcel, i12);
                    break;
                case 17:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case 18:
                    dN2 = SafeParcelReader.n(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzq(iS2, strF, strF2, iS3, pointArr, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar, bArrC, zL2, dN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzq[i12];
    }
}
