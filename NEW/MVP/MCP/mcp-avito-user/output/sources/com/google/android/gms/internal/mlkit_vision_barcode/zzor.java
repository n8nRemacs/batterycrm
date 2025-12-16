package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzor implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        int iS5 = 0;
        int iS6 = 0;
        int iS7 = 0;
        boolean zL2 = false;
        String strF = null;
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
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 4:
                    iS5 = SafeParcelReader.s(parcel, i12);
                    break;
                case 5:
                    iS6 = SafeParcelReader.s(parcel, i12);
                    break;
                case 6:
                    iS7 = SafeParcelReader.s(parcel, i12);
                    break;
                case 7:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\b':
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new zzoc(iS2, iS3, iS4, iS5, iS6, iS7, zL2, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new zzoc[i12];
    }
}
