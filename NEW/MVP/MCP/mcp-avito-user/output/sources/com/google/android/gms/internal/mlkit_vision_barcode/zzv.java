package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        String strF12 = null;
        String strF13 = null;
        String strF14 = null;
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
                    strF6 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    strF7 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    strF8 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\n':
                    strF9 = SafeParcelReader.f(parcel, i12);
                    break;
                case 11:
                    strF10 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\f':
                    strF11 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\r':
                    strF12 = SafeParcelReader.f(parcel, i12);
                    break;
                case 14:
                    strF13 = SafeParcelReader.f(parcel, i12);
                    break;
                case 15:
                    strF14 = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzi(strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, strF9, strF10, strF11, strF12, strF13, strF14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzi[i12];
    }
}
