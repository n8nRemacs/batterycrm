package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        int iS3 = 0;
        String strF = null;
        String strF2 = null;
        byte[] bArrC = null;
        Point[] pointArr = null;
        zzat zzatVar = null;
        zzaw zzawVar = null;
        zzax zzaxVar = null;
        zzaz zzazVar = null;
        zzay zzayVar = null;
        zzau zzauVar = null;
        zzaq zzaqVar = null;
        zzar zzarVar = null;
        zzas zzasVar = null;
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
                    zzatVar = (zzat) SafeParcelReader.e(parcel, i12, zzat.CREATOR);
                    break;
                case '\b':
                    zzawVar = (zzaw) SafeParcelReader.e(parcel, i12, zzaw.CREATOR);
                    break;
                case '\t':
                    zzaxVar = (zzax) SafeParcelReader.e(parcel, i12, zzax.CREATOR);
                    break;
                case '\n':
                    zzazVar = (zzaz) SafeParcelReader.e(parcel, i12, zzaz.CREATOR);
                    break;
                case 11:
                    zzayVar = (zzay) SafeParcelReader.e(parcel, i12, zzay.CREATOR);
                    break;
                case '\f':
                    zzauVar = (zzau) SafeParcelReader.e(parcel, i12, zzau.CREATOR);
                    break;
                case '\r':
                    zzaqVar = (zzaq) SafeParcelReader.e(parcel, i12, zzaq.CREATOR);
                    break;
                case 14:
                    zzarVar = (zzar) SafeParcelReader.e(parcel, i12, zzar.CREATOR);
                    break;
                case 15:
                    zzasVar = (zzas) SafeParcelReader.e(parcel, i12, zzas.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzba(iS2, strF, strF2, bArrC, pointArr, iS3, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzba[i12];
    }
}
