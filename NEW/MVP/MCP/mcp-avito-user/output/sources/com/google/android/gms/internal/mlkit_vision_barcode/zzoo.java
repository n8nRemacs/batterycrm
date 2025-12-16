package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzoo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        int iS3 = 0;
        String strF = null;
        String strF2 = null;
        byte[] bArrC = null;
        Point[] pointArr = null;
        zzog zzogVar = null;
        zzoj zzojVar = null;
        zzok zzokVar = null;
        zzom zzomVar = null;
        zzol zzolVar = null;
        zzoh zzohVar = null;
        zzod zzodVar = null;
        zzoe zzoeVar = null;
        zzof zzofVar = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    bArrC = SafeParcelReader.c(parcel, i12);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.i(parcel, i12, Point.CREATOR);
                    break;
                case 6:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 7:
                    zzogVar = (zzog) SafeParcelReader.e(parcel, i12, zzog.CREATOR);
                    break;
                case '\b':
                    zzojVar = (zzoj) SafeParcelReader.e(parcel, i12, zzoj.CREATOR);
                    break;
                case '\t':
                    zzokVar = (zzok) SafeParcelReader.e(parcel, i12, zzok.CREATOR);
                    break;
                case '\n':
                    zzomVar = (zzom) SafeParcelReader.e(parcel, i12, zzom.CREATOR);
                    break;
                case 11:
                    zzolVar = (zzol) SafeParcelReader.e(parcel, i12, zzol.CREATOR);
                    break;
                case '\f':
                    zzohVar = (zzoh) SafeParcelReader.e(parcel, i12, zzoh.CREATOR);
                    break;
                case '\r':
                    zzodVar = (zzod) SafeParcelReader.e(parcel, i12, zzod.CREATOR);
                    break;
                case 14:
                    zzoeVar = (zzoe) SafeParcelReader.e(parcel, i12, zzoe.CREATOR);
                    break;
                case 15:
                    zzofVar = (zzof) SafeParcelReader.e(parcel, i12, zzof.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzon(iS2, strF, strF2, bArrC, pointArr, iS3, zzogVar, zzojVar, zzokVar, zzomVar, zzolVar, zzohVar, zzodVar, zzoeVar, zzofVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzon[i12];
    }
}
