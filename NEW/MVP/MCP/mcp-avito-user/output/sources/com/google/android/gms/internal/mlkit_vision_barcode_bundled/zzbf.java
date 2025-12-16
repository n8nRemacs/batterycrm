package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzbf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        zzap zzapVar = null;
        zzap zzapVar2 = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF4 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    strF5 = SafeParcelReader.f(parcel, i12);
                    break;
                case 6:
                    zzapVar = (zzap) SafeParcelReader.e(parcel, i12, zzap.CREATOR);
                    break;
                case 7:
                    zzapVar2 = (zzap) SafeParcelReader.e(parcel, i12, zzap.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzaq(strF, strF2, strF3, strF4, strF5, zzapVar, zzapVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzaq[i12];
    }
}
